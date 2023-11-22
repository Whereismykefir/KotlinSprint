package lesson_1

fun main() {
    var seconds = 6480
    var minutes = ( seconds / 60 ) % 60
    var hours = seconds / 3600
    seconds = seconds % 60

    val timeInSpace = "%02d:%02d:%02d".format(hours, minutes, seconds)

    println(timeInSpace)
}
