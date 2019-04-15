/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author 48687223870
 */
public enum Status {
    
    Apr("Aprovado"), Rep("Reprovado");
    
    private String avaliacao;
    
    private Status( String avaliacao){
        this.avaliacao = avaliacao;
    }
    
    public String getAval(){
        return this.avaliacao;
    }
    
}
