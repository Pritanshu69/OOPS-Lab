//Create a class, make method inside it and pass object as parameter of this method. (a) pass same class’s object

class A{
    void display(A obj){
        System.out.println("The passing object is: " + obj);
    }

    public static void main(String[] args) {
        A objA = new A();
        objA.display(objA);
    }
}