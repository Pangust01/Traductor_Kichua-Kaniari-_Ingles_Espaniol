package modelo;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Traductor {

    private final HashMap<String, ArrayList<String>> diccionario;

    public Traductor(HashMap<String, ArrayList<String>> diccionario) {

        this.diccionario = diccionario;
    }

    public Traductor() { // Contruimos la clase traductor
        diccionario = new HashMap<>();
        inicializarDiccionario();
    }

    public Traductor(HashMap<String, ArrayList<String>> diccionario, String idioma) {
        this.diccionario = diccionario;

    }

    private void inicializarDiccionario() { // Inicalizamos el diccionario con palabras en español y kichwa
        ArrayList<String> traducciones = new ArrayList<>();
        traducciones.add("hola");
        traducciones.add("hello");
        traducciones.add("imanalla");
        traducciones.add("adiós");
        traducciones.add("goodbye");
        traducciones.add("kayakama");
        traducciones.add("perro");
        traducciones.add("dog");
        traducciones.add("ashku");
        traducciones.add("gato");
        traducciones.add("cat");
        traducciones.add("mishi");
        traducciones.add("raton");
        traducciones.add("mouse");
        traducciones.add("ukucha");
        traducciones.add("toro");
        traducciones.add("bull");
        traducciones.add("wagra");
        traducciones.add("agua");
        traducciones.add("water");
        traducciones.add("yaku");
        traducciones.add("viento");
        traducciones.add("wind");
        traducciones.add("wayra");
        traducciones.add("buenos dias");
        traducciones.add("good morning");
        traducciones.add("alli punlla");
        traducciones.add("buenas tardes");
        traducciones.add("good afternoon");
        traducciones.add("alli Chishi");
        traducciones.add("piso");
        traducciones.add("floor");
        traducciones.add("pampa");
        traducciones.add("dia");
        traducciones.add("day");
        traducciones.add("punlla");
        traducciones.add("tarde");
        traducciones.add("evening");
        traducciones.add("chishi");
        traducciones.add("noche");
        traducciones.add("night");
        traducciones.add("tuta");
        traducciones.add("lana");
        traducciones.add("wool");
        traducciones.add("miklla");
        traducciones.add("quemar");
        traducciones.add("burn");
        traducciones.add("rupachiy");
        traducciones.add("fuego");
        traducciones.add("fire");
        traducciones.add("nina");
        traducciones.add("calentar");
        traducciones.add("heat");
        traducciones.add("kunuchiy");
        traducciones.add("caminar");
        traducciones.add("walk");
        traducciones.add("purik");
        traducciones.add("ver");
        traducciones.add("watch");
        traducciones.add("rikuy");
        traducciones.add("olvidar");
        traducciones.add("forget");
        traducciones.add("kungarina");
        traducciones.add("soñar");
        traducciones.add("dream");
        traducciones.add("muskuna");
        traducciones.add("yo");
        traducciones.add("i");
        traducciones.add("ñuka");
        traducciones.add("ustedes");
        traducciones.add("you");
        traducciones.add("kankuna");
        traducciones.add("teclado");
        traducciones.add("keyboard");
        traducciones.add("no existe esta palabra");
        traducciones.add("matrimonio");
        traducciones.add("marriage");
        traducciones.add("kallarana");
        traducciones.add("dulce");
        traducciones.add("sweet");
        traducciones.add("mishki");
        traducciones.add("sol");
        traducciones.add("sun");
        traducciones.add("inti");
        traducciones.add("luna");
        traducciones.add("moon");
        traducciones.add("killa");
        traducciones.add("vamonos");
        traducciones.add("let's go");
        traducciones.add("jaku");
        traducciones.add("venir");
        traducciones.add("come");
        traducciones.add("shamuy");
        traducciones.add("neblina");
        traducciones.add("fog");
        traducciones.add("puyo");
        traducciones.add("huevo");
        traducciones.add("egg");
        traducciones.add("ruro");
        traducciones.add("duro");
        traducciones.add("hard");
        traducciones.add("shinchy");
        traducciones.add("frio");
        traducciones.add("cold");
        traducciones.add("chiry");
        traducciones.add("caliente");
        traducciones.add("hot");
        traducciones.add("kunuy");
        traducciones.add("lodo");
        traducciones.add("sludge");
        traducciones.add("turu");
        traducciones.add("sapo");
        traducciones.add("joad");
        traducciones.add("jamp'atu");
        traducciones.add("lluvia");
        traducciones.add("rain");
        traducciones.add("tamia");
        traducciones.add("nevado");
        traducciones.add("snowy");
        traducciones.add("cazshka");
        traducciones.add("montańa");
        traducciones.add("mountain");
        traducciones.add("urku");
        traducciones.add("gallina");
        traducciones.add("hen");
        traducciones.add("guashpa");
        traducciones.add("pollo");
        traducciones.add("chicken");
        traducciones.add("chuchi");
        traducciones.add("caballo");
        traducciones.add("horse");
        traducciones.add("apyu");
        traducciones.add("zorro");
        traducciones.add("fox");
        traducciones.add("atuk");
        traducciones.add("leña");
        traducciones.add("firewood");
        traducciones.add("yanta");
        traducciones.add("luz");
        traducciones.add("ligth");
        traducciones.add("achik");
        traducciones.add("tejer");
        traducciones.add("weave");
        traducciones.add("awana");
        traducciones.add("guerra");
        traducciones.add("war");
        traducciones.add("makanakuy");
        traducciones.add("reloj");
        traducciones.add("clock");
        traducciones.add("pachachik");
        traducciones.add("escuela");
        traducciones.add("school");
        traducciones.add("yachana wasi");
        traducciones.add("libro");
        traducciones.add("book");
        traducciones.add("kamu");
        traducciones.add("pluma");
        traducciones.add("feather");
        traducciones.add("patpa");
        traducciones.add("comida");
        traducciones.add("food");
        traducciones.add("mikuna");
        traducciones.add("desayuno");
        traducciones.add("breakfast");
        traducciones.add("chinlli");
        traducciones.add("crudo");
        traducciones.add("raw");
        traducciones.add("chawa");
        traducciones.add("abrazo");
        traducciones.add("hug");
        traducciones.add("ukllarina");
        traducciones.add("abierto");
        traducciones.add("open");
        traducciones.add("paskana");
        traducciones.add("abuelo");
        traducciones.add("grandfather");
        traducciones.add("hatun yaya");
        traducciones.add("amarillo");
        traducciones.add("yellow");
        traducciones.add("killu");
        traducciones.add("amigo");
        traducciones.add("friend");
        traducciones.add("mashi");
        traducciones.add("amor");
        traducciones.add("love");
        traducciones.add("uyani");
        traducciones.add("animal");
        traducciones.add("animal");
        traducciones.add("sacha wiwa");
        traducciones.add("aprender");
        traducciones.add("learn");
        traducciones.add("yachakuna");
        traducciones.add("arbol");
        traducciones.add("tree");
        traducciones.add("yura");
        traducciones.add("arriba");
        traducciones.add("up");
        traducciones.add("hawa");
        traducciones.add("azul");
        traducciones.add("blue");
        traducciones.add("ankas");
        traducciones.add("gavilan");
        traducciones.add("hawk");
        traducciones.add("hanka");
        traducciones.add("hilo");
        traducciones.add("thread");
        traducciones.add("miqya");
        traducciones.add("bañar");
        traducciones.add("bathe");
        traducciones.add("armana");
        traducciones.add("decir");
        traducciones.add("say");
        traducciones.add("rimana");
        traducciones.add("bien");
        traducciones.add("well");
        traducciones.add("alli");
        traducciones.add("blanco");
        traducciones.add("white");
        traducciones.add("yurak");
        traducciones.add("boca");
        traducciones.add("mouth");
        traducciones.add("shimi");
        traducciones.add("brazo");
        traducciones.add("arm");
        traducciones.add("rikra");
        traducciones.add("blando");
        traducciones.add("soft");
        traducciones.add("apilla");
        traducciones.add("bobo");
        traducciones.add("fool");
        traducciones.add("upa");
        traducciones.add("bravo");
        traducciones.add("fierce");
        traducciones.add("piñak");
        traducciones.add("broma");
        traducciones.add("joke");
        traducciones.add("yankapukllay");
        traducciones.add("brujo");
        traducciones.add("wizard");
        traducciones.add("shaman");
        traducciones.add("bosque");
        traducciones.add("forest");
        traducciones.add("sacha");
        traducciones.add("burlarse");
        traducciones.add("mock");
        traducciones.add("asipayana");
        traducciones.add("cagar");
        traducciones.add("poop");
        traducciones.add("ismana");
        traducciones.add("caer");
        traducciones.add("fall");
        traducciones.add("urmana");
        traducciones.add("caja");
        traducciones.add("box");
        traducciones.add("purunku");
        traducciones.add("ano");
        traducciones.add("anus");
        traducciones.add("siki utuku");
        traducciones.add("teniente");
        traducciones.add("lieutenant");
        traducciones.add("kitilli apuk");
        traducciones.add("pene");
        traducciones.add("dick");
        traducciones.add("puma ullu");
        traducciones.add("primavera");
        traducciones.add("spring");
        traducciones.add("sisa");
        traducciones.add("reir");
        traducciones.add("laugh");
        traducciones.add("asina");
        traducciones.add("señorita");
        traducciones.add("miss");
        traducciones.add("kuytsa");
        traducciones.add("machete");
        traducciones.add("machete");
        traducciones.add("kutana");
        traducciones.add("macho");
        traducciones.add("male");
        traducciones.add("kari");
        traducciones.add("menstruacion");
        traducciones.add("menstruation");
        traducciones.add("warmi unkuy");
        traducciones.add("mesa");
        traducciones.add("table");
        traducciones.add("pataku");
        traducciones.add("sesos");
        traducciones.add("brains");
        traducciones.add("ñunktu");
        traducciones.add("sudor");
        traducciones.add("sweat");
        traducciones.add("jumpi");
        traducciones.add("testiculo");
        traducciones.add("testicle");
        traducciones.add("lulun");
        traducciones.add("tusa");
        traducciones.add("corncob");
        traducciones.add("kurunta");
        traducciones.add("trabajar");
        traducciones.add("work");
        traducciones.add("llamkana");
        traducciones.add("uva");
        traducciones.add("grape");
        traducciones.add("chiwilla");
        traducciones.add("vagina");
        traducciones.add("pussy");
        traducciones.add("raka");
        traducciones.add("trasero");
        traducciones.add("ass");
        traducciones.add("siki");
        traducciones.add("cerdo");
        traducciones.add("pig");
        traducciones.add("kuchi");
        

      
        
        diccionario.put("palabras", traducciones); // Traduce la palabra
    }

    public boolean buscarIdPalabara(String palabra, int idPalabra) {
        ArrayList<String> traducciones = diccionario.get("palabras");
        int indicePalabra = traducciones.indexOf(palabra.toLowerCase());
        for (int i = idPalabra; i <= indicePalabra; i += 3) {
            
            if (indicePalabra == i) {
                return true;
            }
        }
        return indicePalabra == -1;

    }

    public String traducirPalabra(String idioma, String palabra, int id_idioma) { // obtiene la lista de traducciones
        ArrayList<String> traducciones = diccionario.get("palabras");
        int indicePalabra = traducciones.indexOf(palabra.toLowerCase());

        if (id_idioma == 0 && indicePalabra != -1) {

            return "Su traduccion para la palabra '" + palabra + "' en ingles es: "
                    + traducciones.get(indicePalabra + 1) + "\nSu traduccion para la palabra '" + palabra
                    + "' en kichwa es: " + traducciones.get(indicePalabra + 2);
        } else if (id_idioma == 1 && indicePalabra != -1) {
            return "Su traduccion para la palabra '" + palabra + "' en español es: "
                    + traducciones.get(indicePalabra - 1) + "\nSu traduccion para la palabra '" + palabra
                    + "' en kichwa es: " + traducciones.get(indicePalabra + 1);
        } else if (id_idioma == 2 && indicePalabra != -1) {
            return "Su traduccion para la palabra '" + palabra + "' en español es: "
                    + traducciones.get(indicePalabra - 2) + "\nSu traduccion para la palabra '" + palabra
                    + "' en ingles es: " + traducciones.get(indicePalabra - 1);
        } else {
            return "Traducción no encontrada para la palabra: " + palabra;
        }

    }

    public String eliminarTildes(String cadena) {
        String cadenaNormalizada = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        return cadenaNormalizada.replaceAll("[^\\p{ASCII}]", "");
    }


}
