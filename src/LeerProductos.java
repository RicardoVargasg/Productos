import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerProductos {
    public static void main(String[] args) {
        String nombreArchivo = "productos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Lista de productos: ");

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(":");

                if (partes.length == 2) {
                    String nombre = partes[0];
                    String precio = partes[1];
                    System.out.println("Producto: " + nombre + " | Precio: " + precio + "€");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}