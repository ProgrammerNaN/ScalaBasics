package lectures.week2oop

object OOPBasic extends App {
  val student = new Student(0, "Denis")
  println(student.name)
  println(student.uni)
}

class Student(id: Int, val name: String) {
  val uni = "University"
}
