package org.example.lesson_6

fun main() {
    println("Пройдите регистрацию.")

    println("Придумайте логин:")
    val userLogin = readln()

    println("Придумайте пароль:")
    val userPassword = readln()

    println("Теперь авторизуйтесь")
    var isAutirized = false

    while (!isAutirized) {
        println("Введите логин:")
        val login = readln()

        println("Введите пароль")
        val password = readln()

        if (login == userLogin && password == userPassword) {
            println("Авторизация прошла успешно!")

            isAutirized = true
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    }

}