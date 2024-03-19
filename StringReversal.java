import java.util.*;

class StringReversal {
   public static void main(String[] args){
    System.out.println("Enter your string: ");
    Scanner scnr = new Scanner(System.in);
    String input = scnr.nextLine();
    StringBuilder str = new StringBuilder(input);
    StringBuilder revstr = str.reverse();
    System.out.println(revstr);

   }

}
