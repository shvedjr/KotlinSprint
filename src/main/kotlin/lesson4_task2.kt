package org.example.lesson_4

const val AVERAGE_WEIGHT_LOW = 35
const val AVERAGE_WEIGHT_HIGH = 100
const val AVERAGE_VOLUME = 100

fun main() {

    var checkCargoWeight = 20
    var checkVolume = 80

    println(
        "Груз с весом ${checkCargoWeight}кг и объемом ${checkVolume}л соответсвует категории 'Average': " +
                "${
                    checkCargoWeight > AVERAGE_WEIGHT_LOW && checkCargoWeight <= AVERAGE_WEIGHT_HIGH
                            && checkVolume < AVERAGE_VOLUME
                }"
    )

    checkCargoWeight = 50
    checkVolume = 100

    println(
        "Груз с весом ${checkCargoWeight}кг и объемом ${checkVolume}л соответсвует категории 'Average': " +
                "${
                    checkCargoWeight > AVERAGE_WEIGHT_LOW && checkCargoWeight <= AVERAGE_WEIGHT_HIGH
                            && checkVolume < AVERAGE_VOLUME
                }"
    )
}