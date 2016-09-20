
package ec.edu.main;

import ec.edu.geometry.shapes.circunferences.Circle;
import ec.edu.util.GeometriConstans;

public class geometry {

    public static void main(String[] args) {
        Circle Circle1= new Circle(5f);
        ec.edu.util.Printerutil.printshare(Circle1.getClass().getSimpleName(), GeometriConstans.Perimeter, Circle1.perimeter()+"");
      
        
    }
    
}
