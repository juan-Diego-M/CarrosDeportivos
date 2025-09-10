/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Mazda;

import Carros.Abstractas.Ruedas;

/**
 *
 * @author jdieg
 */
public class RuedasMazda extends Ruedas {
    public RuedasMazda(int tamano) {
        super(tamano);
    }

    @Override
    public void tipoDeRuedas() {
        System.out.println("Las ruedas de Mazda tienen un tamaño de " + getTamano() + " pulgadas.");
    }
}
