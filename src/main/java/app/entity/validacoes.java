package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela VALIDACOES
 * @generated
 */
@Entity
@Table(name = "\"VALIDACOES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.validacoes")
public class validacoes implements Serializable {

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
  @Temporal(TemporalType.TIME)
  @Column(name = "attribute_01", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date attribute_01;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "attribute_02", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date attribute_02;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "attribute_03", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date attribute_03;

  /**
  * @generated
  */
  @Column(name = "double_sem_mask", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double double_sem_mask;

  /**
  * @generated
  */
  @Column(name = "doublemask", nullable = true, unique = false, precision=6, scale=2, insertable=true, updatable=true)
  
  private java.lang.Double doublemask;

  /**
  * @generated
  */
  @Column(name = "cpf", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cpf;

  /**
  * @generated
  */
  @Column(name = "cnpj", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cnpj;

  /**
  * @generated
  */
  @Column(name = "cep", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String cep;

  /**
  * @generated
  */
  @Column(name = "celular", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String celular;

  /**
  * @generated
  */
  @Column(name = "telefone", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String telefone;

  /**
  * @generated
  */
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

  /**
  * @generated
  */
  @Column(name = "valor2", nullable = true, unique = false, precision=5, scale=2, insertable=true, updatable=true)
  
  private java.lang.Double valor2;

  /**
   * Construtor
   * @generated
   */
  public validacoes(){
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
  public validacoes setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém attribute_01
   * return attribute_01
   * @generated
   */
  
  public java.util.Date getAttribute_01(){
    return this.attribute_01;
  }

  /**
   * Define attribute_01
   * @param attribute_01 attribute_01
   * @generated
   */
  public validacoes setAttribute_01(java.util.Date attribute_01){
    this.attribute_01 = attribute_01;
    return this;
  }

  /**
   * Obtém attribute_02
   * return attribute_02
   * @generated
   */
  
  public java.util.Date getAttribute_02(){
    return this.attribute_02;
  }

  /**
   * Define attribute_02
   * @param attribute_02 attribute_02
   * @generated
   */
  public validacoes setAttribute_02(java.util.Date attribute_02){
    this.attribute_02 = attribute_02;
    return this;
  }

  /**
   * Obtém attribute_03
   * return attribute_03
   * @generated
   */
  
  public java.util.Date getAttribute_03(){
    return this.attribute_03;
  }

  /**
   * Define attribute_03
   * @param attribute_03 attribute_03
   * @generated
   */
  public validacoes setAttribute_03(java.util.Date attribute_03){
    this.attribute_03 = attribute_03;
    return this;
  }

  /**
   * Obtém double_sem_mask
   * return double_sem_mask
   * @generated
   */
  
  public java.lang.Double getDouble_sem_mask(){
    return this.double_sem_mask;
  }

  /**
   * Define double_sem_mask
   * @param double_sem_mask double_sem_mask
   * @generated
   */
  public validacoes setDouble_sem_mask(java.lang.Double double_sem_mask){
    this.double_sem_mask = double_sem_mask;
    return this;
  }

  /**
   * Obtém doublemask
   * return doublemask
   * @generated
   */
  
  public java.lang.Double getDoublemask(){
    return this.doublemask;
  }

  /**
   * Define doublemask
   * @param doublemask doublemask
   * @generated
   */
  public validacoes setDoublemask(java.lang.Double doublemask){
    this.doublemask = doublemask;
    return this;
  }

  /**
   * Obtém cpf
   * return cpf
   * @generated
   */
  
  public java.lang.String getCpf(){
    return this.cpf;
  }

  /**
   * Define cpf
   * @param cpf cpf
   * @generated
   */
  public validacoes setCpf(java.lang.String cpf){
    this.cpf = cpf;
    return this;
  }

  /**
   * Obtém cnpj
   * return cnpj
   * @generated
   */
  
  public java.lang.String getCnpj(){
    return this.cnpj;
  }

  /**
   * Define cnpj
   * @param cnpj cnpj
   * @generated
   */
  public validacoes setCnpj(java.lang.String cnpj){
    this.cnpj = cnpj;
    return this;
  }

  /**
   * Obtém cep
   * return cep
   * @generated
   */
  
  public java.lang.String getCep(){
    return this.cep;
  }

  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public validacoes setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }

  /**
   * Obtém celular
   * return celular
   * @generated
   */
  
  public java.lang.String getCelular(){
    return this.celular;
  }

  /**
   * Define celular
   * @param celular celular
   * @generated
   */
  public validacoes setCelular(java.lang.String celular){
    this.celular = celular;
    return this;
  }

  /**
   * Obtém telefone
   * return telefone
   * @generated
   */
  
  public java.lang.String getTelefone(){
    return this.telefone;
  }

  /**
   * Define telefone
   * @param telefone telefone
   * @generated
   */
  public validacoes setTelefone(java.lang.String telefone){
    this.telefone = telefone;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public validacoes setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * Obtém valor2
   * return valor2
   * @generated
   */
  
  public java.lang.Double getValor2(){
    return this.valor2;
  }

  /**
   * Define valor2
   * @param valor2 valor2
   * @generated
   */
  public validacoes setValor2(java.lang.Double valor2){
    this.valor2 = valor2;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    validacoes object = (validacoes)obj;
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
