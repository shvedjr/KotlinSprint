package org.example.lesson_4

const val AVERAGE_WEIGHT_LOW = 35
const val AVERAGE_WEIGHT_HIGH = 100
const val AVERAGE_VOLUME = 100

fun main() {

    var checkCargoWeight = 20
    var checkVolume = 80

    println(
        "Груз с весом 20кг и объемом 80л соответсвует категории 'Average': " +
                "${
                    checkCargoWeight > AVERAGE_WEIGHT_LOW && checkCargoWeight <= AVERAGE_WEIGHT_HIGH
                            && checkVolume < AVERAGE_VOLUME
                }"
    )

    checkCargoWeight = 50
    checkVolume = 100

    println(
        "Груз с весом 50кг и объемом 100л соответсвует категории 'Average': " +
                "${
                    checkCargoWeight > AVERAGE_WEIGHT_LOW && checkCargoWeight <= AVERAGE_WEIGHT_HIGH
                            && checkVolume < AVERAGE_VOLUME
                }"
    )
}