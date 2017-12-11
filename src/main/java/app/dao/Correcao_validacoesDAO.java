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
@Repository("Correcao_validacoesDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Correcao_validacoesDAO extends JpaRepository<Correcao_validacoes, java.lang.String> {

  /**
   * Obtém a instância de Correcao_validacoes utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Correcao_validacoes entity WHERE entity.id = :id")
  public Correcao_validacoes findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Correcao_validacoes utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Correcao_validacoes entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Correcao_validacoes entity WHERE entity.cpf like concat('%',coalesce(:search,''),'%') OR entity.cnpj like concat('%',coalesce(:search,''),'%')")
  public Page<Correcao_validacoes> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Correcao_validacoes entity WHERE (:cpf is null OR entity.cpf like concat('%',:cpf,'%')) AND (:cnpj is null OR entity.cnpj like concat('%',:cnpj,'%')) AND (:custo_total is null OR entity.custo_total = :custo_total)")
  public Page<Correcao_validacoes> specificSearch(@Param(value="cpf") java.lang.String cpf, @Param(value="cnpj") java.lang.String cnpj, @Param(value="custo_total") java.lang.Double custo_total, Pageable pageable);
  
}
