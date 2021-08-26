package ww222ag_assign1.exercise1;

public class Square  extends Shape {
    private double sides;

    	
    public Square(String name,double sides) {
    	super(name);
        this.sides = sides;
    }
    //Parameterise constructor
    public double getSides() {
        return sides;
    }
	  //get perimeter and area
    public double getPerimeter() {
        return 4  * sides;
    }
    public double getArea() {
        return sides  * sides;
    }
}