package org.example.lesson_6

fun main() {

    println("Введи количество секунд для таймера:")
    var timer = readln().toInt()

    var remainingTime = timer
    while (remainingTime > 0) {
        println("Осталось секунл: ${remainingTime--}")
        Thread.sleep(1000)
    }
    println("Время вышло!")
}