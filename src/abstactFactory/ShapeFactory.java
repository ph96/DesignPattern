package abstactFactory;

import abstactFactory.color.Color;
import abstactFactory.shape.Rectangle;
import abstactFactory.shape.Shape;
import abstactFactory.shape.Square;
import abstactFactory.shape.Triangle;

public class ShapeFactory extends AbstactFactory {
    @Override
    Shape getShape(String shapeName) {
        if(shapeName.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if(shapeName.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if(shapeName.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        return null;
    }

    @Override
    Color getColor(String colorName) {
        return null;
    }
}
