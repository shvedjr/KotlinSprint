package org.example.lesson_5

fun main() {

    val validLoginUser1 = "Zaphod"
    val validPasswordUser1 = "PanGalactic"

    println("Введите своё имя пользователя")
    println("Login: ")

    val login = readln().toString()

    val resultLogin = if (login == validLoginUser1) {
        println("Password: ")
    } else {
        println("Пользователь не найден")
        return
    }
    val password = readln().toString()
    val resultPassword = if (password == validPasswordUser1) {
        println("Добро пожаловать на HEART OF GOLD!")
    } else {
        println("Вы ввели неправильный пароль")
    }
}