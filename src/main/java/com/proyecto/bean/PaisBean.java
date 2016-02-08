/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bean;

import com.proyecto.model.Pais;
import com.proyecto.service.PaisServiceImpl;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author ricardotoledo
 */
@Named(value = "paisBean")
@SessionScoped
public class PaisBean implements Serializable {
    @Inject
    private PaisServiceImpl pService;

    private Pais selectedPais;

    public Pais getSelectedPais() {
        return selectedPais;
    }

    public void setSelectedPais(Pais selectedPais) {
        this.selectedPais = selectedPais;
    }
    public List<Pais> complete(String query) {
        List<Pais> paises = pService.findByName(query);
        return paises;
    }

}
