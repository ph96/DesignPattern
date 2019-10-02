package factoryPattern;

public class Main {
    public static void main(String[] args) {
        FactoryPattern factoryPattern = new FactoryPattern();
        Rectangle rectangle = (Rectangle)factoryPattern.getShape("rectangle");
        rectangle.draw();
        Square square = (Square)factoryPattern.getShape("square");
        square.draw();
        Triangle triangle = (Triangle)factoryPattern.getShape("triangle");
        triangle.draw();
    }
}
