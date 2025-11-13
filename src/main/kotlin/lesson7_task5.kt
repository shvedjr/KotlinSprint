package org.example.lesson_7

fun main() {
    print("Введите длину пароля (минимум 6): ")
    val length = readln().toInt()

    if (length < 6) {
        println("Ошибка: минимум 6 символов!")
        return
    }

    var password = ""

    password += ('A'..'Z').random()
    password += ('a'..'z').random()
    password += ('0'..'9').random()

    for (i in 4..length) {
        password += when ((1..3).random()) {
            1 -> ('A'..'Z').random()
            2 -> ('a'..'z').random()
            else -> ('0'..'9').random()
        }
    }
    println("Пароль: ${password.toList().shuffled().joinToString("")}")
}