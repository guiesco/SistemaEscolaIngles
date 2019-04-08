/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import entidades.Turmas;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author guies
 */
public class TurmaDAO {
    private final String filename = "Turmas.dat";
    private HashMap<Integer, Turmas> cacheTurmas = new HashMap<>();

    private static TurmaDAO TurmaDAO;

    public static TurmaDAO getInstancia(){
        if (TurmaDAO == null){
            TurmaDAO = new TurmaDAO();
        }
        return TurmaDAO;
    }

    public TurmaDAO(){
        load();
    }

    public void persist(){
        try {
            FileOutputStream fout = new FileOutputStream(filename);

            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheTurmas);

            oo.flush();
            fout.flush();

            oo.close();
            fout.close();
            oo = null;
            fout = null;

        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void load(){
        try {
            FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream oi = new ObjectInputStream(fin);

            this.cacheTurmas = (HashMap<Integer, Turmas>) oi.readObject();

            oi.close();
            fin.close();
            oi = null;
            fin = null;
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Ainda não existe nenhum Turma cadastrado.");
        }
    }

    public void put(Turmas Turma){
        cacheTurmas.put(Turma.getId(), Turma);
        persist();
    }

    public Turmas get(Integer idTurma){
        return cacheTurmas.get(idTurma);
    }

    public void remove (Turmas Turma){
        cacheTurmas.remove(Turma.getId(), Turma);
        persist();
    }

    public Collection<Turmas> getList(){
        return cacheTurmas.values();
    }
}
