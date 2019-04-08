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
public enum TipoUsuario {
    
    ALUNO(0),
    PROFESSOR(1),
    ADMIN(2);
    
    private int codigo;
    
    private TipoUsuario(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
}
