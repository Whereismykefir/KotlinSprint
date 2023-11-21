package lesson_1

fun main() {
    var seconds = 6480
    var minutes = seconds / 60
    var hours = minutes / 60

    println("0${hours}:${minutes % 60}:${seconds % 60}0 ")
}
