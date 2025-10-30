package org.example.lesson_3

fun main() {

    val nextMoveSring: String = "D2-D4;0"

    val from: String = nextMoveSring.substring(0, 2)
    val to: String = nextMoveSring.substring(3, 5)
    val moveNumber: String = nextMoveSring.substring(6)

    println("Откуда:$from")
    println("Куда:$to")
    println("Номер хода:$moveNumber")
}