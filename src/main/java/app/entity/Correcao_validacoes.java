package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CORRECAO_VALIDACOES
 * @generated
 */
@Entity
@Table(name = "\"CORRECAO_VALIDACOES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Correcao_validacoes")
public class Correcao_validacoes implements Serializable {

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
  @Column(name = "custo_total", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double custo_total;

  /**
   * Construtor
   * @generated
   */
  public Correcao_validacoes(){
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
  public Correcao_validacoes setId(java.lang.String id){
    this.id = id;
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
  public Correcao_validacoes setCpf(java.lang.String cpf){
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
  public Correcao_validacoes setCnpj(java.lang.String cnpj){
    this.cnpj = cnpj;
    return this;
  }

  /**
   * Obtém custo_total
   * return custo_total
   * @generated
   */
  
  public java.lang.Double getCusto_total(){
    return this.custo_total;
  }

  /**
   * Define custo_total
   * @param custo_total custo_total
   * @generated
   */
  public Correcao_validacoes setCusto_total(java.lang.Double custo_total){
    this.custo_total = custo_total;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Correcao_validacoes object = (Correcao_validacoes)obj;
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
