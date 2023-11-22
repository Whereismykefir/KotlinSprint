package lesson_2

fun main() {
    val startTime = 9 * oneMinute + 39
    val wayTime = 457

    val finishHours = ( startTime + wayTime ) / oneMinute
    val finishMinutes = ( startTime + wayTime ) % oneMinute

    println("$finishHours:$finishMinutes")

}
const val oneMinute = 60