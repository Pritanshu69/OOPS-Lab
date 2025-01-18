//1. Show that ordinary block is executed when object is created and also the order of execution of these blocks (for multiple blocks/ inherited block). 
class Parent{
    //oridnary block
    {
        System.out.println("Parent ordinary block");
    }
    //constructor
    Parent(){
        System.out.println("Parent constructor");
    }
}
class Child extends Parent{
    //oridnary block
    {
        System.out.println("Child ordinary block");
    }
    //constructor
    Child(){
        System.out.println("Child constructor");
    }
}
public class OrdinaryBlock{
    public static void main(String[] args){
        System.out.println("Creating object of Child->");
        Child c = new Child();
    }
}