package com.nuklindo.belajar.api.model;

/**
 *
 * @author albi dwi
 * email:alber9193@gmail.co
 */

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "perusahaan")
@Getter
@Setter
public class perusahaan implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
private int id;

@Column(name="kdInst")
private String kdInst;
@Column(name="cabang")
private String cabang;
@Column(name="nmInst")
private String nmInst;
@Column(name="alamat")
private String alamat;


  @Override public String toString() {
    return String.format("%s (id: %d)",id, kdInst, cabang,nmInst,alamat);
  }
}
