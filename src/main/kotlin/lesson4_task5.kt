package org.example.lesson_4

const val AVERAGE_WEIGHT_LOW = 35
const val AVERAGE_WEIGHT_HIGH = 100
const val AVERAGE_VOLUME = 100

fun main() {

  var checkCargoWeight = 20
  var average = checkCargoWeight > AVERAGE_WEIGHT_LOW && checkCargoWeight <= AVERAGE_WEIGHT_HIGH
println("Груз №1 с весом 20кг не соответсвует категории 'Average': $average")

    checkCargoWeight = 50
  var checkVolume = 80
    average = checkCargoWeight > AVERAGE_WEIGHT_LOW && checkCargoWeight <= AVERAGE_WEIGHT_HIGH && checkVolume < AVERAGE_VOLUME
println("Груз №2 с весом 50кг и объемом 80 литров соответсвует категории 'Average':$average")

    checkVolume = 100
    average = checkVolume < AVERAGE_VOLUME
println("Груз №3 с объемом 100л не соответсвует категории 'Average': $average")
}