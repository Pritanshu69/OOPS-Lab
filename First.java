//Create a class First, make instance variable [int x], method [void show ()] and also put main method inside that class and use the instance variable and method from main. 

public class First{
    int x ;

    void show(){
        System.out.println("Value of x is : " + x);
    }
    public static void main(String[] args){
        First obj = new First();
        obj.x = 10;
        obj.show();
    }
}
