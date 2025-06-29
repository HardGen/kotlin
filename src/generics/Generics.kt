package generics

/**
 *  Let's define three different types of questions.
 * Fill-in-the-blank question: The answer is a word represented by a String.
 * True or false question: The answer is represented by a Boolean.
 * Math problems: The answer is a numeric value. The answer for a simple arithmetic problem is represented by an Int.
 */

class Generics {
    fun main() {
        val quiz = Quiz()
        quiz.printProgressBar()
        quiz.printQuiz()

        Quiz().apply { printQuiz() }
    }
}