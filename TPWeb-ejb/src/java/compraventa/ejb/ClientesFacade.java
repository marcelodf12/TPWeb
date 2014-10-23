/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compraventa.ejb;

import compraventa.entity.Clientes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marcelo
 */
@Stateless
public class ClientesFacade extends AbstractFacade<Clientes> implements ClientesFacadeLocal {
    public ClientesFacade() {
        super(Clientes.class);
    }
    
}
