package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("validacoesDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface validacoesDAO extends JpaRepository<validacoes, java.lang.String> {

  /**
   * Obtém a instância de validacoes utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM validacoes entity WHERE entity.id = :id")
  public validacoes findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de validacoes utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM validacoes entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM validacoes entity WHERE entity.cpf like concat('%',coalesce(:search,''),'%') OR entity.cnpj like concat('%',coalesce(:search,''),'%') OR entity.cep like concat('%',coalesce(:search,''),'%') OR entity.celular like concat('%',coalesce(:search,''),'%') OR entity.telefone like concat('%',coalesce(:search,''),'%')")
  public Page<validacoes> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM validacoes entity WHERE (:attribute_01 is null OR entity.attribute_01 = :attribute_01) AND (:attribute_02 is null OR entity.attribute_02 = :attribute_02) AND (:attribute_03 is null OR entity.attribute_03 = :attribute_03) AND (:double_sem_mask is null OR entity.double_sem_mask = :double_sem_mask) AND (:doublemask is null OR entity.doublemask = :doublemask) AND (:cpf is null OR entity.cpf like concat('%',:cpf,'%')) AND (:cnpj is null OR entity.cnpj like concat('%',:cnpj,'%')) AND (:cep is null OR entity.cep like concat('%',:cep,'%')) AND (:celular is null OR entity.celular like concat('%',:celular,'%')) AND (:telefone is null OR entity.telefone like concat('%',:telefone,'%'))")
  public Page<validacoes> specificSearch(@Param(value="attribute_01") java.util.Date attribute_01, @Param(value="attribute_02") java.util.Date attribute_02, @Param(value="attribute_03") java.util.Date attribute_03, @Param(value="double_sem_mask") java.lang.Double double_sem_mask, @Param(value="doublemask") java.lang.Double doublemask, @Param(value="cpf") java.lang.String cpf, @Param(value="cnpj") java.lang.String cnpj, @Param(value="cep") java.lang.String cep, @Param(value="celular") java.lang.String celular, @Param(value="telefone") java.lang.String telefone, Pageable pageable);
  
}
