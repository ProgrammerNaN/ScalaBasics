package playground

object classes extends App {

}

class Instructor(val id:Int, val name:String, val surname:String) {

  def getName():String = name.substring(0, 1).toUpperCase + name.substring(1, name.length).toLowerCase

  def getSurname():String = surname.substring(0, 1).toUpperCase + (surname.substring(1, surname.length).toLowerCase)

  def getFullName():String = s"${this.getName()} ${this.getSurname()}"
}

class Course(val courseId:Int, val title:String, val releaseYear:String, instructor:Instructor) {
  def this(releaseYear:String) = this(this.courseId, this.title, releaseYear, this.instructor)
  def getId():String = s"${this.courseId}${this.instructor.id}"
  def isTaughtBy(instructor:Instructor):Boolean = this.instructor == instructor
  def copyCourse(newReleaseYear:String) = new Course(newReleaseYear)
}
