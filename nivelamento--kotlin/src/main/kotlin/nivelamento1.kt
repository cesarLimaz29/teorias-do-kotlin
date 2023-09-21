fun main(){

    // usamos ´para execitar expressões.
    println("Hello word niguem me pega to até no kotlin")

    // variaveis criadas com val são imutaveis ou constantes

    val bairro = "Guaianases"
    val habitantes = 20000

    println("No Bairro $bairro moram $habitantes pessoas")
    println("No bairro ${bairro.uppercase()} moram ${habitantes * 2} ")

   // bairro = "itaquera"

   // var é var normal de sempre podem ser reatribuidos

    var contador = 0
    contador = 1

   // val pode ser utilizada em casos que vem de banco de dados onde os dados não devem ser mudados

   val idade = 33
   val peso = "95.77"

   // o kotlin pussu metodos de conversão nas proprias strings
   val calculo1 = idade.toInt() * 3
   val calculo2 = peso.toDouble() / 2
   print(calculo1)
   print(calculo2)
   print("99.33".toDouble()*4)

   // multiline string
   val sql = """
   select * from tabela
   where campo1 = 'o'
   order by campo2
   """
   print(sql)

    val filhos:Int = 30 //numeros inteiros
    val cidade:String = "São Paulo" //string
    val temMundial:Boolean = false //boleano
    val altura:Double = 1.98 // números reais


}