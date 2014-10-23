/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compraventa.ejb;

import compraventa.entity.Proveedores;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marcelo
 */
@Stateless
public class ProveedoresFacade extends AbstractFacade<Proveedores> implements ProveedoresFacadeLocal {
    @PersistenceContext(unitName = "TPWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProveedoresFacade() {
        super(Proveedores.class);
    }
    
}
