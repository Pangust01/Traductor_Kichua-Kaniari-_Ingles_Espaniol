package modelo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Traductor {
    private HashMap<String, ArrayList<String>> diccionario;

    public Traductor() {
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
        traduccionesIngles.add("agua");
        traduccionesIngles.add("Water");
        traduccionesIngles.add("viento");
        traduccionesIngles.add("Wind");
        traduccionesIngles.add("buenos dias");
        traduccionesIngles.add("Good morning");
        traduccionesIngles.add("buenas tardes");
        traduccionesIngles.add("Good afternoon");
        traduccionesIngles.add("piso");
        traduccionesIngles.add("Floor");
        traduccionesIngles.add("dia");
        traduccionesIngles.add("Day");
        traduccionesIngles.add("tarde");
        traduccionesIngles.add("Everning");
        traduccionesIngles.add("noche");
        traduccionesIngles.add("Night");
        traduccionesIngles.add("lana");
        traduccionesIngles.add("Wool");
        traduccionesIngles.add("quemar");
        traduccionesIngles.add("Burn");
        traduccionesIngles.add("fuego");
        traduccionesIngles.add("Fire");
        traduccionesIngles.add("calentar");
        traduccionesIngles.add("heat");
        traduccionesIngles.add("caminar");
        traduccionesIngles.add("Walk");
        traduccionesIngles.add("ver");
        traduccionesIngles.add("Watch");
        traduccionesIngles.add("olvidar");
        traduccionesIngles.add("Forget");
        traduccionesIngles.add("soñar");
        traduccionesIngles.add("Dream");
        traduccionesIngles.add("yo");
        traduccionesIngles.add("I");
        traduccionesIngles.add("ustedes");
        traduccionesIngles.add("You");

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
        traduccionesKichwa.add("agua");
        traduccionesKichwa.add("Yaku");
        traduccionesKichwa.add("viento");
        traduccionesKichwa.add("Wayra");
        traduccionesKichwa.add("buenos dias");
        traduccionesKichwa.add("Alli punlla");
        traduccionesKichwa.add("buenas tardes");
        traduccionesKichwa.add("Alli chisi");
        traduccionesKichwa.add("piso");
        traduccionesKichwa.add("Pampa");
        traduccionesKichwa.add("dia");
        traduccionesKichwa.add("Punlla");
        traduccionesKichwa.add("tarde");
        traduccionesKichwa.add("Chisi");
        traduccionesKichwa.add("noche");
        traduccionesKichwa.add("Tuta");
        traduccionesKichwa.add("lana");
        traduccionesKichwa.add("Miglla");
        traduccionesKichwa.add("quemar");
        traduccionesKichwa.add("Rupachiy");
        traduccionesKichwa.add("fuego");
        traduccionesKichwa.add("Nina");
        traduccionesKichwa.add("calentar");
        traduccionesKichwa.add("Kunuchy");
        traduccionesKichwa.add("caminar");
        traduccionesKichwa.add("Purik");
        traduccionesKichwa.add("ver");
        traduccionesKichwa.add("Rikuy");
        traduccionesKichwa.add("soñar");
        traduccionesKichwa.add("Muskuy");
        traduccionesKichwa.add("yo");
        traduccionesKichwa.add("Ñuka");
        traduccionesKichwa.add("ustedes");
        traduccionesKichwa.add("Kinkimba");

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
        Traductor miDiccionario = new Traductor();
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