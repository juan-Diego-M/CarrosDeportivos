/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Chevrolet;

import Carros.Abstractas.Motor;

/**
 *
 * @author jdieg
 */
public class MotorChevrolet extends Motor {
    // Constructor
    public MotorChevrolet(String tipo) {
        super(tipo);
    }


    @Override
    public void encender() {
        System.out.println("El motor Chevrolet de tipo " + getTipo() + " ha sido encendido.");
    }
}

