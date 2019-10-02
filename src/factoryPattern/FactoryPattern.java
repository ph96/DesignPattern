package factoryPattern;

public class FactoryPattern {

    public Shape getShape(String shapeName){
        if(shapeName == null || shapeName.equals("")){
            return null;
        }
        if(shapeName.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if(shapeName.equalsIgnoreCase("Square")){
            return new Square();
        }
        if(shapeName.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        return null;
    }
}
