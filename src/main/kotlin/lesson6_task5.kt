package org.example.lesson_6

import kotlin.random.Random

fun main() {

    var userTries = 3

    println("Подтвердите, что вы не бот:")

    while (userTries > 0) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()

        println("Решите пример $number1 + $number2 = ...")

        println("Попытка ${4 - userTries}/3: ")
        val input = readln().toInt()
        if (input == number1 + number2) {
            println("Добро пожаловать!")
            return
        }
        userTries--
        println("Неверно")
    }
    println("К сожалению вы не прошли проверку!")
}

