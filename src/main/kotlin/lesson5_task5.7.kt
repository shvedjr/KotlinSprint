package org.example.lesson_5

fun main() {

    println("Для расчета затрат на поездку введите данные:")
    println("Расстояние поездки (в киломентрах):")
    val distance = readln().toDouble()

    println("Расход топлива на 100км (в литрах):")
    val fuelPer100 = readln().toDouble()

    println("Текущая цена в рублях за литр топлива:")
    val fuelPrice = readln().toDouble()

    //Затем рассчитай общую стоимость топлива по формуле: Стоимость = топливо × цена за литр.
    val totalFuel = (distance * fuelPer100) / 100
    val totalPrice = totalFuel * fuelPrice
    println("Всего литров топлива: ${"%.2f".format(totalFuel)}")
    println("Общая стоимость топлива: ${"%.2f".format(totalPrice)} руб.")

}