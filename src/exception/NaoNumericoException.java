/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author guies
 */
import javax.swing.*;

public class NaoNumericoException extends Exception {

    public NaoNumericoException (){
        this("Por favor, digite apenas numeros nos campos apropriados.");
    }

    public NaoNumericoException (String msg){
        super(msg);
    }

}
