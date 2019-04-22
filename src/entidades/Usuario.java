/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author guies
 */
public class Usuario implements Serializable {
    
    private static int nextIdUser = 0;
    private int idUsuario;
    private String CPF;
    private long RG;
    private String telefone;
    private String nome;
    private String dataNasc;
    private String endereco;
    private String senha;
    private ArrayList<String> linguasEnsinadas;
    private ArrayList<Turmas> turmas;
    private TipoUsuario tipoUsuario;

    public Usuario(String CPF, long RG, String telefone, String nome, String dataNasc, String endereco, String senha, TipoUsuario tipoUsuario) {
        this.idUsuario = this.nextIdUser;
        this.nextIdUser++;
        this.CPF = CPF;
        this.RG = RG;
        this.telefone = telefone;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
    
    public Usuario(String CPF, long RG, String telefone, String nome, String dataNasc, String endereco, String senha, TipoUsuario tipoUsuario, ArrayList<String> linguasEnsinadas) {
        this.idUsuario = this.nextIdUser;
        this.nextIdUser++;
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
        this.idUsuario = this.nextIdUser;
        this.nextIdUser++;
        this.CPF = "000.000.000-00";
        this.RG = 000;
        this.telefone = "000";
        this.nome = "admin";
        this.dataNasc = "24/10/1999";
        this.senha = "admin";
        this.tipoUsuario = tipoUsuario;
    }

    public static int getNextIdUser() {
        return nextIdUser;
    }

    public static void setNextIdUser(int nextIdUser) {
        Usuario.nextIdUser = nextIdUser;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<String> getLinguasEnsinadas() {
        return linguasEnsinadas;
    }

    public void setLinguasEnsinadas(ArrayList<String> linguasEnsinadas) {
        this.linguasEnsinadas = linguasEnsinadas;
    }

    public ArrayList<Turmas> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turmas> turmas) {
        this.turmas = turmas;
    }
    
    public Usuario(){
        this.nome = "senhaerrada";
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public long getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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
