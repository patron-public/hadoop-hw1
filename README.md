# hadoop-hw1
BUILD WITH MAVEN:
mvn assembly:assembly

RUN WITH:
yarn jar hw1-1.0.jar com.epam.training.hadoop.mr.MaxWordLengthDriver /training/hadoop/hw1/input /training/hadoop/hw1/output

//OUTPUT: 3 files, 4.5Gb
[hdfs@sandbox hw1]$ yarn jar hw1-1.0.jar com.epam.training.hadoop.mr.MaxWordLengthDriver /training/hadoop/hw1/inp
ut /training/hadoop/hw1/output
16/07/14 09:23:52 INFO impl.TimelineClientImpl: Timeline service address: http://sandbox.hortonworks.com:8188/ws/
v1/timeline/
16/07/14 09:23:52 INFO client.RMProxy: Connecting to ResourceManager at sandbox.hortonworks.com/10.0.2.15:8032
16/07/14 09:23:52 WARN mapreduce.JobResourceUploader: Hadoop command-line option parsing not performed. Implement
 the Tool interface and execute your application with ToolRunner to remedy this.
16/07/14 09:23:53 INFO input.FileInputFormat: Total input paths to process : 3
16/07/14 09:23:53 INFO mapreduce.JobSubmitter: number of splits:36
16/07/14 09:23:53 INFO mapreduce.JobSubmitter: Submitting tokens for job: job_1468420049246_0021
16/07/14 09:23:54 INFO impl.YarnClientImpl: Submitted application application_1468420049246_0021
16/07/14 09:23:54 INFO mapreduce.Job: The url to track the job: http://sandbox.hortonworks.com:8088/proxy/applica
tion_1468420049246_0021/
16/07/14 09:23:54 INFO mapreduce.Job: Running job: job_1468420049246_0021
16/07/14 09:24:00 INFO mapreduce.Job: Job job_1468420049246_0021 running in uber mode : false
16/07/14 09:24:00 INFO mapreduce.Job:  map 0% reduce 0%
16/07/14 09:24:11 INFO mapreduce.Job:  map 3% reduce 0%
16/07/14 09:24:19 INFO mapreduce.Job:  map 6% reduce 0%
16/07/14 09:24:27 INFO mapreduce.Job:  map 8% reduce 0%
16/07/14 09:24:36 INFO mapreduce.Job:  map 11% reduce 0%
16/07/14 09:24:44 INFO mapreduce.Job:  map 14% reduce 0%
16/07/14 09:24:52 INFO mapreduce.Job:  map 17% reduce 0%
16/07/14 09:25:00 INFO mapreduce.Job:  map 19% reduce 0%
16/07/14 09:25:08 INFO mapreduce.Job:  map 22% reduce 0%
16/07/14 09:25:17 INFO mapreduce.Job:  map 25% reduce 0%
16/07/14 09:25:25 INFO mapreduce.Job:  map 28% reduce 0%
16/07/14 09:25:33 INFO mapreduce.Job:  map 31% reduce 0%
16/07/14 09:25:43 INFO mapreduce.Job:  map 33% reduce 0%
16/07/14 09:25:53 INFO mapreduce.Job:  map 36% reduce 0%
16/07/14 09:26:00 INFO mapreduce.Job:  map 39% reduce 0%
16/07/14 09:26:09 INFO mapreduce.Job:  map 42% reduce 0%
16/07/14 09:26:17 INFO mapreduce.Job:  map 44% reduce 0%
16/07/14 09:26:25 INFO mapreduce.Job:  map 47% reduce 0%
16/07/14 09:26:33 INFO mapreduce.Job:  map 50% reduce 0%
16/07/14 09:26:40 INFO mapreduce.Job:  map 53% reduce 0%
16/07/14 09:26:48 INFO mapreduce.Job:  map 56% reduce 0%
16/07/14 09:26:57 INFO mapreduce.Job:  map 58% reduce 0%
16/07/14 09:27:05 INFO mapreduce.Job:  map 61% reduce 0%
16/07/14 09:27:13 INFO mapreduce.Job:  map 64% reduce 0%
16/07/14 09:27:21 INFO mapreduce.Job:  map 67% reduce 0%
16/07/14 09:27:30 INFO mapreduce.Job:  map 69% reduce 0%
16/07/14 09:27:38 INFO mapreduce.Job:  map 72% reduce 0%
16/07/14 09:27:46 INFO mapreduce.Job:  map 75% reduce 0%
16/07/14 09:27:53 INFO mapreduce.Job:  map 78% reduce 0%
16/07/14 09:28:02 INFO mapreduce.Job:  map 81% reduce 0%
16/07/14 09:28:10 INFO mapreduce.Job:  map 83% reduce 0%
16/07/14 09:28:17 INFO mapreduce.Job:  map 86% reduce 0%
16/07/14 09:28:25 INFO mapreduce.Job:  map 89% reduce 0%
16/07/14 09:28:33 INFO mapreduce.Job:  map 92% reduce 0%
16/07/14 09:28:40 INFO mapreduce.Job:  map 94% reduce 0%
16/07/14 09:28:46 INFO mapreduce.Job:  map 97% reduce 0%
16/07/14 09:28:51 INFO mapreduce.Job:  map 100% reduce 0%
16/07/14 09:28:55 INFO mapreduce.Job:  map 100% reduce 100%
16/07/14 09:28:56 INFO mapreduce.Job: Job job_1468420049246_0021 completed successfully
16/07/14 09:28:57 INFO mapreduce.Job: Counters: 50
        File System Counters
                FILE: Number of bytes read=10705
                FILE: Number of bytes written=4936264
                FILE: Number of read operations=0
                FILE: Number of large read operations=0
                FILE: Number of write operations=0
                HDFS: Number of bytes read=4518944042
                HDFS: Number of bytes written=358
                HDFS: Number of read operations=111
                HDFS: Number of large read operations=0
                HDFS: Number of write operations=2
        Job Counters 
                Launched map tasks=36
                Launched reduce tasks=1
                Data-local map tasks=36
                Total time spent by all maps in occupied slots (ms)=716526
                Total time spent by all reduces in occupied slots (ms)=9249
                Total time spent by all map tasks (ms)=238842
                Total time spent by all reduce tasks (ms)=3083
                Total vcore-seconds taken by all map tasks=238842
                Total vcore-seconds taken by all reduce tasks=3083
                Total megabyte-seconds taken by all map tasks=366861312
                Total megabyte-seconds taken by all reduce tasks=4735488
        Map-Reduce Framework
                Map input records=14343448
                Map output records=14343426
                Map output bytes=1349298820
                Map output materialized bytes=10915
                Input split bytes=4645
                Combine input records=14343426
                Combine output records=36
                Reduce input groups=7
                Reduce shuffle bytes=10915
                Reduce input records=36
                Reduce output records=1
                Spilled Records=72
                Shuffled Maps =36
                Failed Shuffles=0
                Merged Map outputs=36
                GC time elapsed (ms)=20014
                CPU time spent (ms)=178790
                Physical memory (bytes) snapshot=43419844608
                Virtual memory (bytes) snapshot=72418263040
                Total committed heap usage (bytes)=45927104512
        Shuffle Errors
                BAD_ID=0
                CONNECTION=0
                IO_ERROR=0
                WRONG_LENGTH=0
                WRONG_MAP=0
                WRONG_REDUCE=0
        com.epam.training.hadoop.mr.MaxWordLengthMapper$MAPPER_STATS
                EMPTY_LINE=22
        File Input Format Counters 
                Bytes Read=4518939397
        File Output Format Counters 
                Bytes Written=358
