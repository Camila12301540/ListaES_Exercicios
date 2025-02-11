fun main()
{
    println("Digite o primeiro número: ")
    val numero1 = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val numero2 = readLine()!!.toInt()
    val soma = numero1 + numero2
    println("A soma de $numero1 e $numero2 é $soma")
}