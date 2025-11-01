package org.example.lesson_4

fun main() {

    val dayOfTraining = 5

    var hands: Boolean = !(dayOfTraining % 2 == 0)
    var legs: Boolean = dayOfTraining % 2 == 0
    var back: Boolean = dayOfTraining % 2 == 0
    var press: Boolean = !(dayOfTraining % 2 == 0)

    var todayTraining = """Упражнения для рук: $hands
       |Упражнения для ног: $legs
       |Упражнения для спины: $back
       |Упражнения для пресса: $press
   """.trimMargin()

    println(todayTraining)
}