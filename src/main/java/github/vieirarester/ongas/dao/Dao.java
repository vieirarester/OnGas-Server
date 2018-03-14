/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.vieirarester.ongas.dao;

import java.util.List;

/**
 *
 * @author Ester
 */
public interface Dao <Objeto>{
    
    public void cadastrar(Objeto o);
    public void deletar(Objeto o);
    public void atualizar(Objeto o);
    public Objeto recuperar(int id);
    public List<Objeto> recuperarTodos();
}
