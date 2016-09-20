/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.shapes.triangules;

import java.util.Objects;

/**
 *
 * @author Miguel_Angel
 */
public class EquilateraTriangle extends Triangle{
    private Float sideOne;

    public EquilateraTriangle(Float sideOne) {
        this.sideOne = sideOne;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.sideOne);
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
        final EquilateraTriangle other = (EquilateraTriangle) obj;
        if (!Objects.equals(this.sideOne, other.sideOne)) {
            return false;
        }
        return true;
    }

    public EquilateraTriangle() {
    }

    @Override
    public Float getSideOne() {
        return sideOne;
    }

    @Override
    public void setSideOne(Float sideOne) {
        this.sideOne = sideOne;
    }
    
    
    @Override
    public Float area() {
        return (float)(Math.sqrt(0.75)*Math.pow(this.sideOne, 2));
    }

    @Override
    public Float perimeter() {
        return this.sideOne*3;
    }
    
}
