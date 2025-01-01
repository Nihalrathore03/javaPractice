import java.util.Scanner;

/**
 * PALINDROME
 */
public class PALINDROME {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING ");
        String str1 = sc.nextLine();
        int ch = 0;
        int left = 0;
        int right = str1.length() - 1;
        while (left < right) {
            if (str1.charAt(left) != str1.charAt(right)) {
                ch = 1;
            }

            left++;
            right--;
        }
        if (ch == 1) {
            System.out.println(" not a palindrome");

        } else if (ch == 0) {
            System.out.println(" it is palindrome ");
        }
    }
}