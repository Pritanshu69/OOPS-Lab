//Show immutability of String and mutability of StringBuffer

public class StringVsStringBuffer {
    public static void main(String[] args) {
        // String (Immutable)
        String str = "Hello";
        str.concat(" World");
        System.out.println("String (Immutable): " + str); // Output: Hello

        // StringBuffer (Mutable)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer (Mutable): " + sb); // Output: Hello World
    }
}

