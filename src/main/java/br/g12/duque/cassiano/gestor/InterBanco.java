/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.g12.duque.cassiano.gestor;

/**
 *
 * @author 08087
 */
public interface InterBanco {
    public boolean insert(); /* Metodos abstratos */
    public boolean update();
    public boolean delete();
    public boolean findAll();
    public boolean findById(int id);
    /* oque é uma interface? um conjunto de metodos abstratos */
    /* o que é um metodo abstratos? metodo sem implementação */
}
