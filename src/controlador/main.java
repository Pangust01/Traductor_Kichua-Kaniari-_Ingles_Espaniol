/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.Loguin;
import static Body.body.Usuarios;
import static Body.body.traductor;
import modelo.Idioma;
import modelo.Usuario;
import vista.VentanaInicial;

/**
 *
 * @author wwwda
 */
public class main {
    private final Loguin loguin;

    public main(VentanaInicial ventanaInicial, Loguin loguin) {
        this.loguin = loguin;
    }

    public main(Loguin loguin) {
        this.loguin = loguin;
    }

    public void cargarLista() {
        Usuarios.add(new Usuario(1, "Pangust01", "danito54"));
        Usuarios.add(new Usuario(2, "admin", "admin"));
        Usuarios.add(new Usuario(2, "Alexis", "alexis554"));

    }

    public boolean usuaseñas(String user, String password) {
        boolean respuesta = false;
        for (Usuario users : Usuarios) {
            if (users.getUsuario().equals(user) && users.getContraseña().equals(password)) {
                respuesta = true;
                return respuesta;
            }
        }
        return respuesta;
    }

    public boolean selectInchwa(String idioma) {
        boolean report = false;
        for (Idioma idiomas : traductor) {
            if (idiomas.getIdioma().equals(idioma)) {

                report = true;

                return report;
            }
        }
        return report;
    }

    public String AcepInchwa(String idiomas) {
        if (selectInchwa(idiomas) == true) {
            return "Ingresado con exito... \nAhora ingrese una palabra en " + idiomas
                    + " para obtener su traducción...";
        } else {
            return "Idioma inexistente... \nintente otra vez...";
        }
    }

    public void login(String users, String passwords) {
        cargarLista();
        if (usuaseñas(users, passwords) == true) {
            VentanaInicial ventanaInicial = new VentanaInicial(loguin);
            ventanaInicial.setVisible(true);
            loguin.setVisible(false);
            loguin.getTxt1().setText("");
            loguin.getTxt2().setText("");
            loguin.getDatos().setText("Datos correctos...");

        } else {
            loguin.getDatos().setText("Datos inexistentes...");
            loguin.getTxt1().setText("");
            loguin.getTxt2().setText("");
        }

    }
}
