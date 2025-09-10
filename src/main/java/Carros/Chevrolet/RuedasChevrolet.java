/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Chevrolet;

import Carros.Abstractas.Ruedas;

/**
 *
 * @author jdieg
 */
public class RuedasChevrolet extends Ruedas {
    public RuedasChevrolet(int tamano) {
        super(tamano);
    }


    @Override
    public void tipoDeRuedas() {
        System.out.println("Las ruedas de Chevrolet tienen un tamaño de " + getTamano() + " pulgadas.");
    }
}
