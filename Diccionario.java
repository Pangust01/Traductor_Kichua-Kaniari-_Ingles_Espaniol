package Modelo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {
    private Map<String, Map<String, String>> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
        inicializarDiccionario();
    }

    private void inicializarDiccionario() {
        Map<String, String> traduccionesIngles = new HashMap<>();
        traduccionesIngles.put("hola", "Hello");
        traduccionesIngles.put("adiós", "Goodbye");
        traduccionesIngles.put("gato", "cat");
        traduccionesIngles.put("perro", "Dog");
        traduccionesIngles.put("perro", "Dog");
        traduccionesIngles.put("perro", "Dog");

        Map<String, String> traduccionesKichwa = new HashMap<>();
        traduccionesKichwa.put("hola", "Imanalla");
        traduccionesKichwa.put("adiós", "Kayakama");
        traduccionesKichwa.put("perro", "Ashku");
        traduccionesKichwa.put("gato", "Mishi");
        
        diccionario.put("inglés", traduccionesIngles);
        diccionario.put("kichwa", traduccionesKichwa);
    }

    public String traducir(String idioma, String palabra) {
        Map<String, String> traducciones = diccionario.get(idioma.toLowerCase()); 
        if (traducciones != null) {
            String palabraLower = palabra.toLowerCase(); 
            return traducciones.getOrDefault(palabraLower, "Traducción no encontrada para este idioma");
        }
        return "Idioma no encontrado en el diccionario";
    }

    public static void main(String[] args) {
        Diccionario miDiccionario = new Diccionario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idiomas disponibles: inglés, kichwa");
        System.out.println("Ingrese una palabra para obtener su traducción:");
        String palabra = scanner.nextLine();

        String significadoIngles = miDiccionario.traducir("Inglés", palabra);
        String significadoKichwa = miDiccionario.traducir("Kichwa", palabra);

        System.out.println("Significado de '" + palabra + "' en Inglés: " + significadoIngles);
        System.out.println("Significado de '" + palabra + "' en Kichwa: " + significadoKichwa);

        scanner.close();
    }
}