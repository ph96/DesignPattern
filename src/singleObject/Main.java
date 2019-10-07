package singleObject;

public class Main {

    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getSingleObject();
        SingleObject singleObject1 = SingleObject.getSingleObject();
        System.out.println(singleObject+","+singleObject1+","+(singleObject==singleObject1));
    }
}
