package factoryPattern;

public class FactoryPattern {

    public Shape getShape(String shapeName){
        if(shapeName == null || shapeName.equals("")){
            return null;
        }
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
}
