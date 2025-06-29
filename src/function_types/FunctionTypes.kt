package function_types

class FunctionTypes {
    fun main() {
        val trickFunction = ::trick
        val trick2Function = trick
        trickFunction()
        trick2Function()
        treat()

        val treatFunction = trickOrTreat(false)
        val trick3Function = trickOrTreat(true)

        val coins: (Int) -> String = { quantity ->
            "$quantity quarters"
        }
        val treatFunction2 = trickOrTreat2(false, coins)
    }

    fun trick() {
        print("No treats!")
    }
}


val trick = {
    print("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    return if (isTrick) trick else treat
}

fun trickOrTreat2(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    return if (isTrick) trick else {
        println(extraTreat(5))
        return treat
    }
}