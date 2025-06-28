package nullability

class Nullability {
    fun main() {
        println("NULABILITY")
        val favoriteActor = null
        println(favoriteActor)

        /** non-nullable **/
        var favoriteActor2: String = "Sandra Oh"
        favoriteActor2 = "Meryl Streep"

        /** nullable variables **/
        var favoriteActor3: String? = "Sandra Oh"
        favoriteActor3 = null

        //  access methods or properties of nullable variables
        println(favoriteActor3?.length)

        var favoriteActor4: String? = null;
//        You get a NullPointerException error:
        try {
            println(favoriteActor4!!.length)
        } catch (e: Exception) {
            println(e)
        }

        if (favoriteActor4 != null) {
            println("The number of characteristics in your favorite actor's name is ${favoriteActor4.length} characters")
        } else {
            println("You didn't input a name")
        }

        /**
         * if/else expressions
         */
        val lengthOfName = if (favoriteActor4 != null) favoriteActor4.length else 0
        println("The number of characters in your favorite actor's name is $lengthOfName")

        // Elvis operator
        // 0 is default value
        val lengthOfNumber2 = favoriteActor4?.length ?: 0
    }
}