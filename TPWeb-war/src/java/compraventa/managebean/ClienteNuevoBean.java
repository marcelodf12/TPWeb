/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraventa.managebean;

import compraventa.entity.Clientes;
import compraventa.rest.service.ClientesFacadeREST;
import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author marcelo
 */
@Named(value = "clienteNuevoBean")
@ManagedBean
@SessionScoped
public class ClienteNuevoBean implements Serializable {

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public ClienteNuevoBean() {
        System.out.println("Se creo una instancia");

    }
    @EJB
    ClientesFacadeREST clienteRest;

    private Integer ci;
    private String email;
    private String nombre;

    public void setCi(Integer ci) {
        this.ci = ci;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCi() {
        return ci;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public void preparar() {
        nombre = "nombre";
        ci=1;
        email="a@n.com";
    }

    public void save() {
        System.out.println("entra");
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            Clientes c = new Clientes();
            c.setNombre(nombre);
            c.setCi(ci);
            c.setEmail(email);
            System.out.print("Nombre: ");
            System.out.println(nombre);
            System.out.print("email: ");
            System.out.println(email);
            System.out.print("Ci: ");
            System.out.println(ci);
            clienteRest.create(c);
            nombre="";
            ci=0;
            email="";
            context.addMessage(null, new FacesMessage("Exito. Se creo correctamente"));
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e.toString()));
        }

    }

}
