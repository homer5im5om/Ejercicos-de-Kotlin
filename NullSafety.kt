/**
 * Conclusión: Null Safety (Seguridad ante Nulos) es una de las mejores características de Kotlin.
 * Nos ayuda a evitar el famoso error "NullPointerException".
 * Aprendimos a usar el operador '?' para indicar que una variable puede ser nula, 
 * el operador de llamada segura '?.' para acceder a datos sin que la app se cierre,
 * y el operador Elvis '?:' para dar un valor por defecto si encontramos un nulo.
 */

data class Employee(val name: String, var salary: Int)

// Esta función devuelve un Empleado o 'null' si no encuentra el ID.
fun employeeById(id: Int) = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}

// Usamos el operador Elvis (?:) para devolver 0 si el empleado o su salario es nulo.
fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

fun main() {
    // Calculamos la suma de salarios del 1 al 5, manejando los nulos automáticamente.
    println((1..5).sumOf { id -> salaryById(id) })
}
