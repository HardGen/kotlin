package generics

class Quiz: ProgressPrintable {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("Quoth the raven ___", false, Difficulty.EASY)
    val question3 = Question<Int>("Quoth the raven ___", 28, Difficulty.HARD)

    companion object StudentProgress {
        val total: Int = 10
        var answered: Int = 3
    }

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answers)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answers)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answers)
            println(it.difficulty)
        }
        println()
    }
}
