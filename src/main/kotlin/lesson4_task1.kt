package org.example.lesson_4

const val TOTAL_TABLES = 13

fun main() {

    val todayTables = 13
    val tomorrowTables = 9

    val avialableToday: Boolean = todayTables < TOTAL_TABLES
    val avialableTomorrow: Boolean = tomorrowTables < TOTAL_TABLES

    println("Доступность столиков на сегодня: $avialableToday\nДоступность столиков на завтра: $avialableTomorrow")

}