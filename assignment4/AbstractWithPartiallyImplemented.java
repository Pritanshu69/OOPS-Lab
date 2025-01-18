// Abstract Class With Abstract Methods and Partial Implementation in Subclasses

abstract class AbstractWithMethods{
    abstract void method1();
    abstract void method2();
    abstract void method3();
}
abstract class AbstractPartial extends AbstractWithMethods{
    @Override
    void method1(){
        System.out.println("Method 1");
    }
}
//concrete subclass 
class Concrete extends AbstractPartial{ 
    @Override
    void method2(){
        System.out.println("Method 2");
    }
    @Override
    void method3(){
        System.out.println("Method 3");
    }
}

public class AbstractWithPartiallyImplemented{
    public static void main(String[] args){
        Concrete obj = new Concrete();

        obj.method1();
        obj.method2();
        obj.method3();
    }
}