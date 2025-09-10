/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Chevrolet;

import Carros.Abstractas.Carroceria;

/**
 *
 * @author jdieg
 */
public class CarroceriaChevrolet extends Carroceria {

    public CarroceriaChevrolet(String material) {
        super(material);
    }


    @Override
    public void tipoDeCarroceria() {
        System.out.println("La carrocería Chevrolet está hecha de " + getMaterial() + ".");
    }
}
