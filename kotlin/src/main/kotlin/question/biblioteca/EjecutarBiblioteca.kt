// Función que contiene toda la lógica de ejecución
fun ejecutarBiblioteca() {
    // Crear una instancia de la biblioteca
    val biblioteca = Biblioteca()

    // Crear algunas publicaciones
    val libro1 = Libro(
        "Cien años de soledad",
        1967,
        "Gabriel García Márquez",
        471,
        "978-0307474728"
    )

    val libro2 = Libro(
        "El Quijote",
        1605,
        "Miguel de Cervantes",
        863,
        "978-8420412146"
    )

    val revista1 = Revista(
        "National Geographic",
        2023,
        156,
        "Ciencia"
    )

    // Agregar publicaciones a la biblioteca
    biblioteca.agregarPublicacion(libro1)
    biblioteca.agregarPublicacion(libro2)
    biblioteca.agregarPublicacion(revista1)

    // Mostrar el catálogo
    println("Mostrando el catálogo inicial:")
    biblioteca.listarPublicaciones()
    println()


    
    // Prestar un libro
    println("Prestando 'Cien años de soledad'...")
    if (biblioteca.prestarPublicacion(0)) {
        println("Libro prestado con éxito.")
    } else {
        println("No se pudo prestar el libro.")
    }
    println()
    
    // Mostrar el catálogo actualizado
    println("Catálogo actualizado:")
    biblioteca.listarPublicaciones()
    println()
    
    // Mostrar detalles de una publicación
    println("Detalles de 'El Quijote':")
    biblioteca.mostrarDetallesPublicacion(1)
    println()
    
    // Intentar prestar un libro ya prestado
    println("Intentando prestar 'Cien años de soledad' nuevamente...")
    if (biblioteca.prestarPublicacion(0)) {
        println("Libro prestado con éxito.")
    } else {
        println("No se pudo prestar el libro porque ya está prestado.")
    }
    println()
    
    // Devolver un libro
    println("Devolviendo 'Cien años de soledad'...")
    if (biblioteca.devolverPublicacion(0)) {
        println("Libro devuelto con éxito.")
    } else {
        println("No se pudo devolver el libro.")
    }
    println()
    
    // Mostrar el catálogo final
    println("Catálogo final:")
    biblioteca.listarPublicaciones()
}

