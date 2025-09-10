/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Fabricas;

import Carros.Fabricas.FabricaDeVehiculo;
import Carros.Abstractas.Carroceria;
import Carros.Abstractas.Motor;
import Carros.Abstractas.Ruedas;
import Carros.Nissan.CarroceriaNissan;
import Carros.Nissan.MotorNissan;
import Carros.Nissan.RuedasNissan;

/**
 *
 * @author jdieg
 */
public class FabricaNissan implements FabricaDeVehiculo {
    @Override
    public Motor crearMotor() {
        return new MotorNissan("Gasolina");
    }

    @Override
    public Carroceria crearCarroceria() {
        return new CarroceriaNissan("Acero");
    }

    @Override
    public Ruedas crearRuedas() {
        return new RuedasNissan(16);
    }
}

