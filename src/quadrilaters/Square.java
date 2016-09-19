
package quadrilaters;

public class Square extends Quadrilateral{

    private Float side;

    public Square(Float side) {
        this.side = side;
    }

    public Float getSide() {
        return this.side;
    }

    public void setSide(Float side) {
        this.side = side;
    }
    
    @Override
    public Float area() {
        return this.side*this.side; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Float perimeter() {
       return this.side*4; //To change body of generated methods, choose Tools | Templates.
    }
    
}
