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
public class Turmas {
    
    private int id;
    private Lingua lingua;
    private int diaSemana;
    private int horarioAula;
    private Usuario professor;
    private ArrayList<Usuario> Aluno;

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

    public ArrayList<Usuario> getAluno() {
        return Aluno;
    }

    public void setAluno(ArrayList<Usuario> Aluno) {
        this.Aluno = Aluno;
    }
    
    
    
}
