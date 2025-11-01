package org.example.lesson_4

const val SHIP_DAMAGE = false
const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val GOOD_WEATHER = true
const val MIN_PROVISIONS_BOX = 50

fun main() {

    val shipDamage = true
    val numberOfCrew = 58
    val weather = true
    val provisionsBox = 51

    println("Кораблю разрешено отправиться в плавание: ${(shipDamage == SHIP_DAMAGE || !shipDamage == SHIP_DAMAGE) && (numberOfCrew in MIN_NUMBER_OF_CREW .. MAX_NUMBER_OF_CREW) && (weather == GOOD_WEATHER) && (provisionsBox > MIN_PROVISIONS_BOX)}")
}