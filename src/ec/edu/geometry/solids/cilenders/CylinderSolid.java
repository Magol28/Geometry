/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.solids.cilenders;

import ec.edu.geometry.shapes.circunferences.Circunference;

/**
 *
 * @author Miguel_Angel
 */
public class CylinderSolid extends  Circunference implements Cyllender {

    private Float Height;

    public CylinderSolid(Float Height, Float radio) {
        super(radio);
        this.Height = Height;
    }
  

    @Override
    public Float area() {
    return (float)(2*Math.pow(this.radio, 2)*Math.PI+2*Math.PI*this.radio*this.Height);
    }

    @Override
    public Float perimeter() {
    return null;
    }

    @Override
    public Float Volume() {
    return (float)(Math.pow(this.radio,2)*Math.PI*this.Height);   
    }
    
}
