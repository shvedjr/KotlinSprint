package org.example.lesson_6

fun main() {

    println("Введи количество секунд для таймера:")
    var timer = readln().toInt()

    var remainingTime = timer
    while (remainingTime > 0) {
        Thread.sleep(1000)
        remainingTime--
    }
    println("Прошло секунд: $timer")
}