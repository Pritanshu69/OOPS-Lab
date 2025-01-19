import java.io.IOException;

public class ThrowCheckException{
  public static void main(String[] args){
    try{
      throw new IOException("This can throw Exception");
    }
    catch(IOException e){
      System.out.println("Exception caught: "+ e.getMessage());
    }
  }
}
