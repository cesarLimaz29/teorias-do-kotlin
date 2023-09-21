fun main (){
    val idade = 150
    var resultado =""

    if(idade>=18){
        resultado = "Maior de idade #PartiuScandalo"
    } else {
        resultado = "De menor #vaiJogarPlaystation"
    }

    println(resultado)

    when (idade){
        in 1..3 -> println("bebezinho")
        in 4..9 -> println("criançinha")
        12 -> println("aborrecente")
        in 13..18 -> println("recem adulto")
        in 19..35 -> println("adulto")
        else -> println("idade não cadastrada")
    }

resultado = when (idade){
    in 0..11 -> "criança"
    in 12..19 -> "adolescente"
    in 20..Int.MAX_VALUE -> "adulto"
    else -> "idade inválida"
}
    println(resultado)
}
