/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *Superclasse de la que hereden tots els tipus de remuntadors
 * @author noero
 */
public abstract class Remuntador {
    protected String nom;
    protected String sector;
    // si estat == true, està en servei, en cas contrari està fora de servei.
    protected String estat;
    protected int limitVent;
    protected boolean susceptibleVisibilitat;
    
    //funcions
    Remuntador(String e, String n, String s, boolean v, int l){
        nom = n;
        sector = s;
        estat = e;
        limitVent = l;
        susceptibleVisibilitat = v;
    }
    public abstract String pes();
    
    public void actualitzaEstat(Condicions condicions){
    
    }
    
    @Override
    public String toString(){
        return "Remuntador: " + nom + ", Tipus: " + this.getClass() + ", Estat: " + estat + ", Pes: " + this.pes() + ", Sector: " + sector;
    
}
}