/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuklindo.belajar.api.reposity;

/**
 *
 * @author albi
 */
import com.nuklindo.belajar.api.model.perusahaan;

import java.util.List;

public interface perusahaanReposity {
 public void save(perusahaan perusahaan);
 public void update(perusahaan perusahaan);
 public void delete(perusahaan perusahaan);
 public perusahaan getPerusahaan(String id);
 public List<perusahaan> getPerusahaans();
}
