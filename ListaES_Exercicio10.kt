fun main()
{
    println("Digite a temperatura em C°: ")
    val celsius: Double = readLine()!!.toDouble()
    val fa: Double = celsius * 1.8 + 32
    println("A temperatura é $fa °F")
}