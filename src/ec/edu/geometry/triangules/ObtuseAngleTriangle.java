/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.triangules;

import java.util.Objects;

/**
 *
 * @author Miguel_Angel
 */
public class ObtuseAngleTriangle extends RigthAngleTriangle{
   
    public ObtuseAngleTriangle(Float base, Float heigth) {
        super(base, heigth);
    }

 

    @Override
    public Float area() {
      return super.area();
    }

    @Override
    public Float perimeter() {
       return this.sideOne+this.sideTwo+this.sideThree;
    }
    
}
