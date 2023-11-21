package lesson_2

fun main() {
    val startTime = 9 * 60 + 39
    val wayTime = 457

    val finishHours = ( startTime + wayTime ) / 60
    val finishMinutes = ( startTime + wayTime ) % 60

    println("$finishHours:$finishMinutes")

}