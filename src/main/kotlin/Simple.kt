suspend fun main() {
    val lambda: suspend () -> Result<String> = { Result.success("suc") }
    println(lambda.invoke().getOrThrow())
}