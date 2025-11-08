package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val validRandomNumber1 = Random.nextInt(42)
    val validRandomNumber2 = Random.nextInt(42)
    val validRandomNumber3 = Random.nextInt(42)

    val validList = mutableListOf<Int>(validRandomNumber1, validRandomNumber2, validRandomNumber3)

    println("Угадайте три счастливые цифры от 0 до 42 и получите приз:")

    println("Введите первое число:")
    val userNumber1 = readln().toInt()

    println("Введите второе число:")
    val userNumber2 = readln().toInt()

    println("Введите третье число:")
    val userNumber3 = readln().toInt()

    val userList = mutableListOf<Int>(userNumber1, userNumber2, userNumber3)

    val matches = validList.intersect(userList)

    println("Ваши числа: $userList")
    println("Выигрышные числа: $validList")
    println("Совпадений: $matches")
    println("Количетсво совпадений: ${matches.size}")

    if (matches.size == 1) {
        println("Поздравляем, Вы выйграли утешительный приз!")
    } else if (matches.size == 2) {
        println("Поздравляем, Вы выиграли крупный приз!!")
    } else if (matches.size == 3) {
        println("Поздравляем, Вы выиграли ДЖЕКПОТ!")
    } else {
        println("К сожалению вы не угадали ни одно число!")
    }
}


