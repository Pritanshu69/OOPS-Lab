//2. Static Block Execution and Order in Multiple Blocks/Inheritance
class ParentStatic {
    // Static block in the parent class
    static {
        System.out.println("Parent static block executed.");
    }
}

class ChildStatic extends ParentStatic {
    // Static block in the child class
    static {
        System.out.println("Child static block executed.");
    }
}

public class StaticBlock{
    public static void main(String[] args) {
        System.out.println("Main method starts...");
        ChildStatic child = new ChildStatic();
    }
}
