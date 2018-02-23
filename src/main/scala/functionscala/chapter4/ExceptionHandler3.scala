package functionscala.chapter4

/**
  * Created by yangqc on 2018/2/18.
  */
case class Employee(name: String, department: String)

object ExceptionHandler3 {

  def lookupByName(name: String): Option[Employee] = {
    if (name == null || "".equals(name)) {
      None
    } else {
      Some(Employee(name, "personal department"))
    }
  }

  def main(args: Array[String]): Unit = {
    val joeDepartment: Option[String] = lookupByName("Joe").map(_.department)
    val noneDepartment: Option[String] = lookupByName(null).map(_.department)
    println(joeDepartment.get)
    println(noneDepartment.get)
  }
}
