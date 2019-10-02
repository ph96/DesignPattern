package abstactFactory.color;

public class White implements Color{
    @Override
    public void fill() {
        System.out.println("Inside White::fill() method.");
    }
}
