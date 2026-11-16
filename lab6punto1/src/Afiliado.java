public class Afiliado {
    private String nombre;
    private String cedula;
    private int edad;
    private String seguro;

    public Afiliado(String nombre, String cedula, int edad, String seguro) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.seguro = seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
}
