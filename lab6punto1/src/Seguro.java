public class Seguro {
    private String tipo;
    private double descuentoExamenes; // Porcentaje de descuento. Ej: 0.3

    public Seguro(String tipo, double descuentoExamenes) {
        this.tipo = tipo;
        this.descuentoExamenes = descuentoExamenes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDescuentoExamenes() {
        return descuentoExamenes;
    }

    public void setDescuentoExamenes(double descuentoExamenes) {
        this.descuentoExamenes = descuentoExamenes;
    }
}
