fun main() {
    var contador = 0

    while (contador < 3){
        println("Foco força e fé #$contador")
        contador++
    }

    for (contagem in 1..5){
        println("Qual a contagem? $contagem")
    }

    val primeiro = 2
    val ultimo = 14

    for(contagem in primeiro .. ultimo){
        println("contagem: $contagem")
    }

    
}