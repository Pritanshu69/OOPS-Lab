package pTwo;

import pOne.ParentClass;

public class ChildClass extends ParentClass {
    public void accessParentMembers() {
        System.out.println("Accessing defaultVariable: " + defaultVariable);
        defaultMethod();
    }
}
