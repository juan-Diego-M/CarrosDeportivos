/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Fabricas;

import Carros.Fabricas.FabricaDeVehiculo;
import Carros.Abstractas.Carroceria;
import Carros.Abstractas.Motor;
import Carros.Abstractas.Ruedas;
import Carros.Chevrolet.CarroceriaChevrolet;
import Carros.Chevrolet.MotorChevrolet;
import Carros.Chevrolet.RuedasChevrolet;

/**
 *
 * @author jdieg
 */
public class FabricaChevrolet implements FabricaDeVehiculo {
    @Override
    public Motor crearMotor() {
        return new MotorChevrolet("Eléctrico");  
    }

    @Override
    public Carroceria crearCarroceria() {
        return new CarroceriaChevrolet("Aluminio");  
    }

    @Override
    public Ruedas crearRuedas() {
        return new RuedasChevrolet(18);  
    }
}
