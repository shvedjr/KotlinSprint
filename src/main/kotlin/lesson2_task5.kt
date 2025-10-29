package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val clientStartPeriod: Int = 70000
    val creditPeriod: Int = 20
    val percentPerYearCredit: Double = 16.7 / 100

    val clientEndOfPeriod: Double = clientStartPeriod * (1 + percentPerYearCredit / 1).pow(1 * creditPeriod)

    println("%.3f".format(clientEndOfPeriod))
}