/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Fabricas;

import Carros.Abstractas.Carroceria;
import Carros.Abstractas.Motor;
import Carros.Abstractas.Ruedas;

/**
 *
 * @author jdieg
 */
public interface FabricaDeVehiculo {
    Motor crearMotor();
    Carroceria crearCarroceria();
    Ruedas crearRuedas();
}
