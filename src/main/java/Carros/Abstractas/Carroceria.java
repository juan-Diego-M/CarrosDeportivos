/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carros.Abstractas;

/**
 *
 * @author jdieg
 */
public abstract class Carroceria {
    private String material; 

    public Carroceria(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public abstract void tipoDeCarroceria();
}
