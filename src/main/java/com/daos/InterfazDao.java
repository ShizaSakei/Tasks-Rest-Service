/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;

import java.util.List;

/**
 *
 * @author Potato Power
 * @param <T>
 */
public interface InterfazDao <T>{
    public void guardar (T obj)throws Exception;
    public void modificar (T obj)throws Exception;
    public T obtener (Long id);
    public List<T> listar();
}
