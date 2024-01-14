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
        traducciones.add("matrimonio");
        traducciones.add("Marriage");
        traducciones.add("Kallarana");

        diccionario.put("palabras", traducciones);
    }

    public String traducir(String idioma, String palabra) {
        ArrayList<String> traducciones = diccionario.get("palabras");
        if (traducciones != null) {
            int index = traducciones.indexOf(palabra.toLowerCase());
            if (index != -1) {
                int indexIdioma = (idioma.equalsIgnoreCase("inglés")) ? 1 : 2;
                return "Significado de '" + palabra + "' en " + idioma + ": " +
                        traducciones.get(index + indexIdioma);
            } else {
                return "Traducción no encontrada para esta palabra";
            }
        }
        return "Error al obtener las traducciones";
    }

    public String traducirOracion(String idioma, String oracion) {
        StringBuilder resultado = new StringBuilder("Traducción de la oración en " + idioma + ":\n");
        String[] palabras = oracion.split("\\s+");

        for (String palabra : palabras) {
            String traduccion = traducir(idioma, palabra);
            resultado.append(traduccion).append("\n");
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Traductor miDiccionario = new Traductor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idiomas disponibles: inglés, kichwa");
        System.out.println("Seleccione un idioma:");
        String idioma = scanner.nextLine().toLowerCase();

        System.out.println("Ingrese una palabra o una oración para obtener su traducción:");
        String entrada = scanner.nextLine();

        if (entrada.contains(" ")) {
            System.out.println(miDiccionario.traducirOracion(idioma, entrada));
        } else {
            String significado = miDiccionario.traducir(idioma, entrada);
            System.out.println(significado);
        }

        scanner.close();
    }
}