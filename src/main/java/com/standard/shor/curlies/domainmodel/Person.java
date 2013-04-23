/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.standard.shor.curlies.domainmodel;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author sbowen
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Account", propOrder = { "version", "status", "deviceProfiles", "socialNetworkAccounts", "channelListId" })
@XmlRootElement(name = "account")
@Entity
@NamedQueries(value = { @NamedQuery(name = "account.findAccount", query = "SELECT a FROM Account a WHERE a.objectIDString=:accountId") })
public class Person {
  
  @javax.persistence.Id
  private long id;
  
  private String name;
  
  private String gender;
  
  private String address;

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
