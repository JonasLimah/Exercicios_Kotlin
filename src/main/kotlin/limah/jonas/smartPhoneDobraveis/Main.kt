package limah.jonas.smartPhoneDobraveis

//ler uma temperatura em graus Fahrenheit
// calcular e escrever o valor
//correspondente em graus Celsius

fun main() {
    val fahrenheit:Double
    println("Escreva a temperatura em Fahrenheit: ")
    fahrenheit = readln().toDouble()
    conversor(fahrenheit)

}
fun conversor(fahrenheit: Double):Double{
    val celsius = ((fahrenheit - 32)/9)*5
    println("a temperatura ${fahrenheit}F corresponde á ${celsius}°C")
    return celsius
}