const val likes = 1111

fun main(){
    val wordEnding = if (likes%10 == 1 && likes%100 != 11) "человеку" else "людям"
        println("Понравилось $likes $wordEnding")
}
