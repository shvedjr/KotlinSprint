package org.example.lesson_2

fun main() {

    val allStudents: Float = 4.00f  //Всего учеников
    val student1: Float = 3.00f //Оценка первого ученика по профильному предмету
    val student2: Float = 4.00f  //Оценка второго ученика по профильному предмету
    val student3: Float = 3.00f  //Оценка третьего ученика по профильному предмету
    val student4: Float = 5.00f   //Оценка четвёртого ученика по профильному предмету

    val sum: Float = (student1 + student2 + student3 + student4) / allStudents

    println(sum)
}