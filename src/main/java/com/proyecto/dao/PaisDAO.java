/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.proyecto.model.Pais;
import java.util.List;

/**
 *
 * @author ricardotoledo
 */
public interface PaisDAO {
     public void save(Pais p);
    public void edit(Pais p);
    public void delete(Pais p);
    public List<Pais> list();
    public Pais find(Pais p);
}
