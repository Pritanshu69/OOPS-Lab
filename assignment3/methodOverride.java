class Parent{
    void display(){
        System.out.println("Parent class");
    }
}
class Subclass1 extends Parent{
    @Override
    void display(){
        System.out.println("Subclass1 class");
    }
}
class Subclass2 extends Parent{
    @Override
    void display(){
        System.out.println("Subclass2 class");
    }
}
class Subclass3 extends Parent{
    @Override
    void display(){
        System.out.println("Subclass3 class");
    }
}

public class methodOverride{
    public static void main(String[] args){
        Parent p = new Parent();
        System.out.println("Parent class refernce");
        p.display();
        Subclass1 sub1 = new Subclass1();
        System.out.println("Subclass1 class refernce");
        sub1.display();
        Subclass2 sub2 = new Subclass2();
        System.out.println("Subclass2 class refernce");
        sub2.display();
        Subclass3 sub3 = new Subclass3();
        System.out.println("Subclass3 class refernce");
        sub3.display();
    }
}