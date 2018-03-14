/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.vieirarester.ongas.repositorios;

import github.vieirarester.ongas.dao.DaoManagerHiber;
import github.vieirarester.ongas.modelo.entidades.Distribuidor;
import java.util.List;
import github.vieirarester.ongas.dao.DistribuidorDao;

/**
 *
 * @author Ester
 */
public class RepositorioDistribuidor implements DistribuidorDao {

    @Override
    public Distribuidor recuperarPorCnpj(String cnpj) {
        try {
            return (Distribuidor) DaoManagerHiber.getInstance().recover("from Distribuidor where cnpj='" + cnpj + "'").get(0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public void cadastrar(Distribuidor o) {
        DaoManagerHiber.getInstance().persist(o);
    }

    @Override
    public void deletar(Distribuidor o) {
        DaoManagerHiber.getInstance().delete(o);
    }

    @Override
    public void atualizar(Distribuidor o) {
        DaoManagerHiber.getInstance().update(o);
    }

    @Override
    public Distribuidor recuperar(int id) {
        try {
            return (Distribuidor) DaoManagerHiber.getInstance().recover("from Distribuidor where id" + id).get(0);
        } catch (IndexOutOfBoundsException excecao) {
            return null;
        }
    }

    @Override
    public List<Distribuidor> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Distribuidor");
    }

}
