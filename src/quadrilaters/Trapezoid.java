/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrilaters;

import java.util.Objects;

/**
 *
 * @author Miguel_Angel
 */
public class Trapezoid extends Quadrilateral{
    private Float smallside;
    private Float bigside;
    private Float height;

    public Trapezoid(Float smallside, Float bigside, Float height) {
        this.smallside = smallside;
        this.bigside = bigside;
        this.height = height;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.smallside);
        hash = 59 * hash + Objects.hashCode(this.bigside);
        return hash;
    }

    public Float getSmallside() {
        return smallside;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public void setSmallside(Float smallside) {
        this.smallside = smallside;
    }

    public Float getBigside() {
        return bigside;
    }

    public void setBigside(Float bigside) {
        this.bigside = bigside;
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
        final Trapezoid other = (Trapezoid) obj;
        if (!Objects.equals(this.smallside, other.smallside)) {
            return false;
        }
        if (!Objects.equals(this.bigside, other.bigside)) {
            return false;
        }
        return true;
    }
    
    @Override
    public Float area() {
        return this.height*(this.smallside*this.bigside)/2;
    }

    @Override
    public Float perimeter() {
      return 2*(this.smallside+this.bigside);
    }
    
}
