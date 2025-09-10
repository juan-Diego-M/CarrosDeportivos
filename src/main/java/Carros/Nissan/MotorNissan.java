/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Nissan;

import Carros.Abstractas.Motor;

/**
 *
 * @author jdieg
 */
public class MotorNissan extends Motor {

    public MotorNissan(String tipo) {
        super(tipo);
    }
    @Override
    public void encender() {
        System.out.println("El motor Nissan de tipo " + getTipo() + " ha sido encendido.");
    }
}
