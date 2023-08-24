package ourInterFaces_28.HW28;

public class Main28 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 6);
        Circle circle = new Circle(5);

        System.out.println("rectangle area " + rectangle.area());
        System.out.println("rectangle perimeter " + rectangle.perimeter());

        System.out.println("circle area " + circle.area());
        System.out.println("circle perimeter " + circle.perimeter());

        Shape[] shapes = {rectangle, circle};
        double totalArea = totalAreaOfFigures(shapes);
        System.out.println("total area of figures " + totalArea);
    }
    public static double totalAreaOfFigures(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
