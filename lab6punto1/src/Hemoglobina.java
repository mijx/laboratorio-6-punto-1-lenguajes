public class Hemoglobina extends Examen{
    public Hemoglobina(String tipo, Afiliado paciente) {
        super("Hemoglobina Glicosilada", paciente);
    }

    @Override
    public double precioAPagar() {
        return 20.0*porcentajePago();
    }
}
