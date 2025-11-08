package org.example.lesson_5

fun main() {

    println("Для расчета ИМТ введи: Свой рост в см")
    val hight = readln().toDouble()

    println("Теперь введите свой вес в кг")
    val weight = readln().toDouble()

    val resultFormula: Double = weight / ((hight / 100) * (hight / 100))
    println("Ваш ИМТ равен: ${"%.2f".format(resultFormula)}")

    when {
        resultFormula < 18.5 -> println("Недостаточная масса тела")
        resultFormula < 25 -> println("Нормальная масса тела")
        resultFormula < 30 -> println("Избыточная масса тела")
        else -> println("Ожирение")
    }
}