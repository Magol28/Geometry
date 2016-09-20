/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.solids.cones;

import ec.edu.geometry.shapes.circunferences.Circunference;

/**
 *
 * @author Miguel_Angel
 */
public class Cones extends Circunference implements ConeSolidInterface {

    private Float heigth;

    public Cones(Float heigth, Float radio) {
        super(radio);
        this.heigth = heigth;
    }
    
    @Override
    public Float Volume() {
    return (float)(1/3*Math.PI*Math.pow(this.radio,2)*this.heigth);
    }
     @Override
    public Float area() {
    return (float)(Math.PI*this.radio*Math.sqrt(Math.pow(this.radio, 2)+Math.pow(this.heigth,2))+Math.PI*Math.pow(this.radio, 2));
    }

    @Override
    public Float perimeter() {
     return null;  }
}
