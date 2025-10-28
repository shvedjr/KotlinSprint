package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {

    val departureTimeHours: Int = 9
    val departureTimeMinutes: Int = 39

    val travelTime: Int = 457 //минут в пути

    val totalDepartureMinutes: Int = departureTimeHours * MINUTES_IN_HOUR + departureTimeMinutes

    val arrivalTotalMinutes: Int = totalDepartureMinutes + travelTime

    val arrivalHours: Int = arrivalTotalMinutes / MINUTES_IN_HOUR
    val arrivalMinutes: Int = arrivalTotalMinutes % MINUTES_IN_HOUR

  println("%02d:%02d".format(arrivalHours, arrivalMinutes))




}
