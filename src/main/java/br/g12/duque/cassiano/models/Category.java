/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.cassiano.models;

/**
 *
 * @author 08087
 */
public class Category {
    private int id;
    private String name;
    private String description;
    // Contrutor ----------------------
    public Category(){
        System.out.println("Categoria criada");
    }
    
    public Category(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
        
    }
    
    // Construtor para o carregamento de combobox
    public Category(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    // Construtor que será usado no form de cadastro
    public Category(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        
        
    }
}
