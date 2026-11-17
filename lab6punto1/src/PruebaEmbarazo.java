public class PruebaEmbarazo extends Examen{
    public PruebaEmbarazo( Afiliado paciente) {
        super("Prueba de Embarazo", paciente);
    }

    @Override
    public double precioAPagar() {
        return 15.0*porcentajePago();
    }
}
