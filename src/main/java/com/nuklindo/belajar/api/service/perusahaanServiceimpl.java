/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuklindo.belajar.api.service;

import com.nuklindo.belajar.api.model.perusahaan;
import com.nuklindo.belajar.api.reposity.perusahaanReposity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author albi
 */
@Service
@Transactional(readOnly = true)
public class perusahaanServiceimpl implements perusahaanService{

    @Autowired
    private perusahaanReposity perusahaanreposity;
    
    @Transactional
    @Override
    public void save(perusahaan perusahaan) {
      perusahaanreposity.save(perusahaan);
    }

    @Transactional
    @Override
    public void update(perusahaan perusahaan) {
        perusahaanreposity.update(perusahaan);
    }

    @Transactional
    @Override
    public void delete(perusahaan perusahaan) {
         perusahaanreposity.delete(perusahaan);
    }
    
    @Transactional
    @Override
    public perusahaan getPerusahaan(String id) {
        return perusahaanreposity.getPerusahaan(id);
    }
     
    @Transactional
    @Override
    public List<perusahaan> getPerusahaans() {
       return perusahaanreposity.getPerusahaans();
               }
    
}
