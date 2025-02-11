fun main()
{
    println("Digite a temperatura em F°: ")
    val fa: Double = readLine()!!.toDouble()
    val celsius: Double = 5 * ((fa - 32) / 9)
    println("A temperatura é $celsius °C")
}