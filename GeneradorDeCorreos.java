import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneradorDeCorreos {

    public static String generarCorreo() {
        String[] extensiones = {"gmail.com", "hotmail.com", "empresa.com"}; // extensiones de correo
        String letras = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        StringBuilder correo = new StringBuilder();
        
        // generar un nombre aleatorio de 6 caracteres
        for (int i = 0; i < 10; i++) {
            correo.append(letras.charAt(rand.nextInt(letras.length())));
        }
        
        correo.append("@");
        
        // agregar una extensión aleatoria
        correo.append(extensiones[rand.nextInt(extensiones.length)]);
        
        return correo.toString();
    }

    public static void main(String[] args) {
        int n = 10; // cantidad de correos electrónicos a generar
        List<String> correos = new ArrayList<>();
        
        // generar los correos electrónicos
        for (int i = 0; i < n; i++) {
            correos.add(generarCorreo());
        }
        
        // filtrar y separar los correos por extensión
        List<String> gmail = new ArrayList<>();
        List<String> hotmail = new ArrayList<>();
        List<String> empresa = new ArrayList<>();
        
        for (String correo : correos) {
            if (correo.endsWith("gmail.com")) {
                gmail.add(correo);
            } else if (correo.endsWith("hotmail.com")) {
                hotmail.add(correo);
            } else if (correo.endsWith("empresa.com")) {
                empresa.add(correo);
            }
        }
        
        // imprimir los correos electrónicos separados por extensión
        System.out.println("Gmail:");
        for (String correo : gmail) {
            System.out.println(correo);
        }
        
        System.out.println("Hotmail:");
        for (String correo : hotmail) {
            System.out.println(correo);
        }
        
        System.out.println("Empresa:");
        for (String correo : empresa) {
            System.out.println(correo);
        }
    }
}