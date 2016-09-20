/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.solids.circunference;

import ec.edu.geometry.Shape;
import ec.edu.geometry.shapes.circunferences.Circunference;

/**
 *
 * @author Miguel_Angel
 */
public class Spheree extends  Circunference implements CircunferenceSolid{

    public Spheree(Float radio) {
        super(radio);
    }

    @Override
    public Float area() {
        return (float)(4*Math.PI*this.radio*this.radio);
    }

    @Override
    public Float perimeter() {
    return null;
    }

    @Override
    public Float Volume() {
    return (float)(4/3*Math.pow(this.radio, 3)*Math.PI);
    }
    
}
