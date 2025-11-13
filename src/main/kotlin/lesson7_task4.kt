package org.example.lesson_7

fun main() {

    println("Введи количество секунд:")
    val userSeconds = readln().toInt()

    for (i in userSeconds downTo 1) {
        println("Осталось секунд $i")
        Thread.sleep(1000)
    }
    println("Время вышло!")
}

