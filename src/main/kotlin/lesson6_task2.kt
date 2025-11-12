package org.example.lesson_6

fun main() {

    println("Введи количество секунд для таймера:")
    var timer = readln().toInt()

    Thread.sleep(timer * 1000L)

    println("Прошло секунд: $timer")
}