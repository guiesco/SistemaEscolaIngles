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
    
    AndApr("Andamento", "Aprovado"), AndRep("Andamento", "Reprovado"),
    AndSemAv("Andamento", "Sem Avaliação"),
    FinApr("Finalizado", "Aprovado"), FinRep("Finalizado", "Reprovado");
    
    private String status;
    private String avaliacao;
    
    private Status(String status, String avaliacao){
        this.status = status;
        this.avaliacao = avaliacao;
    }
    
}
