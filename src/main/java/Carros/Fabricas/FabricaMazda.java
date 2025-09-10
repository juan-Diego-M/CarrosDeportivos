/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Fabricas;

import Carros.Fabricas.FabricaDeVehiculo;
import Carros.Abstractas.Carroceria;
import Carros.Abstractas.Motor;
import Carros.Abstractas.Ruedas;
import Carros.Mazda.CarroceriaMazda;
import Carros.Mazda.MotorMazda;
import Carros.Mazda.RuedasMazda;

/**
 *
 * @author jdieg
 */

public class FabricaMazda implements FabricaDeVehiculo {
    @Override
    public Motor crearMotor() {
        return new MotorMazda("Híbrido");  
    }

    @Override
    public Carroceria crearCarroceria() {
        return new CarroceriaMazda("Plástico");  
    }

    @Override
    public Ruedas crearRuedas() {
        return new RuedasMazda(35);  
    }
}
