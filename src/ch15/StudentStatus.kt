package ch15

enum class StudentStatus {
    NOT_ENROLLED,
    ACTIVE,
    GRADUATED;
    var courseId: String? = null // Used for ACTIVE only
}

class Student(var status: StudentStatus)

fun main(args: Array<String>) {
    val student = Student(StudentStatus.NOT_ENROLLED)
}

fun studentMessage(status: StudentStatus): String {
    return when (status) {
        StudentStatus.NOT_ENROLLED -> "Please choose a course."
        StudentStatus.ACTIVE -> "Welcome, student!"
        StudentStatus.GRADUATED -> "Congratulations!"
    }
}

sealed class StudentStatus2 {
    object NotEnrolled : StudentStatus2()
    class Active(val courseId: String): StudentStatus2()
    object Graduated: StudentStatus2()
}

fun studentMessage2(status: StudentStatus2): String{
    return when(status){
        is StudentStatus2.NotEnrolled -> "Please choose a course."
        is StudentStatus2.Active -> "You are enrolled in: ${status.courseId}"
        is StudentStatus2.Graduated -> "Congratulations!"
    }
}