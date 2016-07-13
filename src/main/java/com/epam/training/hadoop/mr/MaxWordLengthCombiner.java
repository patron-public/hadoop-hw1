package com.epam.training.hadoop.mr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MaxWordLengthCombiner extends Reducer<IntWritable, Text, IntWritable, Text> {

    @Override
    public void reduce(IntWritable key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {

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

        context.write(key, new Text(sb.toString()));
    }

}