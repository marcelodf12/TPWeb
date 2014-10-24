/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compraventa.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author marcelo
 */
@Named(value = "clienteBean")
@SessionScoped
public class clienteBean implements Serializable {

    /**
     * Creates a new instance of clienteBean
     */
    public clienteBean() {
    }
    
    public String saludar(){
        return "hola mundo";
    }
    
}
