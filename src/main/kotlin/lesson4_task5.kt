package org.example.lesson_4

fun main() {

    println("Введите данные для получения разрешения на выход в море:")

    print("Наличие повреждений корпуса true/false: ")
    val isShipDamage = readln().toBoolean()

    print("Текущий состав экипажа: ")
    val numberOfCrew = readln().toInt()

    print("Количество ящиков с провизией на борту: ")
    val provisionsBox = readln().toInt()

    print("Благоприятность метеоусловий: ")
    val isWeather = readln().toBoolean()

    val isCanSail = (isShipDamage == false && numberOfCrew >= 55 && numberOfCrew <= 70 && provisionsBox > 50)
            || (isShipDamage == true && numberOfCrew == 70 && isWeather == true && provisionsBox >= 50)

    println("Кораблю разрешено отправиться в плавание: $isCanSail")
}