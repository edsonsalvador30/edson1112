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
@Repository("testeDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface testeDAO extends JpaRepository<teste, java.lang.String> {

  /**
   * Obtém a instância de teste utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM teste entity WHERE entity.id = :id")
  public teste findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de teste utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM teste entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM teste entity WHERE entity.attribute_01 like concat('%',coalesce(:search,''),'%') OR entity.attribute_03 like concat('%',coalesce(:search,''),'%') OR entity.email like concat('%',coalesce(:search,''),'%')")
  public Page<teste> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM teste entity WHERE (:attribute_01 is null OR entity.attribute_01 like concat('%',:attribute_01,'%')) AND (:attribute_03 is null OR entity.attribute_03 like concat('%',:attribute_03,'%')) AND (:email is null OR entity.email like concat('%',:email,'%'))")
  public Page<teste> specificSearch(@Param(value="attribute_01") java.lang.String attribute_01, @Param(value="attribute_03") java.lang.String attribute_03, @Param(value="email") java.lang.String email, Pageable pageable);
  
}
