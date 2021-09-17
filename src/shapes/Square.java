package shapes;

public  class Square extends Quadrilateral {

    public Square(double side){
        super(side, side);
        }
    @Override
    public double getPerimeter() {
        return (2 * (length + width));
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }
}