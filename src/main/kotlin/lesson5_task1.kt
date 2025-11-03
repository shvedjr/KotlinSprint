package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val firstNumder = Random.nextInt(0, 9)
    val secondNumber = Random.nextInt(0, 9)

    print("Введи результат: $firstNumder + $secondNumber = ")
    val captcha = readln().toInt()

    if (captcha == firstNumder + secondNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён!")
    }

}

const val AGE_OF_MAJORITY = 18