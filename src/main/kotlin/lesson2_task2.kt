package org.example.lesson_1

fun main() {

    val permanentEmployees: Short = 50   //Постоянных работников
    val permanentSalary: Short = 30000   //Зарплата постоянных работников
    val internEmployees: Short = 30      //Стажеров
    val internSalary: Short = 20000      //Заралата стажеров

    println(permanentEmployees * permanentSalary)
    val totalPermanentSalary: Int = 1500000   //Общий бюжет постоянных работников

    println(internEmployees * internSalary + totalPermanentSalary)
    val totalEmployeesSalary: Int = 2100000

    println((totalEmployeesSalary) / (permanentEmployees + internEmployees))
    val averageSalary: Short = 26250

}