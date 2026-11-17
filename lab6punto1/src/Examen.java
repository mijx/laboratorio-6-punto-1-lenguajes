public class Examen {
    private String tipo; // Tipo de examen
    private double costo; // El costo sin contar el descuento
    private Afiliado paciente;

    public Examen(String tipo, double costo, Afiliado paciente) {
        this.tipo = tipo;
        this.costo = costo;
        this.paciente = paciente;
    }

    public double calcularDescuento(){
        double porcentaje, descuento;
        switch (paciente.getSeguro().toUpperCase()) {
            case "A":
                porcentaje = 0.5;  // El afiliado paga el 50% del examen
                break;
            case "A+":
                porcentaje = 0.3;  // El afiliado paga el 70% del examen
                break;
            case "B":
                porcentaje = 0.55; // El afiliado paga el 45% del examen
                break;
            case "B+":
                porcentaje = 0.3;  // El afiliado paga el 70% del examen
                break;
            default:
                porcentaje = 0.0;
        }
        descuento = porcentaje*costo;
        return descuento;
    }

    public double precioPagado(){
        return costo - calcularDescuento();
    }
}
