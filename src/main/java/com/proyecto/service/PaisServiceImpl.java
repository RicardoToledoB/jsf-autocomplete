/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.service;

import com.proyecto.dao.PaisDAOImpl;
import com.proyecto.model.Pais;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author ricardotoledo
 */
@LocalBean
@Stateless
public class PaisServiceImpl implements PaisService {
    @Inject
    private PaisDAOImpl pDAO;
    @Override
    public void save(Pais p) {
        pDAO.save(p);
    }

    @Override
    public void edit(Pais p) {
        pDAO.edit(p);
    }

    @Override
    public void delete(Pais p) {
        pDAO.delete(p);
    }

    @Override
    public List<Pais> list() {
        return pDAO.list();
    }

    @Override
    public Pais find(Pais p) {
        return pDAO.find(p);
    }
    public List<Pais> findByName(String nombre) {
              return pDAO.findByName(nombre);
    }
    
    public Pais findById(Integer id) {
         return pDAO.findById(id);
    }
}
