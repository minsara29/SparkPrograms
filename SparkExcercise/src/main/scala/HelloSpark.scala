import org.apache.log4j.Logger
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

import java.util.Properties
import scala.io.Source

object HelloSpark extends Serializable {

  @transient lazy val logger: Logger = Logger.getLogger(getClass.getName)

  def main(args: Array[String]): Unit = {
    logger.info("Starting Hello Spark")


    val spark = SparkSession.builder()
      .config(getSparkConf)
      .getOrCreate()
//      .appName("HelloSpark")
//      .master("local[3]")


    println("Starting HelloSpark")

    logger.info("Finished Hello Spark")

    spark.stop()
    println("Finishing HelloSpark")

  }

  def getSparkConf():SparkConf = {
    val conf = new SparkConf()

    val probs = new Properties

    probs.load(Source.fromFile("spark.conf").bufferedReader())
    probs.forEach((k,v)=> conf.set(k.toString, v.toString))
    conf
  }

}
