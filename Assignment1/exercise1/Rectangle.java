package ww222ag_assign1.exercise1;


public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String name, double length,double width) {
    	super(name);
        this.length = length;
        this.width = width;
    }
    //Parameterise constructor
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
//get perimeter and area
    public double getPerimeter() {
        return (length + width) * 2;
    }
    public double getArea() {
        return length * width ;
    }
}