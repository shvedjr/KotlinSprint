package org.example.lesson_7

fun main() {

    println("Введи любое число:")
    val userNumber = readln().toInt()

    for (number in 0..userNumber) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}

