class OutterClass{
    int outerValue = 10;

    class InnerClass{
        int innerValue = 20;

        public void display(){
            System.out.println("Outer Value: " + outerValue);
            System.out.println("Inner Value: " + innerValue);
        }
    }
    public void accessInnerClass(){
        InnerClass inner = new InnerClass();
        System.out.println("Inner Value: " + inner.innerValue);
    }
}

//Main class
public class InnerClassTest{
    public static void main(String[] args){
        OutterClass outer = new OutterClass();
        OutterClass.InnerClass inner  = outer.new InnerClass();
        inner.display();
        outer.accessInnerClass();
    }
}