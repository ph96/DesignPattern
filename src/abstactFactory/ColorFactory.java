package abstactFactory;

import abstactFactory.color.Black;
import abstactFactory.color.Color;
import abstactFactory.color.Red;
import abstactFactory.color.White;
import abstactFactory.shape.Shape;

public class ColorFactory extends AbstactFactory {
    @Override
    Shape getShape(String shapeName) {
        return null;
    }

    @Override
    Color getColor(String colorName) {
        if(colorName == null || colorName.equals("")){
            return null;
        }
        if(colorName.equalsIgnoreCase("RED")){
            return new Red();
        }if(colorName.equalsIgnoreCase("BLACK")){
            return new Black();
        }if(colorName.equalsIgnoreCase("WHITE")){
            return new White();
        }
        return null;
    }
}
