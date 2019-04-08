/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.TipoUsuario;
import entidades.Usuario;
import exception.NaoNumericoException;
import sistema.Telas.TelaLogin;

/**
 *
 * @author guies
 */
public class ControladorPrincipal {

    private static ControladorPrincipal controladorPrincipal;
    private TelaLogin tela;

    private ControladorPrincipal() {
        this.tela = new TelaLogin();
    }

    public static ControladorPrincipal getInstance() {
        if (controladorPrincipal == null) {
            controladorPrincipal = new ControladorPrincipal();
        }
        return controladorPrincipal;
    }

    public void inicia() {
        tela.setVisible(true);
    }

    public void cadastraAluno() {
        ControladorUsuarios.getInstance().telaRegistraAluno();
    }

    public void login(String cpf, String senha) throws NaoNumericoException {
        try {
            int cpfInt = Integer.parseInt(cpf);
            Usuario loginUser = ControladorUsuarios.getInstance().login(cpfInt, senha);
            if (loginUser != null) {
                if (loginUser.getNome().equals("senhaerrada")) {
                    tela.senhaErrada();
                }else{
                    switch(loginUser.getTipoUsuario().getCodigo()){
                        case 0:
                            //ControladorUsuarios.getInstance().iniciaAluno();
                            break;
                        case 1:
                            ControladorUsuarios.getInstance().iniciaProfessor(loginUser);
                            break;
                        case 2:
                            //ControladorUsuarios.getInstance().iniciaAdmin();
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (NumberFormatException exception) {
            throw new NaoNumericoException();
        }
    }
}
