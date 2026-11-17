import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) { //  throws IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Afiliado> afiliados = new ArrayList<Afiliado>();
        int opcion;
        boolean exit = false;
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
                    case 1:
                        System.out.println("caso 1");
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
