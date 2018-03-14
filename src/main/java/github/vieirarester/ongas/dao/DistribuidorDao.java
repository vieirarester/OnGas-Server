/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.vieirarester.ongas.dao;

import github.vieirarester.ongas.modelo.entidades.Distribuidor;

/**
 *
 * @author Ester
 */
public interface DistribuidorDao extends Dao<Distribuidor>{
    
    public Distribuidor recuperarPorCnpj(String cnpj);
}
