/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.solids.cubes;

import ec.edu.geometry.shapes.quadrilaters.Square;

/**
 *
 * @author Miguel_Angel
 */
public class Cube extends Square implements CubeSolidInterface{
    
    public Cube(Float side) {
        super(side);
    }

    @Override
    public Float Volume() {
     return  (float)(Math.pow(this.side, 3));
    }

    @Override
    public Float area() {
        return (float)(6*Math.pow(this.side,2)); //To change body of generated methods, choose Tools | Templates.
    }

  
 
    
    
}
