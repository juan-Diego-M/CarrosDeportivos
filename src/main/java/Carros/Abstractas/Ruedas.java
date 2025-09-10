/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Abstractas;

/**
 *
 * @author jdieg
 */
public abstract class Ruedas {
    private int tamano; 


    public Ruedas(int tamano) {
        this.tamano = tamano;
    }


    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public abstract void tipoDeRuedas();
}
