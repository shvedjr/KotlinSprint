package org.example.lesson_2

fun main() {

    val departureTimeHours: Int = 9
    val departureTimeMinutes: Int = 39

    val travelTime: Int = 457 //минут в пути

    val totalDepartureMinutes: Int = departureTimeHours * 60 + departureTimeMinutes //Время отправления в минутах

    val arrivalTotalMinutes: Int = totalDepartureMinutes + travelTime

    val arrivalHours: Int = arrivalTotalMinutes / 60 //17 часов время прибытия
    val arrivalMinutes: Int = arrivalTotalMinutes % 60 // остаток минут прибытия

  println("%02d:%02d".format(arrivalHours, arrivalMinutes))




}
