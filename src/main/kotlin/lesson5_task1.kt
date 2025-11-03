package org.example.lesson_5

fun main() {

    val firstNumder = (0..9).random()
    val secondNumber = (0..9).random()

    print("Введи результат: $firstNumder + $secondNumber = ")
    val captcha = readln().toInt()

    if (captcha == firstNumder + secondNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён!")
    }

}

const val AGE_OF_MAJORITY = 18