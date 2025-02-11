fun main()
{
    println("Digite a primeira nota: ")
    val nota1 = readLine()!!.toInt()
    println("Digite a segunda nota: ")
    val nota2 = readLine()!!.toInt()
    println("Digite a terceira nota: ")
    val nota3 = readLine()!!.toInt()
    println("Digite a quarta nota: ")
    val nota4 = readLine()!!.toInt()
    val media = (nota1 + nota2 + nota3 + nota4)/4
    println("A média é $media")
}