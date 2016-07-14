package com.epam.training.hadoop.mr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MaxWordLengthReducer extends Reducer<IntWritable, Text, IntWritable, Text> {

    private Set<String> uniqueWords;

    @Override
    public void reduce(IntWritable key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {

        if (uniqueWords == null) {

            uniqueWords = new HashSet<String>();

            for (Text words : values) {
                for (String word : words.toString().split(MaxWordLengthMapper.DELIMITER)) {
                    uniqueWords.add(word);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (String uniqueWord : uniqueWords) {
                sb.append(uniqueWord.toString()).append(MaxWordLengthMapper.DELIMITER);
            }

            sb.setLength(sb.length() - 1);

            context.write(new IntWritable(-1 * key.get()), new Text(sb.toString()));
        }
    }

}
