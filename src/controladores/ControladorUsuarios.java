/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import DAOs.UsuarioDAO;
import entidades.TipoUsuario;
import entidades.Turmas;
import entidades.Usuario;
import exception.NaoNumericoException;
import java.util.ArrayList;
import sistema.Telas.TelaCadastroProfessor;
import telas.TelaAdmin;
import telas.TelaAluno;
import telas.TelaCadastroAluno;
import telas.TelaProfessor;

/**
 *
 * @author guies
 */
public class ControladorUsuarios {
    
    private static ControladorUsuarios controladorUsuarios;
    private TelaCadastroAluno telaCadastroAluno;
    private TelaCadastroProfessor telaCadastroProfessor;
    private TelaProfessor telaProfessor;
    private TelaAluno telaAluno;
    private TelaAdmin telaAdmin;
    private Usuario usuarioLogado;
    
    private ControladorUsuarios(){
        cadastraAdmin();
        this.telaCadastroAluno = new TelaCadastroAluno();
        this.telaCadastroProfessor = new TelaCadastroProfessor();
        this.telaProfessor = new TelaProfessor();
        this.telaAluno = new TelaAluno();
        this.telaAdmin = new TelaAdmin();
    }
    
    public static ControladorUsuarios getInstance(){
        if (controladorUsuarios == null){
            controladorUsuarios = new ControladorUsuarios();
        }
        return controladorUsuarios;
    }
    
    private Usuario cadastraAdmin(){
        if(!existeADM(TipoUsuario.ADMIN)){
            Usuario novoAluno = new Usuario(TipoUsuario.ADMIN);
            UsuarioDAO.getInstancia().put(novoAluno);
            return novoAluno;
        }else{
            return null;
        }
    }
    
    public Usuario cadastraAluno(int CPF, int RG, int telefone, String nome, String dataNasc, String endereco, String senha){
        if(existe(CPF) == null){
            Usuario novoAluno = new Usuario(CPF,RG,telefone, nome, dataNasc, endereco, senha, TipoUsuario.ALUNO);
            UsuarioDAO.getInstancia().put(novoAluno);
            return novoAluno;
        }else{
            return null;
        }
    }
    
    public Usuario cadastraProfessor(int CPF, int RG, int telefone, String nome, String dataNasc, String endereco, String senha, ArrayList<String> linguasEnsinadas){
        if(existe(CPF) == null){
            Usuario novoProfessor = new Usuario(CPF,RG,telefone, nome, dataNasc, endereco, senha, TipoUsuario.PROFESSOR, linguasEnsinadas);
            UsuarioDAO.getInstancia().put(novoProfessor);
            return novoProfessor;
        }else{
            return null;
        }
    }
    
    public void telaRegistraAluno(){
        telaCadastroAluno.setVisible(true);
    }
    
    public void registraAluno(String nome, String rg, String cpf, String telefone, String endereco, String dataNasc, String senha) throws NaoNumericoException{
        try{
            long rgI,cpfI, telefoneI;
            String cpf2;
            rgI = Long.parseLong(rg);
            cpfI = Long.parseLong(cpf.replaceAll("\\-|\\.", ""));
            telefoneI = Integer.parseInt(telefone.replaceAll("\\-", ""));
            Usuario novoAluno = cadastraAluno(12, 12, 12, nome, dataNasc, endereco, senha);
            if(novoAluno == null){
                telaCadastroAluno.usuarioExistente();
            }else{
                telaCadastroAluno.novoUsuarioSucesso();
            }
        }catch (NumberFormatException exception) {
            throw new NaoNumericoException();
        }
    }
    
    public Usuario login(int cpf, String senha){
        Usuario loginUser = existe(cpf);
        if (loginUser != null){
            if(loginUser.getSenha().equals(senha)){
                return loginUser;
            }else{
                return new Usuario();
            }
        }
        return loginUser;
    }
    
    public Usuario existe(int CPF){
        for(Usuario usuario : UsuarioDAO.getInstancia().getList()){
            if(usuario.getCPF() == CPF){
                return usuario;
            }
        }
        return null;
    }
    
    public boolean existeADM(TipoUsuario tipo){
        for(Usuario usuario : UsuarioDAO.getInstancia().getList()){
            if(usuario.getTipoUsuario() == tipo){
                return true;
            }
        }
        return false;
    }
    
    public void iniciaProfessor(Usuario user){
        this.usuarioLogado = user;
        ArrayList<Turmas> turmas = ControladorTurmas.getInstance().getTurmasProfessor(user.getCPF());
        telaProfessor.setTurmas(turmas);
        telaProfessor.setVisible(true);
    }
}
