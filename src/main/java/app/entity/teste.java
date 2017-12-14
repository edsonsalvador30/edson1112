package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TESTE
 * @generated Gerada alteração no GitHub
 */
@Entity
@Table(name = "\"TESTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.teste")
public class teste implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "attribute_01", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_01;

  /**
  * @generated
  */
  @Column(name = "img", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] img;

  /**
  * @generated
  */
  @Column(name = "attribute_03", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String attribute_03;

  /**
  * @generated
  */
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String email;

  /**
   * Construtor
   * @generated
   */
  public teste(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public teste setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém attribute_01
   * return attribute_01
   * @generated
   */
  
  public java.lang.String getAttribute_01(){
    return this.attribute_01;
  }

  /**
   * Define attribute_01
   * @param attribute_01 attribute_01
   * @generated
   */
  public teste setAttribute_01(java.lang.String attribute_01){
    this.attribute_01 = attribute_01;
    return this;
  }

  /**
   * Obtém img
   * return img
   * @generated
   */
  
  public byte[] getImg(){
    return this.img;
  }

  /**
   * Define img
   * @param img img
   * @generated
   */
  public teste setImg(byte[] img){
    this.img = img;
    return this;
  }

  /**
   * Obtém attribute_03
   * return attribute_03
   * @generated
   */
  
  public java.lang.String getAttribute_03(){
    return this.attribute_03;
  }

  /**
   * Define attribute_03
   * @param attribute_03 attribute_03
   * @generated
   */
  public teste setAttribute_03(java.lang.String attribute_03){
    this.attribute_03 = attribute_03;
    return this;
  }

  /**
   * Obtém email
   * return email
   * @generated
   */
  
  public java.lang.String getEmail(){
    return this.email;
  }

  /**
   * Define email
   * @param email email
   * @generated
   */
  public teste setEmail(java.lang.String email){
    this.email = email;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    teste object = (teste)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
