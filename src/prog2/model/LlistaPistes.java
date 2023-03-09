/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

import java.util.ArrayList;

/**
 *
 * @author nano1
 */
public class LlistaPistes {
    private ArrayList<Pista> llista;
    LlistaPistes(){
        llista = new ArrayList<>();
    }
    
    
    
    public void actualitzaEstat(){}

    public ArrayList<Pista> getLlista() {
        return llista;
    }
    
    
    public void addPista(Pista p){
        llista.add(p);
    }
    
    public void buidar(){
        if (!llista.isEmpty()){
            llista.clear();
            
        }
    }
    
    public Pista getPista(String nom){
        for (int i = 0; i<llista.size();i++){
            if (llista.get(i).nom.equals(nom)){ 
                return llista.get(i);
            }
        }
        //si no troba la pista
        return null;
    }
    
    
    public String llistarPistes(String estat){
        String resposta = "";
        switch(estat){
            case "Oberta":{
                for (int i = 0; i< llista.size(); i++){
                    if (llista.get(i).estat_pista.equals(estat)){
                        resposta = resposta + llista.get(i).toString();
                        if (i < llista.size()-1){resposta = resposta + ",";}
                        
                    }
                }
                if (resposta.equals("")){
                System.out.println("no hi ha cap pista amb aquest estat actualment");}
            
            }
            case "Tancada":{
                for (int i = 0; i<llista.size(); i++){
                    if ( llista.get(i).estat_pista.equals(estat)){
                        resposta = resposta + llista.get(i).toString();
                        if (i < llista.size()-1){resposta = resposta + ",";}
                    }
                        
                }
                if (resposta.equals("")){
                System.out.println("no hi ha cap pista amb aquest estat actualment");}
            
            }
            case "Tots":{
                if (llista.isEmpty()){
                    System.out.println("no hi ha cap pista a la llista");
                }
                else{
                    for (int i = 0; i<llista.size(); i++){
                        resposta = resposta + llista.get(i).toString();
                        if (i < llista.size()-1){resposta = resposta + ",";}                    }
                }
            }
        }
        return resposta;
    }
    
    public float calculaSaltsPistes(String estat){
        int salts = 0;
        switch(estat){
            case "Oberta":{
                for (int i = 0; i< llista.size(); i++){
                    if (llista.get(i).estat_pista.equals(estat)){
                        salts = salts + llista.get(i).num_salts;
                    }
                }
            }
            
            case "Tancada":{
                for (int i = 0; i<llista.size(); i++){
                    if ( llista.get(i).estat_pista.equals(estat)){
                        salts = salts + llista.get(i).num_salts;
                    }  
                }
            }
            
            case "Tots":{
                for (int i = 0; i<llista.size(); i++){
                    salts = salts + llista.get(i).num_salts;
                }
  
            }
        }
        return salts;
    }
}
