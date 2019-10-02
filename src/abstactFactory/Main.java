package abstactFactory;

import abstactFactory.color.Black;
import abstactFactory.color.Red;
import abstactFactory.color.White;
import abstactFactory.shape.Rectangle;
import abstactFactory.shape.Square;
import abstactFactory.shape.Triangle;

public class Main {
    public static void main(String[] args) {
        AbstactFactory shape = FactoryProducer.getFactory("shape");
        Rectangle rectangle = (Rectangle)shape.getShape("rectangle");
        Square square = (Square)shape.getShape("square");
        Triangle triangle = (Triangle)shape.getShape("triangle");
        rectangle.draw();
        square.draw();
        triangle.draw();
        AbstactFactory color = FactoryProducer.getFactory("color");
        Red red = (Red) color.getColor("red");
        Black black = (Black) color.getColor("black");
        White white = (White) color.getColor("white");
        red.fill();
        black.fill();
        white.fill();

    }
}
