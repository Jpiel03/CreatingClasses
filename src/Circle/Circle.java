package Circle;

/**
 *
 * @author 18275
 */
public class Circle {
    
    // Instance Var
    private double radius;
    
    
    public Circle (int pRadius){
        radius = pRadius;
    }
    
    
    public double getRadius(){
        return radius;
    }
    public void setRadius(int pRadius){
        radius = pRadius;
    }
    
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public String toString(){
        return "The circle has a radius of " + radius + ", a circumference of "
                + getCircumference() + ", and an area of " + getArea();
    }
}
