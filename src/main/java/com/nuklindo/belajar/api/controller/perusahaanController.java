/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuklindo.belajar.api.controller;

/**
 *
 * @author albi
 */
import com.nuklindo.belajar.api.model.perusahaan;
import com.nuklindo.belajar.api.service.perusahaanService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class perusahaanController {
    @Autowired
    private perusahaanService perusahaanservice;
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/perusahaan", method = RequestMethod.GET)
    public List<perusahaan> getPerusahaans() {
        return  perusahaanservice.getPerusahaans();
    }
    
      @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/perusahaan", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Map<Object, Object> savePerusahaan(@RequestBody perusahaan perusahaan) {
        perusahaanservice.save(perusahaan);

    Map<Object, Object> m = new HashMap<>();
        m.put("Success", Boolean.TRUE);
        m.put("Info", "Data Tersimpan");

        return m;
    }
      @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/perusahaan", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Map<String, Object> updateMakanan(@RequestBody perusahaan perusahaan) {
           perusahaanservice.update(perusahaan);

        Map<String, Object> m = new HashMap<>();
        m.put("Success", Boolean.TRUE);
        m.put("Info", "Data Berhasil di update");

        return m;
    }
}
