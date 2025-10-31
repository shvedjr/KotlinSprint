package org.example.lesson_3

fun main() {

    val nextMoveSring: String = "D2-D4;0"

    val allParts = nextMoveSring.split("-", ";")

    val from = allParts[0]
    val to = allParts[1]
    val moveNumber = allParts[2]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}