/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros;

import Carros.Fabricas.FabricaDeVehiculo;
import Carros.Abstractas.Carroceria;
import Carros.Abstractas.Motor;
import Carros.Abstractas.Ruedas;

/**
 *
 * @author jdieg
 */
public class GeneraVehiculos {
    // Atributo para la fábrica concreta
    private FabricaDeVehiculo fabrica;

    public GeneraVehiculos(FabricaDeVehiculo fabrica) {
        this.fabrica = fabrica;
    }

    public void generarVehiculo() {
        Motor motor = fabrica.crearMotor();
        Carroceria carroceria = fabrica.crearCarroceria();
        Ruedas ruedas = fabrica.crearRuedas();

        System.out.println(" Los componentes del carro generado son que se está realizando son: ");
        motor.encender();
        carroceria.tipoDeCarroceria();
        ruedas.tipoDeRuedas();
        System.out.println("\n");
    }
}
