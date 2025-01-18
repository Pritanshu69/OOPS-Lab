interface interface1{
    void method1();
    void method2();
}
interface interface2{
    void method3();
    void method4();
}
interface combinedInterface extends interface1, interface2{
    void method5();
}
class ConcreteClass{
    void ConcreteMethod(){
        System.out.println("Concrete Method");
    }
}

class DerivedClass extends ConcreteClass implements combinedInterface{
    @Override
    public void method1(){
        System.out.println("Method 1");
    }
    @Override
    public void method2(){
        System.out.println("Method 2");
    }
    @Override
    public void method3(){
        System.out.println("Method 3");
    }
    @Override
    public void method4(){
        System.out.println("Method 4");
    }
    @Override
    public void method5(){
        System.out.println("Method 5");
    }
}
public class InterfaceInheritance{
    public static void main(String[] args){
        DerivedClass d = new DerivedClass();
        d.method1();
        d.method2();
        d.method3();
        d.method4();
        d.method5();
        d.ConcreteMethod();
    }
}