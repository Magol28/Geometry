/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.triangules;

/**
 *
 * @author Miguel_Angel
 */
public class RigthAngleTriangle extends Triangle{
    private Float base;
    private Float heigth;

    public RigthAngleTriangle(Float base, Float heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getHeigth() {
        return heigth;
    }

    public void setHeigth(Float heigth) {
        this.heigth = heigth;
    }

    @Override
    public Float area() {
       return (this.base*this.heigth)/2;
    }

    @Override
    public Float perimeter() {
   return (float)(Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.heigth, 2)))+this.base+this.heigth;
    }
    
}
