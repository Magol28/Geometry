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
public class Rhombus extends Quadrilateral{
    private Float BigDiagonal;
    private Float SmallDiagonal;

    public Rhombus(Float BigDiagonal, Float SmallDiagonal) {
        this.BigDiagonal = BigDiagonal;
        this.SmallDiagonal = SmallDiagonal;
    }

    public Float getBigDiagonal() {
        return BigDiagonal;
    }

    public void setBigDiagonal(Float BigDiagonal) {
        this.BigDiagonal = BigDiagonal;
    }

    public Float getSmallDiagonal() {
        return SmallDiagonal;
    }

    public void setSmallDiagonal(Float SmallDiagonal) {
        this.SmallDiagonal = SmallDiagonal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.BigDiagonal);
        hash = 67 * hash + Objects.hashCode(this.SmallDiagonal);
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
        final Rhombus other = (Rhombus) obj;
        if (!Objects.equals(this.BigDiagonal, other.BigDiagonal)) {
            return false;
        }
        if (!Objects.equals(this.SmallDiagonal, other.SmallDiagonal)) {
            return false;
        }
        return true;
    }
    
    @Override
    public Float area() {
       return BigDiagonal*SmallDiagonal/2;
    }

    @Override
    public Float perimeter() {
   return (float) Math.sqrt(Math.pow((this.BigDiagonal/2), 2)+ Math.pow((this.SmallDiagonal/2),2))*4;
    }
    
}
