import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirProductos {
    public static void main(String[] args) {
        String nombreArchivo = "productos.txt";
        String[] productos = {
                "Leche: 3.20",
                "Huevos: 1.70",
                "Agua: 0.75",
                "Queso: 3.00"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String p : productos) {
                bw.write(p);
                bw.newLine();
            }
            System.out.println("Archivo creado.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}