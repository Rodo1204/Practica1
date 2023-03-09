/*
 * Universitat de Barcelona
 * Programació 2
 * Curs 2022-2023
 */

package prog2.vista;

import java.util.Scanner;
import prog2.model.EstacioNordica;


public class VistaEstacioNordica {
    
    /* Atributs */
    String nomEstacio;
    String visibilitat;
    int velocitatVent;
    EstacioNordica Estacio;
    // Write your code here
    
    /* Constructor de la Vista*/
    public VistaEstacioNordica(String nomEstacio, String visibilitat, int velocitatVent) {
      // Write your code here
      this.nomEstacio = nomEstacio;
      this.visibilitat = visibilitat;
      this.velocitatVent = velocitatVent;
      Estacio = new EstacioNordica();
      Estacio.inicialitzaDadesEstacioNordica();
      
    };
   
       
    /* Mètodes */    
    // Write your code here
        
    public void gestioEstacioNordica(){
        // Creació d'un objecte per a llegir l'input des del teclat
        Scanner sc = new Scanner(System.in);

        // Crida a la funció que gestiona el menu
        gestioMenu(sc);
    }
    
    /* ******************************************** */
    /* Gestió, Opcions i Descripció del Menú (M) */
    /* ******************************************** */
    private static enum OpcionsMenu {
        M_Opcio_LlistarPistes,
        M_Opcio_LlistarPistesObertes,
        M_Opcio_LlistarPistesTancades,
        M_Opcio_LlistarRemuntadors,
        M_Opcio_LlistarRemuntadorsEnServei,
        M_Opcio_LlistarRemuntadorsForaServei,
        M_Opcio_ModificarEstatNeu,
        M_Opcio_Modificar_Vent,
        M_Opcio_Modificar_Visibilitat,
        M_Opcio_Report_Condicions,
        M_Opcio_CalcularTotalSalts,
        M_Opcio_Sortir
    };
    
    // Descripció de les opcions del menú principal
    private static final String[] descMenu = {
        "Llistar la informació de totes les pistes", // Opció 1
        "Llistar la informació de les pistes obertes",  // Opció 2
        "Llistar la informació de les pistes tancades",  // Opció 3
        "Llistar la informació de tots els remuntadors mecànics",  // Opció 4
        "Llistar la informació dels remuntadors en servei",  // Opció 5
        "Llistar la informació dels remuntadors fora de servei",  // Opció 6
        "Modificar l'estat de la neu d'una pista",  // Opció 7
        "Modificar la velocitat del vent",  // Opció 8
        "Modificar la visibilitat",  // Opció 9
        "Mostrar les condicions meteorologiques actuals",  // Opció 10
        "Calcular i mostrar el total de salts de pistes i de pistes obertes",  // Opció 11
        "Sortir del gestor de l'estació"  // Opció 12
    };
    
    // Funció que gestiona el menu principal de l'aplicació
    // Te 3 passos principals:
    //   1. Crear l'objecte que representa (conté) el menú
    //   2. Assignar les descripcions del menú
    //   3. Bucle on es tracta l'opció seleccionada per l'usuari

    public void gestioMenu(Scanner sc) {

        // Creació de l'objecte que representa el menú. El primer argument del contructor és el nom del menú
        Menu<OpcionsMenu> menuEstacio = new Menu<>("Menu " + "NO IMPLEMENTAT ---> estacio.getNomEstacio()", OpcionsMenu.values());
        //Menu<OpcionsMenu> menuEstacio = new Menu<>("Menu " + estacio.getNomEstacio(), OpcionsMenu.values());
        
        // Assignar una descripción a cada una de les opcions
        //  - OPCIONAL - Per defecte ensenya el nom de l'opció
        menuEstacio.setDescripcions(descMenu);
        
        // Variable (de tipus enumerat igual a les opcions del menú) que conté l'opció escollida
        OpcionsMenu opcioMenu;
        
        // Lançar el bucle principal de l'aplicació
        do {
            menuEstacio.mostrarMenu();
            opcioMenu = menuEstacio.getOpcio(sc);
              
       switch(opcioMenu) {
                case M_Opcio_LlistarPistes:
                    // Write your code here
                    System.out.println(Estacio.getLlistaPistes().llistarPistes("Tots"));
                    break;
                case M_Opcio_LlistarPistesObertes:
                    // Write your code here
                    System.out.println("has triat 2");
                    break;
                case M_Opcio_LlistarPistesTancades:
                    // Write your code here
                    System.out.println("has triat 3");
                    break;
                case M_Opcio_LlistarRemuntadors:
                    // Write your code here
                    System.out.println("has triat 4");
                    break;
                case M_Opcio_LlistarRemuntadorsEnServei:
                    // Write your code here
                    System.out.println("has triat 5");
                    break;
                case M_Opcio_LlistarRemuntadorsForaServei:
                    // Write your code here
                    System.out.println("has triat 6");
                    break;
                case M_Opcio_ModificarEstatNeu:
                    // Write your code here
                    System.out.println("has triat 7");
                    break;
                case M_Opcio_Modificar_Vent:
                    // Write your code here
                    System.out.println("has triat 8");
                    break;
                case M_Opcio_Modificar_Visibilitat:
                    // Write your code here
                    System.out.println("has triat 9");
                    break;
                case M_Opcio_Report_Condicions:
                    // Write your code here
                    System.out.println("has triat 10");
                    break;
                case M_Opcio_CalcularTotalSalts:
                    // Write your code here
                    System.out.println("has triat 11");
                    break;
            }
            
        } while(opcioMenu != OpcionsMenu.M_Opcio_Sortir);
    }

}
