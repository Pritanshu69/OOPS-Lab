//Overload the constructors for a class Box for cube and cone and display their volumes

class Box{
    double volume;
    //cube
    Box(double side){
        volume = side*side*side;
    }
    //cone
    Box(double radius, double height){
        volume = 3.14*radius*radius*height/3;
    }
    void display(){
        System.out.println("Volume: "+volume);
    }
    public static void main(String[] args){
        Box cube = new Box(5.0);
        System.out.print("volume of cube is: ");
        cube.display();
        Box cone = new Box(3.0,7.0);
        System.out.print("volume of cone is: ");
        cone.display();
    }
}