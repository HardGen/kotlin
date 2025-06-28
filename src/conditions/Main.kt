fun main() {
    // assignment operation
    val number = 1
    // comparison operation
    1 == 1

    println(1 < 1)

    val trafficLightColor = "BLACK"

    if (trafficLightColor == "RED") {
        println("STOP")
    } else if (trafficLightColor == "YELLOW") {
        println("SLOW")
    } else if (trafficLightColor === "GREEN") {
        println("GO")
    } else {
        println("INVALID traffic-light color")
    }


    when (trafficLightColor) {
        "RED" -> println("STOP")
        "YELLOW" -> println("SLOW")
        "GREEN" -> println("GO")
        else -> println("INVALID traffic-light-color")
    }

    val x = 3

    when (x) {
        2, 3, 5, 6 -> println("x is a prime number between 1 and 10")
        else -> println("x isn't a prime number between 1 and 10.")
    }

    // Use the in keyword for a range of conditions
    when (3) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        else -> println("x is a prime number between 1 and 10")
    }

    // Use the is keyword to check data type
    val x2: Any = 4
    when (x2) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number")
    }

    /** if else statement to an expression **/

    val message =
        if (trafficLightColor == "RED") "STOP"
        else if (trafficLightColor == "YELLOW") "SLOW"
        else if (trafficLightColor === "GREEN") "GO"
        else "INVALID traffic-light color"

    val message2 = when (trafficLightColor) {
        "RED" -> "STOP"
        "YELLOW" -> "SLOW"
        "GREEN" -> "GO"
        else -> "INVALID traffic-light-color"
    }

}