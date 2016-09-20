/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.geometry.shapes.circunferences;

import java.util.Objects;
import ec.edu.geometry.Shape;

/**
 *
 * @author Miguel_Angel
 */
public abstract class Circunference implements Shape{
    protected Float radio;

    public Circunference(Float radio) {
        this.radio = radio;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.radio);
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
        final Circunference other = (Circunference) obj;
        if (!Objects.equals(this.radio, other.radio)) {
            return false;
        }
        return true;
    }
    
}
