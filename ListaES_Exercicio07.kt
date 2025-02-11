import kotlin.math.pow
fun main()
{
    println("Digite o tamanho dos lados: ")
    val lado: Double = readLine()!!.toDouble()
    val area: Double = lado.pow(2)
    val area2: Double = area.pow(2)
    println("O raio do quadrado é $area2")
}