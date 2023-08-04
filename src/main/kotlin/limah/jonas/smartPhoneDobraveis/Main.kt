package limah.jonas.smartPhoneDobraveis

import com.sun.jdi.IntegerValue

// 3 valores brancos,nulos,valiodo e um valor da porcentagem
// que cada um reprasenta da quantidade total de eleitores

fun main() {
    val populacao: Int
    val brancos: Int
    val nulos: Int
    val validos: Int
    println("Digite o total da população: ")
    populacao = readln().toInt()
    println("Digite o total dde votos Brancos: ")
    brancos = readln().toInt()
    println("Digite o total dde votos Nulos: ")
    nulos = readln().toInt()
    println("Digite o total dde votos Válidos: ")
    validos = readln().toInt()
    verificador(populacao, brancos, nulos, validos)
}

fun verificador(populacao: Int, brancos: Int, nulos: Int, validos: Int) {
    val brancoPorcento = populacao * brancos / 100
    val nulosPorcento = populacao * nulos / 100
    val validosPorcento = populacao * validos / 100
    if ((brancos + nulos + validos) > populacao) {
        println("teve mais votos que a população total verifique os dados!")
    } else if ((brancos + nulos + validos) == populacao) {
        println("Com uma população total de : $populacao\n-tivemos:\n$brancos votos brancos\n$nulos votos nulos\n$validos votos validos")
        println("Brancos $brancoPorcento% da população total $populacao\nNulos $nulosPorcento% da população total $populacao\nVálidos $validosPorcento% da população total $populacao\n")
    } else {
        println("reveja os dados quantidades dos votos tem que ser igual ao da população")
    }
}