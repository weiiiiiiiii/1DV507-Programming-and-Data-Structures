package ww222ag_assign1.exercise1;
public class Circle  extends Shape {

	    private double radius;
 //
	    public Circle(String name, double radius) {
	    	super(name);
	        this.radius = radius;
	    }
	    //Parameterise constructor
	    public double getRadius() {
	        return radius;
	    }
	  //get perimeter and area
	    public double getPerimeter() {
	        return 2 * 3.14 * radius;
	    }
	    public double getArea() {
	        return  radius * 3.14 * radius;
	    }
	}