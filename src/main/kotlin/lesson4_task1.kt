package org.example.lesson_4

const val TOTAL_TABLES = 13

fun main() {

  val todayTables = 13
  val tomorrowTables = 9

  var comparisonResult: Boolean = todayTables < TOTAL_TABLES
println("Доступность столиков на сегодня: $comparisonResult")

  comparisonResult = tomorrowTables < TOTAL_TABLES
println("Доступность столиков на завтра: $comparisonResult")

}