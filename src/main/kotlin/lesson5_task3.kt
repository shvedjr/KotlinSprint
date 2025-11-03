package org.example.lesson_5

fun main() {

    val validNumberOne = 23
    val validNumberTwo = 9

    println("Угадайте два числа от 0 до 42 для выигрыша в лотерее!")
    print("Первое число: ")
    val numberOneTry = readln().toInt()

    print("Второе число: ")
    val numberTwoTry = readln().toInt()

    val guessedFirst = numberOneTry == validNumberOne || numberOneTry == validNumberTwo
    val guessedSecond = numberTwoTry == validNumberOne || numberTwoTry == validNumberTwo

    if (guessedFirst && guessedSecond) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (guessedFirst || guessedSecond) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}