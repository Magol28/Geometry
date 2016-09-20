
package ec.edu.geometry.shapes.triangules;

import java.util.Objects;
import ec.edu.geometry.Shape;

public abstract class Triangle implements Shape{
    protected Float sideOne;
    protected Float sideTwo;
    protected Float sideThree;

    public Float getSideOne() {
        return sideOne;
    }

    public void setSideOne(Float sideOne) {
        this.sideOne = sideOne;
    }

    public Float getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(Float sideTwo) {
        this.sideTwo = sideTwo;
    }

    public Float getSideThree() {
        return sideThree;
    }

    public void setSideThree(Float sideThree) {
        this.sideThree = sideThree;
    }

    @Override//por referencias de memorias
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.sideOne);
        hash = 31 * hash + Objects.hashCode(this.sideTwo);
        hash = 31 * hash + Objects.hashCode(this.sideThree);
        return hash;
    }

    @Override//ver si 2 objetos son iguales
    
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
        final Triangle other = (Triangle) obj;
        if (!Objects.equals(this.sideOne, other.sideOne)) {
            return false;
        }
        if (!Objects.equals(this.sideTwo, other.sideTwo)) {
            return false;
        }
        if (!Objects.equals(this.sideThree, other.sideThree)) {
            return false;
        }
        return true;
    }
    
}
