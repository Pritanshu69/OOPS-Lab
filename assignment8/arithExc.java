public class arithExc{
  public static void main(String[] args){
    try{
      int x = 10/0; 
    }
    catch(ArithmeticException e){
      System.out.println("ArithmeticException caught");
    }
  }
}
