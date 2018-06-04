/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuklindo.belajar.api.reposity;

import com.nuklindo.belajar.api.model.perusahaan;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;
/**
 *
 * @author albi
 */
@Repository
public class perusahaanReposityimpl implements perusahaanReposity{

     @Autowired
    private SessionFactory sessionFactory;
     
    @Override
    public void save(perusahaan perusahaan) {
     sessionFactory.getCurrentSession().save(perusahaan);
    }

    @Override
    public void update(perusahaan perusahaan) {
         sessionFactory.getCurrentSession().update(perusahaan);
    }

    @Override
    public void delete(perusahaan perusahaan) {
        sessionFactory.getCurrentSession().delete(perusahaan);
    }

    @Override
    public perusahaan getPerusahaan(String id) {
         return sessionFactory.getCurrentSession().get(perusahaan.class, id);
    }

    @Override
    public List<perusahaan> getPerusahaans() {
        return sessionFactory.getCurrentSession().createCriteria(perusahaan.class).list();
    }
    
}
