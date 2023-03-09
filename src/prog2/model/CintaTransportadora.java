/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 * subclasse de Remuntador
 * @author noero
 */
public class CintaTransportadora extends Remuntador {
    
    CintaTransportadora(String e, String n, String s, boolean v, int l){
    super(e,n,s,v,l);}
    
    
    
    @Override
    public String pes(){
        return "40Kg";
    }
}
