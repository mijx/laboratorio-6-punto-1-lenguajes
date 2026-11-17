public class ExamenGeneral extends Examen{
    public ExamenGeneral(Afiliado paciente) {
        super("Examenes Generales", paciente);
    }

    @Override
    public double precioAPagar() {
        return 60.0*porcentajePago();
    }
}
