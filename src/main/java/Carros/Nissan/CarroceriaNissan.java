/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Nissan;

import Carros.Abstractas.Carroceria;

/**
 *
 * @author jdieg
 */
public class CarroceriaNissan extends Carroceria {

    public CarroceriaNissan(String material) {
        super(material);
    }


    @Override
    public void tipoDeCarroceria() {
        System.out.println("La carrocería Nissan está hecha de " + getMaterial() + ".");
    }
}
