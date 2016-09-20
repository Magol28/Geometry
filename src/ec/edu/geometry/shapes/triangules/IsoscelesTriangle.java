
package ec.edu.geometry.shapes.triangules;

public class IsoscelesTriangle extends RigthAngleTriangle{

    public IsoscelesTriangle(Float base, Float heigth) {
        super(base, heigth);
    }

    @Override
    public Float area() {
      return  super.area();
    }

    @Override
    public Float perimeter() {
    return this.sideOne*2+getBase();
    }
   
}
