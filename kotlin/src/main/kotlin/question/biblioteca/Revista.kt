// Otra clase hija que hereda de Publicacion
class Revista(
    titulo: String,
    anioPublicacion: Int,
    private val numero: Int,
    private val categoria: String
) : Publicacion(titulo, anioPublicacion) {
    
    // Implementación del metodo adstrapto
    override fun mostrarDetalles(): String {
        return """
            Tipo: Revista
            Título: $titulo
            Año: $anioPublicacion
            Número: $numero
            Categoría: $categoria
            Estado: ${if (estaDisponible()) "Disponible" else "Prestado"}
        """.trimIndent()
    }
}

