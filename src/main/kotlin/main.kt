var l1 = mutableListOf("Carlos", "Sergio", "Javier", "Ignacio","Manuel", "Stefanel", "Néstor")

fun main() {

    println("Lista original = $l1")

    // Filtrado
    val r1  = l1.filter { true }
    println(r1)

    val r2  = l1.filter {
        it.startsWith("C")
    }
    println(r2)

    // Ej1: Busca a todas las personas que no se llaman Sergio pero que tienen una "s" en su nombre.

    val r3 = l1.filter {
        !it.contentEquals("Sergio") && it.toLowerCase().contains("s")
    }
    println(r3)
    // Ej2: Busca a todas las personas cuyo nombre tiene un número de letras par.

    val r4 = l1.filter{
        it.length % 2 == 0
    }
    println(r4)
    // Ej3: Busca a todas las personas cuyo nombre tiene un número de letras superior a 6 y que su nombre empieza por vocal.

    val l2 = mutableListOf('A','E','I','O','U')

    for (i in l2) {
        val r5 = l1.filter {
            it.length > 6 && it.startsWith(i)
        }
        println(r5)
    }
}




