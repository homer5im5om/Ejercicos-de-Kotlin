//Ejercicio 1
fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalCount = greenNumbers.count() + redNumbers.count()
    println(totalCount)
}

//Ejercicio 2
fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}

//Ejercicio 3
fun main() {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}

/**
 * Conclusión: Las colecciones en Kotlin nos permiten gestionar grupos de elementos de manera eficiente. 
 * Las Listas (Lists) mantienen un orden, los Conjuntos (Sets) aseguran que los elementos sean únicos 
 * y los Mapas (Maps) almacenan pares de clave-valor para búsquedas rápidas.
 */
