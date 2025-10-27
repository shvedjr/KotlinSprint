package org.example.lesson_1

const val SecondsInHour = 3600
const val SecondsInMinute = 60

fun main() {

    val totalSeconds: Short = 6480

    val hours: Int = totalSeconds / 3600
    val minutes: Int = (totalSeconds % 3600) / 60
    val seconds: Int = totalSeconds % 60

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}
