/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.standard.shor.curlies.domainmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author sbowen
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Account", propOrder = { "version", "name", "gender", "address"})
@XmlRootElement(name = "account")
@Entity
public class Person {
  
  @javax.persistence.Id
  private long id;
  
  @Version
  private Integer version;
  
  @Column(name = "name", nullable = false)
  private String name;
  
  @Column(name = "gender", nullable = false)
  private String gender;
  
  @Column(name = "address", nullable = false)
  private String address;

  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }
  
  

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  
  
}
