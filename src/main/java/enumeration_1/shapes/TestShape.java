package homework_9.shapes;

public class TestShape {
    public static void main(String[] args) {
        Shape circle = ShapeType.CIRCLE.getShape();
        ((Circle) circle).setRadius(4.2);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
