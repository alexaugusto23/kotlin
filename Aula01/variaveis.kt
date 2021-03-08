// kotlinc helloworld.kt -include-runtime -d helloworld.jar  
// java -jar  helloworld.jar

import java.text.DecimalFormat

val x = "Alex2"
    

fun main(args: Array <String>) {
    var nome: String = "Alex"
    println("Hello, $nome")// variavel com $ para imprimir
    println("Tamanho do variável nome: ${nome.length}")

    var df = DecimalFormat("#.##")//formatno decimal
    println(df.format(1.2345))

    println("${::x.get()}")

    

}


