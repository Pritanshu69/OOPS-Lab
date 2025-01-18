class StudentData{
    int roll;
    String name;
    String college;
    String branch;

    void display(){
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Branch: " + branch);
    }
    public static void main(String[] args){
        Student student = new Student();

        student.roll = 1;
        student.name = "Pritanshu Samanta";
        student.college = "AOT College";
        student.branch = "Computer Science";

        student.display();
    }
}
