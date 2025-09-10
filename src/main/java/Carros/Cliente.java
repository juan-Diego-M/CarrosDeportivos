/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros;

import Carros.Fabricas.FabricaChevrolet;
import Carros.Fabricas.FabricaMazda;
import Carros.Fabricas.FabricaNissan;

/**
 *
 * @author jdieg
 */
public class Cliente {
    public static void main(String[] args) {
        GeneraVehiculos generadorNissan = new GeneraVehiculos(new FabricaNissan());
        System.out.println(" Listo Vehículo Nissan");
        generadorNissan.generarVehiculo();

        GeneraVehiculos generadorChevrolet = new GeneraVehiculos(new FabricaChevrolet());
        System.out.println("\n Listo Vehículo Chevrolet ");
        generadorChevrolet.generarVehiculo();

        GeneraVehiculos generadorMazda = new GeneraVehiculos(new FabricaMazda());
        System.out.println("\n Listo Vehículo Mazda ");
        generadorMazda.generarVehiculo();
    }
}
