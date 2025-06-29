package generics

data class Question<T>(
    val questionText: String,
    val answers: T,
    val difficulty: Difficulty,
) {

}