package com.epam.training.hadoop.mr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MaxWordLengthReducer extends Reducer<IntWritable, Text, IntWritable, Text> {

    private StringBuilder sb = new StringBuilder();

    private int wordLen = 0;

    @Override
    public void reduce(IntWritable key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {

        int len = key.get();

        if (len < wordLen)
            return;

        if (len > wordLen) {
            sb.setLength(0);
            wordLen = len;
        }

//        for (Text words : values) {
//            sb.append(words.toString());
//        }

        Set<String> uniqueWords = new HashSet<String>();
        for (Text words : values) {
            for (String word : words.toString().split(MaxWordLengthMapper.DELIMITER)) {
                if (word.length() > 0)
                    uniqueWords.add(word);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (String uniqueWord : uniqueWords) {
            sb.append(uniqueWord.toString()).append(MaxWordLengthMapper.DELIMITER);
        }

    }

    @Override
    protected void cleanup(Context context
    ) throws IOException, InterruptedException {
        if (wordLen > 0) {
            context.write(new IntWritable(wordLen), new Text(sb.toString()));
        }
    }
}
