/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.shapes.triangules;

/**
 *
 * @author Miguel_Angel
 */
public class ScaleneTriangle extends Triangle{

    @Override
    public Float area() {
    Float s=this.perimeter()/2;
    return (float)(Math.sqrt((s-this.sideOne))+(s-this.sideThree)+(s-this.sideTwo));
    }

    @Override
    public Float perimeter() {
    return this.sideOne+this.sideTwo+this.sideThree;
    }
    
}
