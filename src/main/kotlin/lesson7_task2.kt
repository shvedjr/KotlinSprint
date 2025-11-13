package org.example.lesson_7

fun main() {
    var userCode: Int
    var randomSms: Int

    do {
        randomSms = (1000..9999).random()
        println("Ваш код авторизации: $randomSms")

        println("Введите свой код авторизации:")
        userCode = readln().toInt()

        if (userCode == randomSms) {
            println("Добро пожаловать!")
        } else {
            println("Неверный код! Попробуйте снова.")
        }
    } while (userCode != randomSms)
}