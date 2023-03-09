/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog2.vista;
import java.util.Scanner;

/**
 *
 * @author noero
 */
public class IniciadorEstacioNordica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Definim el nom i les condicions meteorologiques inicials a l'estació
        String nomEstacio     = "Troll";
        int velocitatVent     = 50;
        String visibilitat    = "Bona";

        // Creem un objecte de la vista i li passem el nom i condicions meteorologiques inicials a l'estació
        VistaEstacioNordica vistaEstacioNordica = new VistaEstacioNordica(nomEstacio, visibilitat, velocitatVent);
     
        // Inicialitzem l'execució de la vista
        vistaEstacioNordica.gestioEstacioNordica();
    }
    
}
