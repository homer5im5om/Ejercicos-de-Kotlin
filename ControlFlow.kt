import kotlin.random.Random

/**
 * Conclusión: El control de flujo (Control Flow) es fundamental para decidir qué código ejecutar.
 * Aprendimos a usar 'if/else' para decisiones simples, 'when' para manejar múltiples ramas 
 * de forma más limpia que muchos 'if', y los bucles 'while' y 'for' para repetir tareas
 * o iterar sobre rangos y colecciones.
 */

fun main() {
    // --- Ejercicio 1: If/Else y Aleatoriedad ---
    // Usamos Random para generar números y una condición if/else para determinar el resultado del juego.
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    
    if (firstResult == secondResult) {
        println("You win :)")
    } else {
        println("You lose :(")
    }

    // --- Ejercicio 2: Expresión When ---
    // 'when' hace el código más legible cuando tenemos muchas opciones posibles para una variable.
    val button = "A"
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )

    // --- Ejercicio 3: Bucle While ---
    // El bucle 'while' ejecuta el código repetidamente mientras la condición (slices < 7) sea verdadera.
    var pizzaSlices = 0
    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    // Completamos la pizza fuera del bucle
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    // --- Ejercicio 4: Bucle For y Rangos (FizzBuzz) ---
    // Iteramos del 1 al 100 y usamos 'when' sin argumentos para verificar múltiples condiciones matemáticas.
    for (number in 1..100) {
        println(
            when {
                number % 15 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> "$number"
            }
        )
    }

    // --- Ejercicio 5: Iterar sobre Listas ---
    // Usamos 'for' para recorrer cada palabra en la lista y aplicamos un filtro con 'if'.
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (w in words) {
        if (w.startsWith("l"))
            println(w)
    }
}
