package homework_9.shapes;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle extends Shape{
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
}

class Rectangle extends Shape{
    private double h;
    private double l;

    public void setH(double h){
        this.h = h;
    }

    public double getH(){
        return h;
    }

    public void setL(double l){
        this.l = l;
    }

    public double getL(){
        return l;
    }

    @Override
    public double getArea() {
        return h*l;
    }

    @Override
    public double getPerimeter() {
        return 2*(l+h);
    }
}

class Square extends Shape{
    private double side;

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }
    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }
}
