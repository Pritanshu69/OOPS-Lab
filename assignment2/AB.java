//Create a class, make method inside it and pass object as parameter of this method (b) pass different class’s object 
class A{
    void display(B obj){
        System.out.println("The passing object is: " + obj);
    }
}
class B{
    //nothing
}
public class AB{
    public static void main(String[] args){
        A objA= new A();
        B objB= new B();
        objA.display(objB);
    }
}