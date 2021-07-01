package retail_db

import org.apache.spark.sql.SparkSession


object GetRevenuePerOrder {
  val spark = SparkSession.builder()
     .appName("HelloSpark")
     .master("local[2]")
     .getOrCreate()

  def main(args: Array[String]): Unit = {

      println("Hello, Kannan")


    val df = spark.read
      .format("csv")
      .option("inferSchema", true)
      .option("header", true)
      .load("data/FL_insurance.csv")

    df.show()

  }

}
