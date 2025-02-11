fun main()
{
    println("Digite o quanto você ganha por hora: ")
    val salario: Double = readLine()!!.toDouble()
    println("Digite quantas horas trabalha: ")
    val horas: Double = readLine()!!.toDouble()
    val soma: Double = salario * horas
    println("Seu salário é $soma")
}