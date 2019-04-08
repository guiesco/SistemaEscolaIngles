/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAOs.TurmaDAO;
import entidades.Turmas;
import java.util.ArrayList;
import telas.TelaTurma;

/**
 *
 * @author guies
 */
public class ControladorTurmas {
    
    private static ControladorTurmas controladorTurmas;
    private TelaTurma telaTurma;

    private ControladorTurmas() {
    }

    public static ControladorTurmas getInstance() {
        if (controladorTurmas == null) {
            controladorTurmas = new ControladorTurmas();
        }
        return controladorTurmas;
    }
    
    public ArrayList<Turmas> getTurmasProfessor(int cpf){
        ArrayList<Turmas> turmasSelec = new ArrayList<Turmas>(TurmaDAO.getInstancia().getList());
        return turmasSelec;
    }
    
    public void showTurmaID(int turmaId){
        for(Turmas turma : TurmaDAO.getInstancia().getList()){
            if(turma.getId() == turmaId){
                //telaTurma.showProf()
            }
        }
    }
}
