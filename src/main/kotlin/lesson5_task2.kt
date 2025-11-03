package org.example.lesson_5

import java.util.Calendar

const val AGE_OF_MAJORITY = 18

fun main() {

    val calendar = Calendar.getInstance()
    val presentYear = calendar.get(Calendar.YEAR)

    print("Введи свой год рождения: ")
    val captcha = readln().toInt()

    if (presentYear - captcha >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом!")
    } else {
        println("Доступ запрещён!")
    }

}