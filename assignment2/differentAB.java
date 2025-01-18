//7. Create a class; put a method inside this class which will return a class reference (return same class and/or different class object).

class A{
    A getAObject(){
        return new A();
    }
    B getBObject(){
        return new B();
    }
}
class B{
    //nothing
}

public class differentAB{
    public static void main(String[] args){
        A objA = new A();

        A returnedA = objA.getAObject();
        B returnedB = objA.getBObject();

        System.out.println("Returned A object: " + returnedA);
        System.out.println("Returned B object: " + returnedB);
    }
}