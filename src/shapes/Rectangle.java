package shapes;
public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        System.out.println("Rectangle Method");
        return (2* (this.length + this.width));
    }

    public double getArea(){
        System.out.println("Rectangle Method");
        return this.length * this.width;
    }
}