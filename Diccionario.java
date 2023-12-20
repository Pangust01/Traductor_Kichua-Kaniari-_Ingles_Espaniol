import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Diccionario {
    private HashMap<String, ArrayList<String>> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
        inicializarDiccionario();
    }

    private void inicializarDiccionario() {
        ArrayList<String> traduccionesIngles = new ArrayList<>();
        traduccionesIngles.add("hola");
        traduccionesIngles.add("Hello");
        traduccionesIngles.add("adiós");
        traduccionesIngles.add("Goodbye");
        traduccionesIngles.add("gato");
        traduccionesIngles.add("cat");
        traduccionesIngles.add("perro");
        traduccionesIngles.add("Dog");
        traduccionesIngles.add("raton");
        traduccionesIngles.add("Mouse");
        traduccionesIngles.add("toro");
        traduccionesIngles.add("Bull");

        ArrayList<String> traduccionesKichwa = new ArrayList<>();
        traduccionesKichwa.add("hola");
        traduccionesKichwa.add("Imanalla");
        traduccionesKichwa.add("adiós");
        traduccionesKichwa.add("Kayakama");
        traduccionesKichwa.add("perro");
        traduccionesKichwa.add("Ashku");
        traduccionesKichwa.add("gato");
        traduccionesKichwa.add("Mishi");
        traduccionesKichwa.add("raton");
        traduccionesKichwa.add("Ukucha");
        traduccionesKichwa.add("toro");
        traduccionesKichwa.add("Wagra");

        diccionario.put("inglés", traduccionesIngles);
        diccionario.put("kichwa", traduccionesKichwa);
    }

    public String traducir(String idioma, String palabra) {
        ArrayList<String> traducciones = diccionario.get(idioma.toLowerCase());
        if (traducciones != null) {
            for (int i = 0; i < traducciones.size(); i += 2) {
                if (traducciones.get(i).equalsIgnoreCase(palabra)) {
                    return "Significado de '" + palabra + "' en " + idioma + ": " +
                            traducciones.get(i + 1);
                }
            }
            return "Traducción no encontrada para este idioma";
        }
        return "Idioma no encontrado en el diccionario";
    }

    public static void main(String[] args) {
        Diccionario miDiccionario = new Diccionario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idiomas disponibles: inglés, kichwa");
        System.out.println("Ingrese una palabra para obtener su traducción:");
        String palabra = scanner.nextLine();

        String significadoIngles = miDiccionario.traducir("inglés", palabra);
        String significadoKichwa = miDiccionario.traducir("kichwa", palabra);

        System.out.println(significadoIngles);
        System.out.println(significadoKichwa);

        scanner.close();
    }
}
