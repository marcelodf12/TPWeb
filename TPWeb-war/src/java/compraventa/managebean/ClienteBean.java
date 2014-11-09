/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraventa.managebean;

import compraventa.entity.Clientes;
import compraventa.rest.service.ClientesFacadeREST;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author marcelo
 */
@Named(value = "clienteBean")
@Dependent
@ManagedBean
public class ClienteBean {

    @EJB
    ClientesFacadeREST clienteRest;

    private List<Clientes> clientes;    
   
    public List<Clientes> getClientes(){
        clientes = clienteRest.findAll();
        return clientes;
    }


}
