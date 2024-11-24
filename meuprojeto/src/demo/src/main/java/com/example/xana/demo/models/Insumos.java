package com.example.xana.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Insumos {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nomeinsumo")
    private String nomeins;
    @Column(name = "quantidade")
    private int quant;
    @Column(name = "preco")
    private double preco;
    @ManyToOne
    @JoinColumn(name = "receita_id")
    private Receita receita;


    public String getNome() {
        return nomeins;
    }
    public void setNome(String nomeins) {
        this.nomeins = nomeins;
    }
    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
