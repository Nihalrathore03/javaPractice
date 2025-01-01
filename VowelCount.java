import java.util.Scanner;

/**
 * VowelCount
 */
public class VowelCount {

  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("ENTER THE STRING");
    String str1 = Sc.nextLine();
    char ch;
    int count = 0;
    for (int i = 0; i < str1.length(); i++) {
      ch = str1.charAt(i);
      // System.out.println(ch);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        // System.out.println("vowel");
        count++;

      } 
    }
   
    System.out.println(" there are "+count + " vowels in it !!");
  }

}