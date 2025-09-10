/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Mazda;

import Carros.Abstractas.Carroceria;

/**
 *
 * @author jdieg
 */
public class CarroceriaMazda extends Carroceria {
    public CarroceriaMazda(String material) {
        super(material);
    }

    @Override
    public void tipoDeCarroceria() {
        System.out.println("La carrocería Mazda está hecha de " + getMaterial() + ".");
    }
}
