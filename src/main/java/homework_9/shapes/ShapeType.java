package homework_9.shapes;



public enum ShapeType {
    CIRCLE(new Circle()),
    RECTANGLE(new Rectangle()),
    SQUARE(new Square());

    private Shape shape;

    ShapeType(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}
