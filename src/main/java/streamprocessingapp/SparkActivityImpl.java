package streamprocessingapp;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.ConsumerStrategies;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.apache.spark.streaming.kafka010.LocationStrategies;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SparkActivityImpl implements SparkActivity {

    @Override
    public void processDataWithSpark() {
        // Implement Spark processing logic here
        // Example: Read from the file and process data using Spark
        SparkConf conf = new SparkConf().setAppName("DataProcessing").setMaster("local[*]");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> lines = sc.textFile("/Users/geethaanne/*");

        long count = lines.count();
        System.out.println("Number of lines in the file: " + count);

        sc.stop();
    }

}
