/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author guies
 */
public class Turmas {
    
    private static int nextIdTurma = 0;
    private int id;
    private Lingua lingua;
    private int nivel;
    private int diaSemana;
    private int horarioAula;
    private Usuario professor;
    private Map<Usuario, Status> alunosStatus;
    private boolean ativa;
    
    
    public Turmas( Lingua lingua, int diaSemana, int horarioAula, Usuario professor, int nivel){
        this.nextIdTurma++;
        this.id = nextIdTurma;
        this.lingua = lingua;
        this.diaSemana = diaSemana;
        this.horarioAula = horarioAula;
        this.professor = professor;
        this.nivel = nivel;
        this.alunosStatus = new HashMap<Usuario, Status>();
        this.ativa = true;
    }
    
    public void fechaTurma(){
        this.ativa = false;
    }
    
    public static int getNextIdTurma() {
        return nextIdTurma;
    }

    public static void setNextIdTurma(int nextIdTurma) {
        Turmas.nextIdTurma = nextIdTurma;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Map<Usuario, Status> getStatus() {
        return alunosStatus;
    }

    public void setStatus(Map<Usuario, Status> status) {
        this.alunosStatus = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lingua getLingua() {
        return lingua;
    }

    public void setLingua(Lingua lingua) {
        this.lingua = lingua;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getHorarioAula() {
        return horarioAula;
    }

    public void setHorarioAula(int horarioAula) {
        this.horarioAula = horarioAula;
    }

    public Usuario getProfessor() {
        return professor;
    }

    public void setProfessor(Usuario professor) {
        this.professor = professor;
    }
}
