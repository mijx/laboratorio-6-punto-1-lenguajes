public abstract class Examen {
    private String tipo; // Tipo de examen
    private Afiliado paciente;

    public Examen(String tipo, Afiliado paciente) {
        this.tipo = tipo;
        this.paciente = paciente;
    }

    public double porcentajePago(){
        double porcentaje; // Porcentaje de descuento
        switch (paciente.getSeguro().toUpperCase()) {
            case "A":
                porcentaje = 0.5;  // El afiliado paga el 50% del examen
                break;
            case "A+":
                porcentaje = 0.7;  // El afiliado paga el 70% del examen
                break;
            case "B":
                porcentaje = 0.45; // El afiliado paga el 45% del examen
                break;
            case "B+":
                porcentaje = 0.7;  // El afiliado paga el 70% del examen
                break;
            default:
                porcentaje = 0.0;
        }
        return porcentaje;
    }

    abstract public double precioAPagar();
}
