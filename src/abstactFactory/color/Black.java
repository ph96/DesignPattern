package abstactFactory.color;

public class Black implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Black::fill() method.");
    }
}
