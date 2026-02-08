import kotlin.random.Random

/**
 * Conclusión: Las clases son los planos para crear objetos.
 * Aprendimos que las 'data class' son ideales para almacenar datos (generan automáticamente 
 * funciones útiles como toString), mientras que las clases normales pueden contener lógica más compleja.
 * También practicamos cómo componer objetos complejos usando otras clases como propiedades.
 */

// --- Definición de Data Classes ---
// Usamos 'data class' porque su propósito principal es contener datos.
data class Employee(val name: String, var salary: Int)

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
data class Name(val first: String, val last: String)
data class Address(val street: String, val city: City)
data class City(val name: String, val countryCode: String)

// --- Definición de Clase con Comportamiento ---
// Esta clase no es 'data' porque su función principal es generar algo, no solo guardar datos.
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")

    fun generateEmployee() =
        Employee(names.random(),
            Random.nextInt(from = minSalary, until = maxSalary))
}

fun main() {
    // Ejercicio 1: Uso básico de Data Class
    val emp = Employee("Mary", 20)
    println("Empleado original: $emp")
    emp.salary += 10
    println("Empleado tras aumento: $emp")

    // Ejercicio 2: Estructuras anidadas
    // Creamos un objeto complejo pasando otros objetos (Name, Address, City) al constructor.
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
    println("Persona: $person")

    // Ejercicio 3: Generador Aleatorio
    val empGen = RandomEmployeeGenerator(10, 30)
    println("Generado 1: ${empGen.generateEmployee()}")
    println("Generado 2: ${empGen.generateEmployee()}")
    println("Generado 3: ${empGen.generateEmployee()}")
    
    // Modificamos las propiedades del generador
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println("Generado con nuevo rango: ${empGen.generateEmployee()}")
}
