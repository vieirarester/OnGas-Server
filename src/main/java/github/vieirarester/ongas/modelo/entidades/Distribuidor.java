/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.vieirarester.ongas.modelo.entidades;

import com.google.gson.annotations.Expose;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Ester
 */
@Entity
public class Distribuidor {
    @Id
    @GeneratedValue
    private int id;
    @Expose
    @Column
    private String cnpj;
    @Expose
    @Column
    private String nome;
    @Expose
    @Column
    private double preco;
    
    public Distribuidor(){
        
    }
    
    public Distribuidor(String cnpj, String nome, double preco){
        this.cnpj = cnpj;
        this.nome = nome;
        this.preco = preco;
    }   

    public int getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
