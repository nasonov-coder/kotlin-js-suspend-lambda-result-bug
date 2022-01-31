
suspend fun main() {
    val lambda: suspend () -> Res = { Res("asd") }
    println(lambda.invoke())
}
value class Res(val value: String)