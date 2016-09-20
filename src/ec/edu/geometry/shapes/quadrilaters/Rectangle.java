/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.shapes.quadrilaters;

import java.util.Objects;

/**
 *
 * @author Miguel_Angel
 */
public class Rectangle extends Quadrilateral{
    private Float base;
    private Float height;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.base);
        hash = 97 * hash + Objects.hashCode(this.height);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (!Objects.equals(this.base, other.base)) {
            return false;
        }
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        return true;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public Float area() {
      return 2*(this.height + this.base); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Float perimeter() {
       return this.height * this.base; //To change body of generated methods, choose Tools | Templates.
    }
}
