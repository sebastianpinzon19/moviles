package question

object CertificadoValidator {

    fun validarCertificado(
        fechaEmision: String,
        nombreEmisor: String,
        codigoVerificacion: String
    ): Boolean {
        if (!fechaEmision.matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) {
            println("Error: La fecha de emisión debe estar en formato yyyy-MM-dd.")
            return false
        }
        if (nombreEmisor.isBlank()) {
            println("Error: El nombre del emisor no puede estar vacío.")
            return false
        }
        if (codigoVerificacion.isBlank()) {
            println("Error: El código de verificación no puede estar vacío.")
            return false
        }
        return true
    }
}