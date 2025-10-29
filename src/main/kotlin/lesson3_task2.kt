package org.example.lesson_3

fun main() {

    val firstName: String = "Татьяна"
    val middleName: String = "Сергеевна"
    var lastName: String = "Андреева"
    var age: String = "20"

    println("ФИО: $firstName $middleName $lastName, Возраст: $age лет")

    lastName = "Сидорова"
    age = "22"

    println("ФИО: $firstName $middleName $lastName, Возраст: $age лет")
}