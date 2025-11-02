package org.example.lesson_5

fun main() {

    print("Введи результат: 3 + 4 = ")
    val captcha = readln().toInt()

    if (captcha == 7) {
        println("Добро подаловать!")
    } else {
        println("Доступ запрещён!")
    }

}

const val AGE_OF_MAJORITY = 18