package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Traductor {
    private HashMap<String, ArrayList<String>> diccionario;

    public Traductor() { // Contruimos la clase traductor
        diccionario = new HashMap<>();
        inicializarDiccionario();
    }

    private void inicializarDiccionario() { // Inicalizamos el diccionario con palabras en español y kichwa
        ArrayList<String> traducciones = new ArrayList<>();
        traducciones.add("hola");
        traducciones.add("Hello");
        traducciones.add("Imanalla");
        traducciones.add("adiós");
        traducciones.add("Goodbye");
        traducciones.add("Kayakama");
        traducciones.add("perro");
        traducciones.add("Dog");
        traducciones.add("Ashku");
        traducciones.add("gato");
        traducciones.add("Cat");
        traducciones.add("Mishi");
        traducciones.add("raton");
        traducciones.add("Mouse");
        traducciones.add("Ukucha");
        traducciones.add("toro");
        traducciones.add("Bull");
        traducciones.add("Wagra");
        traducciones.add("agua");
        traducciones.add("Water");
        traducciones.add("Yaku");
        traducciones.add("viento");
        traducciones.add("Wind");
        traducciones.add("Wayra");
        traducciones.add("buenos dias");
        traducciones.add("Good morning");
        traducciones.add("Alli punlla");
        traducciones.add("buenas tardes");
        traducciones.add("Good afternoon");
        traducciones.add("Alli Chishi");
        traducciones.add("piso");
        traducciones.add("Floor");
        traducciones.add("Pampa");
        traducciones.add("dia");
        traducciones.add("Day");
        traducciones.add("Punlla");
        traducciones.add("tarde");
        traducciones.add("Evening");
        traducciones.add("Chishi");
        traducciones.add("noche");
        traducciones.add("Night");
        traducciones.add("Tuta");
        traducciones.add("lana");
        traducciones.add("Wool");
        traducciones.add("Miklla");
        traducciones.add("quemar");
        traducciones.add("Burn");
        traducciones.add("Rupachiy");
        traducciones.add("fuego");
        traducciones.add("Fire");
        traducciones.add("Nina");
        traducciones.add("calentar");
        traducciones.add("heat");
        traducciones.add("Kunuchiy");
        traducciones.add("caminar");
        traducciones.add("Walk");
        traducciones.add("Purik");
        traducciones.add("ver");
        traducciones.add("Watch");
        traducciones.add("Rikuy");
        traducciones.add("olvidar");
        traducciones.add("Forget");
        traducciones.add("Kungarina");
        traducciones.add("soñar");
        traducciones.add("Dream");
        traducciones.add("Muskuna");
        traducciones.add("yo");
        traducciones.add("I");
        traducciones.add("Ñuka");
        traducciones.add("ustedes");
        traducciones.add("You");
        traducciones.add("Kankuna");
        traducciones.add("teclado");
        traducciones.add("Keyboard");
        traducciones.add("No existe esta palabra");
        traducciones.add("matrimonio");
        traducciones.add("Marriage");
        traducciones.add("Kallarana");

        diccionario.put("palabras", traducciones); // Traduce la oracion
    }

    // Traduce la oracion
    public String traducirOracion(String idioma, String oracion) {
        StringBuilder resultado = new StringBuilder("Traducción de la oración en " + idioma + ":\n");
        String[] palabras = oracion.split("\\s+");

        for (String palabra : palabras) {
            String traduccion = traducirPalabra(idioma, palabra); // Instacia de la clase
            resultado.append(traduccion).append("");
        }

        return resultado.toString();
    }

    private String traducirPalabra(String idioma, String palabra) { // obtiene la lista de traducciones
        ArrayList<String> traducciones = diccionario.get("palabras"); // Busca el indice de la palbra en la lista
        int indicePalabra = traducciones.indexOf(palabra.toLowerCase());// Comprueba si la palabra fue encontrada

        if (indicePalabra != -1) { // Determina el indice de la traduccion seleccionada
            int indiceTraduccion = idioma.equals("ingles") ? indicePalabra + 1 : indicePalabra + 2; // Devueleve la
                                                                                                    // traduccion
            return traducciones.get(indiceTraduccion);
        } else {
            return "Traducción no encontrada para la palabra: " + palabra; // retoma al inicio
        }
    }

    public static void main(String[] args) {
        Traductor miDiccionario = new Traductor();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Idiomas disponibles: inglés, kichwa");
            System.out.println("Seleccione un idioma:");
            String idioma = scanner.nextLine().toLowerCase();

            if (!idioma.equals("ingles") && !idioma.equals("kichwa")) { // verifica si la variable idioma no es igual a
                                                                        // la cadena ingles
                System.out.println("Idioma no válido. Saliendo del programa.");
                return;
            }

            System.out.println("Ingrese una palabra o una oración para obtener su traducción:");
            String entrada = scanner.nextLine();

            if (entrada.contains(" ")) { // Si la entrada contiene espacios en una oracion
                System.out.println(miDiccionario.traducirOracion(idioma, entrada));
            } else {
                String significado = miDiccionario.traducirPalabra(idioma, entrada);
                System.out.println(significado); // sinno contiene espacios es una palabra
            }
        } finally {
            scanner.close();
        }
    }
}