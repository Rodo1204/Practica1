/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

import java.util.ArrayList;

/**
 * Classe que guarda tots els objectes "Remuntadors"
 * @author noero
 */
public class LlistaRemuntadors {
    private  ArrayList<Remuntador> llista;
    
    //funcions
    LlistaRemuntadors(){
        llista = new ArrayList<>();
    }
    public void addRemuntador (Remuntador rm){llista.add(rm);}
    
    /**
     * Buida la llista de remuntadors.
     */
    public void buidar(){
        llista.clear();
    }
    
    public void actualitzaEstat(Condicions condicions){}
    
    /**
     * 
     * @return Retorna true si tots els remuntadors estan fora de servei.
     */
    public boolean totsForaDeServei(){
        boolean resultat = true;
        for (int i=0;i<llista.size() && resultat == true;i++) {
            if (llista.get(i).estat.equals("En Servei")){
                resultat =false;
            }
        }
    return resultat;
    }
    
    /**
     * 
     * @param estat
     * @return Retorna un string amb totes les dades dels remuntadors amb l'estat demanat(En Servei, Fora de Servei, tots).Si no hi ha remuntadors amb aquest estat o la llista esta buida avisa a l'usuari. 
     */
    public String llistarRemuntadors(String estat){
        String resposta = "";
        switch(estat){
            case "En Servei":{
                for (int i = 0; i< llista.size(); i++){
                    if (llista.get(i).estat.equals(estat) == true){
                        resposta = resposta + llista.get(i).toString();
                        if (i < llista.size()-1){resposta = resposta + ",";}
                        
                    }
                }
                if (resposta.equals("")){
                System.out.println("no hi ha cap remuntador amb aquest estat actualment");}
            
            }
            case "Fora de Servei":{
                for (int i = 0; i<llista.size(); i++){
                    if ( llista.get(i).estat.equals(estat)){
                        resposta = resposta + llista.get(i).toString();
                        if (i < llista.size()-1){resposta = resposta + ",";}
                    }
                        
                }
                if (resposta.equals("")){
                System.out.println("no hi ha cap remuntador amb aquest estat actualment");}
            
            }
            case "Tots":{
                if (llista.isEmpty()){
                    System.out.println("no hi ha cap remuntador a la llista");
                }
                else{
                    for (int i = 0; i<llista.size(); i++){
                        resposta = resposta + "," + llista.get(i).toString();
                    }
                }
                
                
            }
        }
        return resposta;
    }
    
    /**
     * 
     * @return Retorna un String amb el nom de tots els remuntadors (separat per ",")
     */
    public String getNoms(){
       String resposta = "";
        if (llista.isEmpty()){return "";}
        else{
            for (int i = 0; i<llista.size();i++){
                resposta = resposta + llista.get(i);
                if (i < llista.size()-1){resposta = resposta + ",";}
            }
            return resposta;
        }
        }
}
