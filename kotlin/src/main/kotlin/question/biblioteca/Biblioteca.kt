// Clase para gestionar las publicaciones
class Biblioteca {
    private val publicaciones = mutableListOf<Publicacion>()
    
    fun agregarPublicacion(publicacion: Publicacion) {
        publicaciones.add(publicacion)
    }
    
    fun listarPublicaciones() {
        if (publicaciones.isEmpty()) {
            println("La biblioteca está vacía.")
            return
        }
        
        println("=== CATÁLOGO DE LA BIBLIOTECA ===")
        publicaciones.forEachIndexed { index, publicacion ->
            println("${index + 1}. $publicacion")
        }
    }
    
    fun prestarPublicacion(indice: Int): Boolean {
        if (indice < 0 || indice >= publicaciones.size) {
            return false
        }
        
        return publicaciones[indice].prestar()
    }
    
    fun devolverPublicacion(indice: Int): Boolean {
        if (indice < 0 || indice >= publicaciones.size) {
            return false
        }
        
        publicaciones[indice].devolver()
        return true
    }
    
    fun mostrarDetallesPublicacion(indice: Int) {
        if (indice < 0 || indice >= publicaciones.size) {
            println("Índice inválido.")
            return
        }
        
        println(publicaciones[indice].mostrarDetalles())
    }
    
    fun cantidadPublicaciones(): Int {
        return publicaciones.size
    }
}

