/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author noero
 */
public class EstacioNordica {
    private LlistaRemuntadors llistaRemuntadors;
    private LlistaPistes llistaPistes;

    public LlistaRemuntadors getLlistaRemuntadors() {
        return llistaRemuntadors;
    }

    public LlistaPistes getLlistaPistes() {
        return llistaPistes;
    }
    
    
    public EstacioNordica(){
        llistaRemuntadors = new LlistaRemuntadors();
        llistaPistes = new LlistaPistes();
    };
    
    
    
    public void inicialitzaDadesEstacioNordica() {
        
        /* Remuntadors */
        //llistaRemuntadors.buidar();
        Telecadira RM1 = new Telecadira("Fora de Servei", "RM1", "Nord", false, 35 );      llistaRemuntadors.addRemuntador(RM1);
        Teleesqui  RM2 = new Teleesqui ("Fora de Servei", "RM2", "Nord", false, 35 );      llistaRemuntadors.addRemuntador(RM2);
        Telecadira RM3 = new Telecadira("Fora de Servei", "RM3", "Nord", false, 35);      llistaRemuntadors.addRemuntador(RM3);
        Teleesqui  RM4 = new Teleesqui ("En Servei", "RM4", "Nord", false, 70);      llistaRemuntadors.addRemuntador(RM4);
        Telecabina RM5 = new Telecabina("En Servei", "RM5", "Nord", false, 70);      llistaRemuntadors.addRemuntador(RM5);
        CintaTransportadora RM6 = new CintaTransportadora("En Servei", "RM6", "Nord", false, 70); llistaRemuntadors.addRemuntador(RM6);
        Teleesqui  RM7 = new Teleesqui ("En Servei", "RM7", "Sud", false, 70);       llistaRemuntadors.addRemuntador(RM7);
        Telecadira RM8 = new Telecadira("En Servei", "RM8", "Sud", false, 70);       llistaRemuntadors.addRemuntador(RM8);
        Telecabina RM9 = new Telecabina("En Servei", "RM9", "Sud", true, 70);   llistaRemuntadors.addRemuntador(RM9);
        
        /* Pistes */
        llistaPistes.buidar();
        Pista P1  = new Pista("P1",  "Nord", 80.5f, 8, "Dura",      "Tancada"); llistaPistes.addPista(P1);
        Pista P2  = new Pista("P2",  "Nord", 42.3f, 4, "Dura",      "Tancada");  llistaPistes.addPista(P2);
        Pista P3  = new Pista("P3",  "Nord", 31.5f, 3, "Pols",      "Oberta");  llistaPistes.addPista(P3);
        Pista P4  = new Pista("P4",  "Nord", 89.2f, 12, "Dura",      "Oberta"); llistaPistes.addPista(P4);
        Pista P5  = new Pista("P5",  "Nord", 91.5f, 9, "Primavera", "Oberta");  llistaPistes.addPista(P5);
        Pista P6  = new Pista("P6",  "Nord", 22.5f, 2, "Pols",      "Oberta");  llistaPistes.addPista(P6);
        Pista P7  = new Pista("P7",  "Nord", 64.5f, 5, "Primavera", "Oberta");  llistaPistes.addPista(P7);
        Pista P8  = new Pista("P8",  "Nord", 102.5f, 9, "Pols",      "Oberta");  llistaPistes.addPista(P8);
        Pista P9  = new Pista("P9",  "Sud",  83.0f, 7, "Dura",      "Oberta");  llistaPistes.addPista(P9);
        Pista P10 = new Pista("P10", "Sud",  71.5f, 6, "Primavera", "Oberta");  llistaPistes.addPista(P10);
        Pista P11 = new Pista("P11", "Sud",  55.2f, 3, "Primavera", "Oberta");  llistaPistes.addPista(P11);
        Pista P12 = new Pista("P12", "Sud",  29.8f, 1, "Pols",      "Oberta");  llistaPistes.addPista(P12);
        
        /* Accés */
        P1.afegirAcces(RM1);
        P2.afegirAcces(RM2); P2.afegirAcces(RM3);
        P3.afegirAcces(RM5);
        P4.afegirAcces(RM5);
        P5.afegirAcces(RM5);
        P6.afegirAcces(RM4);
        P7.afegirAcces(RM5);
        P8.afegirAcces(RM5); P8.afegirAcces(RM6);
        P9.afegirAcces(RM9);
        P10.afegirAcces(RM9);
        P11.afegirAcces(RM7); P11.afegirAcces(RM8);
        P12.afegirAcces(RM8); P11.afegirAcces(RM7);
    }
}
