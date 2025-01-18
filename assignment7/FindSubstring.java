public class FindSubstring{
  public static void main(String[] args) {
    String str = "Academy of technology";
    String search = "tech";

    int position = str.indexOf(search);

    if(position != -1){
      System.out.println("The substring is present");
    }
    else{
      System.out.println("The subsctring is not present");
    }
  }
}
