package br.com.estrela.repositoty.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Table(name="sorteio",schema="apresentacao")
@Entity
public class Sorteio extends PanacheEntityBase{
   
    
    public Sorteio() {   
    }

    public Sorteio(LocalDate dtSorteia, String numeros) {
        super();
        this.dtSorteia = dtSorteia;
        this.numeros = numeros;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private LocalDate dtSorteia;
    
    private String numeros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDtSorteia() {
        return dtSorteia;
    }

    public void setDtSorteia(LocalDate dtSorteia) {
        this.dtSorteia = dtSorteia;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }  
}
