package singleObject;

public class SingleObject {
    private static SingleObject singleObject = new SingleObject();

    private SingleObject(){}

    public static SingleObject getSingleObject(){
        return singleObject;
    }
    public void showMessage(){
        System.out.println("Hello Word!");
    }
}
