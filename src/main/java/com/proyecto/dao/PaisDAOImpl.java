package com.proyecto.dao;

import com.proyecto.model.Pais;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ricardotoledo
 */
public class PaisDAOImpl implements PaisDAO{
 @PersistenceContext
    private EntityManager em;
    @Override
    public void save(Pais p) {
        em.persist(p);
    }

    @Override
    public void edit(Pais p) {
        em.merge(p);
    }

    @Override
    public void delete(Pais p) {
        em.remove(em.merge(p));
    }

    @Override
    public List<Pais> list() {
        String sql = "select p from Pais p ";
        Query query = em.createQuery(sql);
        List<Pais> list= query.getResultList();
        return list;
    }

    @Override
    public Pais find(Pais p) {
        String sql = "select p from Pais p WHERE p.id =" + p.getId();
        Query query = em.createQuery(sql);
        Pais pais= (Pais) query.getSingleResult();
        return pais;
    }

    public Pais findById(Integer id) {
        String sql = "select p from Pais p WHERE p.id =" + id;
        Query query = em.createQuery(sql);
        Pais pais= (Pais) query.getSingleResult();
        return pais;
    }
    
    public List<Pais> findByName(String nombre) {
               
       
        
        String sql = "SELECT p FROM Pais p WHERE p.nombre LIKE :x";
        Query query = em.createQuery(sql);
        query.setParameter("x", '%' + nombre + '%');
        List<Pais> list= query.getResultList();
        return list;
        
    }
}
