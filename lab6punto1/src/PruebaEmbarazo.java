public class PruebaEmbarazo extends Examen{
    public PruebaEmbarazo(String tipo, Afiliado paciente) {
        super("Prueba de Embarazo", paciente);
    }

    @Override
    public double precioAPagar() {
        return 15.0*porcentajePago();
    }
}
