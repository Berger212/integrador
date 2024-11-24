package com.example.xana.demo.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Receita {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nomereceita")
    private String nomereceita;
    @Column(name = "porcoes")
    private String porcoes;
    @Column(name = "tempo")
    private String tempomedio;
    @Column(name = "insumos")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receita")
    private List<Insumos> insumos;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nomereceita;
    }
    public void setNome(String nomereceita) {
        this.nomereceita = nomereceita;
    }
    public String getPorcoes() {
        return porcoes;
    }
    public void setPorcoes(String porcoes) {
        this.porcoes = porcoes;
    }
    public String getTempomedio() {
        return tempomedio;
    }
    public void setTempomedio(String tempomedio) {
        this.tempomedio = tempomedio;
    }
    public List<Insumos> getInsumos() {
        return insumos;
    }
    public void setInsumos(List<Insumos> insumos) {
        this.insumos = insumos;
    }
    
}
