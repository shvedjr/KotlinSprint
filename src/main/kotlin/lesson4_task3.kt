package org.example.lesson_4

const val SUN_WEATHER: Boolean = true
const val OPEN_TENT: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val VALID_SEASON: String = "зима"

fun main() {

    var weather = true
    var tent = true
    var humidity = 20
    var season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${weather == SUN_WEATHER && tent == OPEN_TENT && humidity == AIR_HUMIDITY && season == VALID_SEASON}")

}