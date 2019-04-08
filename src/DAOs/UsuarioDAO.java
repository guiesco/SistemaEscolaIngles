/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

/**
 *
 * @author guies
 */
import entidades.Usuario;

import javax.swing.*;
import java.io.*;
import java.util.Collection;
import java.util.HashMap;

public class UsuarioDAO {

    private final String filename = "Usuarios.dat";
    private HashMap<Integer, Usuario> cacheUsuarios = new HashMap<>();

    private static UsuarioDAO UsuarioDAO;

    public static UsuarioDAO getInstancia(){
        if (UsuarioDAO == null){
            UsuarioDAO = new UsuarioDAO();
        }
        return UsuarioDAO;
    }

    public UsuarioDAO(){
        load();
    }

    public void persist(){
        try {
            FileOutputStream fout = new FileOutputStream(filename);

            ObjectOutputStream oo = new ObjectOutputStream(fout);
            oo.writeObject(cacheUsuarios);

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

            this.cacheUsuarios = (HashMap<Integer, Usuario>) oi.readObject();

            oi.close();
            fin.close();
            oi = null;
            fin = null;
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Ainda não existe nenhum Usuario cadastrado.");
        }
    }

    public void put(Usuario Usuario){
        cacheUsuarios.put(Usuario.getCPF(), Usuario);
        persist();
    }

    public Usuario get(Integer idUsuario){
        return cacheUsuarios.get(idUsuario);
    }

    public void remove (Usuario Usuario){
        cacheUsuarios.remove(Usuario.getCPF(), Usuario);
        persist();
    }

    public Collection<Usuario> getList(){
        return cacheUsuarios.values();
    }
}
