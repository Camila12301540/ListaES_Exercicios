import kotlin.math.pow
fun main()
{
    println("Digite o raio: ")
    val raio: Double = readLine()!!.toDouble()
    val area: Double = 3.14159265359 * raio.pow(2)
    println("O raio do círculo é $area")
}