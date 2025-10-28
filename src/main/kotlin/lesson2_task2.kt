package org.example.lesson_2

fun main() {

    val permanentEmployees: Short = 50
    val permanentSalary: Short = 30000
    val internEmployees: Short = 30
    val internSalary: Short = 20000

    println(permanentEmployees * permanentSalary)
    val totalPermanentSalary: Int = 1500000

    println(internEmployees * internSalary + totalPermanentSalary)
    val totalEmployeesSalary: Int = 2100000

    println((totalEmployeesSalary) / (permanentEmployees + internEmployees))
    val averageSalary: Short = 26250

}