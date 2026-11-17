public class AntiDoping extends Examen{

    public AntiDoping(Afiliado paciente) {
        super("Anti-Doping", paciente);
    }

    @Override
    public double precioAPagar() {
        return 25.0*porcentajePago();
    }
}
