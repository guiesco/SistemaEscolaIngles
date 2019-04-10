/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author guies
 */
public enum Lingua {
    
    Ingles("Ingles"),Espanhol("Espanhol"), Italiano("Italiano"), 
    Francês("Francês"), Alemao("Alemão"), Chines("Chinês");
    
    private String nome;
    
    private Lingua(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
