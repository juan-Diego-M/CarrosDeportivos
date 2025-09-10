/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Nissan;

import Carros.Abstractas.Ruedas;

/**
 *
 * @author jdieg
 */
public class RuedasNissan extends Ruedas {

    public RuedasNissan(int tamano) {
        super(tamano);
    }

    @Override
    public void tipoDeRuedas() {
        System.out.println("Las ruedas de Nissan tienen un tamaño de " + getTamano() + " pulgadas.");
    }
}
