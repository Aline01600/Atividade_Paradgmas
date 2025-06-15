fun main(){
    val numeros = listOf(5,3,8,3,2,8,10,1)
    println("Lista original: $numeros")
    println("Ordenação crescente: " + executar_estrategia(numeros, ::ordenarCrescente))

}

fun executar_estrategia(lista: List<Int>, estrategia: (List<Int>) -> List<Int>): List<Int> {
    return estrategia(lista)
}

fun ordenarCrescente(lista: List<Int>): List<Int>{
    return lista.sorted()
}
