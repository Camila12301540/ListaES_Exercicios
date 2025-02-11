fun main()
{
    println("Digite a medida em centímetros: ")
    val cent: Double = readLine()!!.toDouble()
    val metros: Double = cent/100
    println("$cent cm em metros é $metros")
}