//// kotlinc acum.kt -include-runtime -d acum.jar  
// java -jar  acum.jar

/*7 - Escreva um programa em Kotlin com uma função 
que recebe por parâmetro uma lista de qualquer 
tipo de objeto e um objeto qualquer X (do mesmo 
tipo dos objetos da lista) e retorna a quantidade 
de vezes que X encontra-se na lista. */

/*8 - Utilizando lambda e funções anônimas, escreva 
um programa em Kotlin com uma função encontraPesoIdeal, 
a partir da altura de uma pessoa. A função deve ter 
apenas uma linha. Utilize as seguintes expressões 
(h == altura): Para homens: 72.7 * h - 58 ; 
Para mulheres: 62.1 * h - 44.7 *
 */

fun main(args: Array <String>) {

    var c = contar<Int>(listOf<Int>(1,2,3,4,4,4,5,1,2),4)
    print(c)
    println()
    c = contar(listOf("a", "b", "a"),"b")
    print(c)
    println()

    var peso = encontraPesoIdeal(1.70, "F")
    println(peso)

    peso = encontraPesoIdeal(1.70, "H")
    println(peso)

    var pesoDois = encontraPesoIdeal3(1.70) { pesoCachorro(it)}
    println(pesoDois)
    pesoDois = encontraPesoIdeal3(1.70) { 72.7* it - 58}
    println(pesoDois)

}

//conta x
fun <G> contar(lista: List<G>, x: G): Int
{
    var contador = 0
    for(valor in lista){
        if (valor == x)
        {
            contador++
        }
    }
    return contador
}

//peso ideal com lambda
fun encontraPesoIdeal(h: Double, genero: String): Double{
    if(genero == "F"){return 62.1 * h -44.7}
    return 72.7 * h - 58    
}

fun encontraPesoIdeal2(h: Double, funcao: (Double) -> (Double)): Double{
    return funcao(h)
}

fun pesoHomem(h: Double) = 72.7 * h -58
fun pesoMulher(h: Double) = 62.1 * h -44.7
fun pesoCachorro(h: Double) = 45.1 * h -32

fun encontraPesoIdeal3(h: Double, funcao: (Double) -> (Double)) = funcao(h)