//// kotlinc helloworld.kt -include-runtime -d helloworld.jar  
// java -jar  helloworld.jar

import java.text.DecimalFormat

fun main(args: Array <String>) {
    var s: Any = "Alex"
    println(s as? Interger)//Tranformar em um inteiro cast seguro as? pergunta se pode transformar

}


