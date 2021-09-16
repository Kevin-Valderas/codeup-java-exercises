package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side,side);
        this.side = side;
    }
    protected double side;
    public double getArea(){
        System.out.println("Square Method");
        return Math.pow(side, 2);
    }
    public double getPerimeter(){
        System.out.println("Square Method");
        return 4 * side;
    }
}
