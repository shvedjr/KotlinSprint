package org.example.lesson_4

const val IS_SUNNY_WEATHER: Boolean = true
const val IS_OPEN_TENT: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val WRONG_SEASON: String = "зима"

fun main() {

    val isWeather = true
    val isTent = true
    val humidity = 20
    val season = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            isWeather == IS_SUNNY_WEATHER && isTent == IS_OPEN_TENT &&
                    humidity == AIR_HUMIDITY && season != WRONG_SEASON
        }"
    )

}