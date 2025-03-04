// Clase hija que hereda de Publicacion
class Libro(
    titulo: String,
    anioPublicacion: Int,
    private val autor: String,
    private val numeroPaginas: Int,
    private val isbn: String
) : Publicacion(titulo, anioPublicacion) {
    
    // Implementación del metodo abstracto
    override fun mostrarDetalles(): String {
        return """
            Tipo: Libro
            Título: $titulo
            Autor: $autor
            Año: $anioPublicacion
            Páginas: $numeroPaginas
            ISBN: $isbn
            Estado: ${if (estaDisponible()) "Disponible" else "Prestado"}
        """.trimIndent()
    }
}

