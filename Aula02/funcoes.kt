//// kotlinc funcoes.kt -include-runtime -d funcoes.jar  
// java -jar  funcoes.jar

fun main(args: Array <String>) {
    var ints = listOf(1,2,3,4,5,6,7,8)
    var pares = filtrar(ints, ::numerosPares)
    println(pares)
    var maior3 = filtrar(ints, ::maiores3)
    println(maior3)
    var impares = filtrar(ints, {a: Int -> numerosImpares(a)})
    println(impares)
    var impares = filtrar(ints) {it % 2 == 1}
    println(impares)

}

fun filtrar(lista: List<Int>, x: (Int) -> (Boolean)): List<Int>{
    val novaLista = arrayListOf<Int>()
    for (item in lista){
        if(x(item)){
            novaLista.add(item)
        }
    }
    return novaLista
}

fun numerosPares(n: Int): Boolean{
    return n % 2 == 0
}

fun numerosImpares(n: Int): Boolean{
    return n % 2 == 1
}

fun maiores3(n: Int): Boolean {
    return n > 3
}