/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author guies
 */
public class Usuario {
    
    private int CPF;
    private int RG;
    private int telefone;
    private String nome;
    private String dataNasc;
    private String endereco;
    private String senha;
    private ArrayList<String> linguasEnsinadas;
    private ArrayList<Turmas> turmas;
    private TipoUsuario tipoUsuario;

    public Usuario(int CPF, int RG, int telefone, String nome, String dataNasc, String endereco, String senha, TipoUsuario tipoUsuario) {
        this.CPF = CPF;
        this.RG = RG;
        this.telefone = telefone;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
    
    public Usuario(int CPF, int RG, int telefone, String nome, String dataNasc, String endereco, String senha, TipoUsuario tipoUsuario, ArrayList<String> linguasEnsinadas) {
        this.CPF = CPF;
        this.RG = RG;
        this.telefone = telefone;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.linguasEnsinadas = linguasEnsinadas;
    }
    
    public Usuario(TipoUsuario tipoUsuario){
        this.CPF = 000;
        this.RG = 000;
        this.telefone = 000;
        this.nome = "admin";
        this.dataNasc = "24/10/1999";
        this.senha = "admin";
        this.tipoUsuario = tipoUsuario;
    }
    
    public Usuario(){
        this.nome = "senhaerrada";
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
}
