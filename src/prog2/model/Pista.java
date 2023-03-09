/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author nano1
 */
public class Pista {
    protected String nom;
    protected String sector;
    protected float desnivell;
    protected int num_salts;
    protected String estat_neu;
    protected String estat_pista;
    protected LlistaRemuntadors remuntadors; 
    
    
    Pista(String n, String s, float d, int ns, String en, String ep){
        nom = n;
        sector = s;
        desnivell = d;
        num_salts = ns;
        estat_neu = en;
        estat_pista = ep;
        remuntadors = new LlistaRemuntadors();
        
        
    }

   

    public void actualitzaEstat(Condicions condicions){}
    public void afegirAcces(Remuntador rm){
        remuntadors.addRemuntador(rm);
    }
    
    
    @Override
    public String toString(){
        String info_pista;
    
        info_pista = "Pista: "+nom+
                ", Sector: "+sector+
                ", Desnivell: "+desnivell+
                ", Salts: "+num_salts+
                ", Estat de la neu: "+estat_neu+
                ", Estat de la pista: "+estat_pista+
                ", Acces amb: "+ remuntadors.getNoms();
        return info_pista;
    }
}