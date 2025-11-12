package org.example.lesson_7

fun main() {
    var password = ""

    println("Сгенерировать пароль yes/no?")
    val answer = readln()

    if (answer == "yes") {
        for (i in 0..5) {
            if (i % 2 == 0) {
                password += ('a'..'z').random()
            } else {
                password += ('0'..'9').random()
            }
        }
        println("Пароль: $password")
    } else {
        println("Выход")
    }
}