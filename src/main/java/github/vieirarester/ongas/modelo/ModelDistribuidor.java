/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.vieirarester.ongas.modelo;

import github.vieirarester.ongas.dao.DistribuidorDao;
import github.vieirarester.ongas.modelo.entidades.Distribuidor;
import github.vieirarester.ongas.repositorios.RepositorioDistribuidor;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Ester
 */
@ManagedBean
@SessionScoped
public class ModelDistribuidor {

    DistribuidorDao repositorioDistribuidor;

    private Distribuidor distribuidor;

    @PostConstruct
    public void inicializar() {
        repositorioDistribuidor = new RepositorioDistribuidor();

        distribuidor = new Distribuidor();
    }

    public Distribuidor getDistribuidor() {
        return this.distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String cadastrarDistribuidor(String cnpj, String nome, double preco) {
        try {
            if (repositorioDistribuidor.recuperarPorCnpj(cnpj) != null) {
                throw new Exception("CNPJ já registrado!");
            }

            Distribuidor d = new Distribuidor();
            d.setCnpj(cnpj);
            d.setNome(nome);
            d.setPreco(preco);

            this.repositorioDistribuidor.cadastrar(d);

        } catch (Exception e) {
            return null;
        }
        return "";
    }

    public Distribuidor recuperarDistribuidor(int id) {
        if (id != 0) {
            return this.repositorioDistribuidor.recuperar(id);
        }
        return null;
    }
    
    public List<Distribuidor> recuperarDistribuidores(){
        return this.repositorioDistribuidor.recuperarTodos();
    }

}
