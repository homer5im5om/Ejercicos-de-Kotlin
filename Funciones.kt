import kotlin.math.PI

/**
 * Conclusión: Las funciones son bloques de código reutilizables.
 * En estos ejercicios aprendimos a simplificar funciones a una sola línea (single-expression),
 * y a usar argumentos por defecto y argumentos con nombre (named arguments) para hacer
 * el código más flexible y legible sin necesidad de sobrecargar métodos.
 */

// Ejercicio 1: Función Circle Area
// Usamos la sintaxis de expresión simple (=) para calcular el área de forma concisa.
fun circleArea(radius: Int): Double = PI * radius * radius

// Ejercicio 2: Interval in Seconds
// Definimos valores por defecto (0) para que no sea obligatorio enviar todos los parámetros.
fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds

fun main() {
    // Probando el cálculo del área
    println("Circle area (radio 2): ${circleArea(2)}")

    // Probando la conversión de tiempo con diferentes combinaciones de argumentos
    println("Time 1: ${intervalInSeconds(1, 20, 15)}")
    println("Time 2: ${intervalInSeconds(minutes = 1, seconds = 25)}")
    println("Time 3: ${intervalInSeconds(hours = 2)}")
    println("Time 4: ${intervalInSeconds(minutes = 10)}")
    println("Time 5: ${intervalInSeconds(hours = 1, seconds = 1)}")
}
