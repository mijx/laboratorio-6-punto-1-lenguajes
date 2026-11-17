import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) { //  throws IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Afiliado> afiliados = new ArrayList<Afiliado>();

        boolean exit = false;
        int opcion;
        ArrayList<String> tiposSeguro = new ArrayList<>();
        tiposSeguro.add("A");
        tiposSeguro.add("A+");
        tiposSeguro.add("B");
        tiposSeguro.add("B+");
        // Variables de los afiliados
        String nombre, cedula, seguro;
        int edad;
        Afiliado nuevoAfiliado;
        do {
            try {
                //Menu de opciones
                System.out.println("\nLABORATORIOS LA SALUD");
                System.out.println("\t1. Registrar nuevo afiliado");
                System.out.println("\t2. Costo de un examen médico");
                System.out.println("\t3. Salir");
                System.out.print("Selección: ");
                opcion = Integer.parseInt(br.readLine());
                System.out.println();

                switch (opcion) {
                    case 1: // Registrar un nuevo afiliado

                        // Leer los datos del afiliado
                        System.out.print("Ingrese la cédula: ");
                        cedula = br.readLine();

                        // Revisar si el afiliado ya existe
                        // Solo compara la cédula porque es el identificador único de las personas
                        boolean nuevo = true;
                        for (Afiliado afiliado:afiliados){
                            if(cedula.equalsIgnoreCase(afiliado.getCedula())){
                                nuevo = false;
                            }
                        }
                        if(!nuevo){
                            System.out.println("Error: el afiliado ya está registrado en el sistema.");
                            break; // Salir de la ejecución de case 1
                        }

                        // Continuar leyendo los datos del afiliado
                        System.out.print("Ingrese el nombre: ");
                        nombre = br.readLine();
                        System.out.print("Ingrese la edad: ");
                        edad = Integer.parseInt(br.readLine());
                        System.out.print("Ingrese el tipo de seguro (A, A+, B o B+): ");
                        seguro = br.readLine().toUpperCase().trim();

                        // Validar que el tipo de seguro ingresado es válido
                        if(!tiposSeguro.contains(seguro)){
                            System.out.println("Error: tipo de seguro no válido. Intente de nuevo.");
                            break; // Salir de la ejecución de case 1
                        }

                        // Añadir el nuevo registro
                        nuevoAfiliado = new Afiliado(nombre, cedula, edad,seguro);
                        afiliados.add(nuevoAfiliado);
                        System.out.println("Registro exitoso.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: formato de número incorrecto.");
            } catch (IOException e) {
                System.out.println("Error en la entrada o salida de datos.");
            } catch (Exception e) {
                System.out.println("Error general.");
            }
        } while (!exit);

    }
}
