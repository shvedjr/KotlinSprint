fun main() {
    val randomNumber = (1..9).random()
    var userTries = 5

    while (userTries > 0) {
        print("Попытка ${6 - userTries}/5: ")
        val userInput = readln()

        if (userInput.toInt() == randomNumber) {
            println("Это была великолепная игра!")
            return
        }

        userTries--
        println("Неверно")
    }

    println("Было загадано число $randomNumber")
}