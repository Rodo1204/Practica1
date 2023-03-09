/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author nano1
 */
public class Condicions {
    private String velocidad_viento;
    private String visibilidad;
    
    public String getVelocitatVent(){
        return velocidad_viento;
    }
    
    public void setVelocitatVent(String vVent){
        velocidad_viento = vVent;
    }
    
    public String getVisibilidad(){
        return visibilidad;
    }
    
    public void setVisibilidad(String visibilitat){
        visibilidad = visibilitat;
    }
    
    @Override
    public String toString(){
        return velocidad_viento + ", " + visibilidad;
    }
}

