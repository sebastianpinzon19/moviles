// Clase abstracta base
abstract class Publicacion(
    val titulo: String,
    val anioPublicacion: Int
) {
    // Propiedades con encapsulamiento
    private var disponible: Boolean = true
    
    // Metodo abstracto que debe ser implementado por las clases hijas
    abstract fun mostrarDetalles(): String
    
    // Métodos comunes
    fun prestar(): Boolean {
        if (disponible) {
            disponible = false
            return true
        }
        return false
    }
    
    fun devolver() {
        disponible = true
    }
    
    fun estaDisponible(): Boolean {
        return disponible
    }
    
    // Metodo toString sobrescrito
    override fun toString(): String {
        return "$titulo ($anioPublicacion) - ${if (disponible) "Disponible" else "Prestado"}"
    }
}

