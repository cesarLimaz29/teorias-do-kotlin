fun main(){
    val frutas = listOf("uva","maçã","banana","kiwi")

    println("Quantos tem? ${frutas.size}")
    println("Priemeiro? ${frutas[0]}")
    println("Priemeiro? ${frutas.first()}")
    println("Ultimo? ${frutas.last()}")

    val paises = mutableListOf("Brasil","Japão","França")
    paises.add("china") //adiciona
    paises.removeAt(1) //remove a partir do numero
    paises.remove("Japão") //remove a partir da string
    paises.removeIf{it.contains("F")} //remove por uma letra
    paises.removeIf{it.length > 5} // removendo com +D 5 letras
    paises.clear() // limpando tudo
    println(paises)

    val animais = mutableListOf("leão","anta","cabra","boto")
    animais.sort() // ordena em ordem natural String = alfabetica A > Z / Number = 0 > 9 / data = Antigo > Novo
    println(animais)

    val  quantosComA = animais.count() { it.contains("a")}
    println(quantosComA)

    val  animaisComA = animais.filter() { it.contains("a")}
    println(animaisComA)

    println(animais)

    // iteração na lista

    animais.forEach{
        println(it.uppercase())
    }

    animais.forEach{animal ->
        println(animal.uppercase())
    }
}