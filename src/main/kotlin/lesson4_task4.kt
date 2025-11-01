package org.example.lesson_4

fun main() {

    val dayOfTraining = 5

    val isEven = dayOfTraining % 2 == 0

    val todayTraining = """Упражнения для рук: ${!isEven}
       |Упражнения для ног: $isEven
       |Упражнения для спины: $isEven
       |Упражнения для пресса: ${!isEven}
   """.trimMargin()

    println(todayTraining)
}