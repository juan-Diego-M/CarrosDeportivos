/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Mazda;

import Carros.Abstractas.Motor;

/**
 *
 * @author jdieg
 */
public class MotorMazda extends Motor {
    public MotorMazda(String tipo) {
        super(tipo);
    }

    @Override
    public void encender() {
        System.out.println("El motor Mazda de tipo " + getTipo() + " ha sido encendido.");
    }
}

