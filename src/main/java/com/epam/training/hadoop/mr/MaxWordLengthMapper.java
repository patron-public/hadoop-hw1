package com.epam.training.hadoop.mr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MaxWordLengthMapper extends Mapper<LongWritable, Text, IntWritable, Text> {

    public static final String DELIMITER = ";";
    private static final String SPLIT_REGEX = "\\W";

    private StringBuilder sb = new StringBuilder();
    private Set<String> longWords = new HashSet<String>();

    public enum MAPPER_STATS {
        EMPTY_LINE
    }

    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        String line = value.toString();
        int wordLen = 0;
        String[] words = line.split(SPLIT_REGEX);

        for (String word : words) {

            if (word.length() < wordLen)
                continue;

            if (word.length() > wordLen) {
                longWords.clear();
                wordLen = word.length();
            }

            longWords.add(word);

        }

        if (wordLen > 0) {
            sb.setLength(0);
            for (String longWord : longWords) {
                sb.append(longWord).append(DELIMITER);
            }
            context.write(new IntWritable(-1 * wordLen), new Text(sb.toString()));

        } else {
            context.getCounter(MAPPER_STATS.EMPTY_LINE).increment(1);
        }


    }
}
