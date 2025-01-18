abstract class AbstractClass{
    void display(){
        System.out.println("This is a concrete method in an abstract class.");
    }
}
class concreteClass extends AbstractClass{
    //nothing
}
public class AbstractClassWithoutAbstractMethod {
    public static void main(String[] args) {
        concreteClass obj = new concreteClass();
        obj.display();
    }
}