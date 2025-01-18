class box2MethodOverload{
    //cube
    double calculateVolume(double side){
        return side*side*side;
    }
    //cone
    double calculateVolume(double radius, double height){
        return 3.14*radius*radius*height/3;
    }
    public static void main(String[] args){
        box2MethodOverload cube = new box2MethodOverload();
        System.out.println("volume of cube is: "+cube.calculateVolume(5.0));
        box2MethodOverload cone = new box2MethodOverload();
        System.out.println("volume of cone is: "+cone.calculateVolume(3.0,7.0));
    }
}