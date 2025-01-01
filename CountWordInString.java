import java.util.Scanner;

public class CountWordInString {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE STRING ");
        String str = sc.nextLine();
        int count = 0;
        for(int i =0; i<str.length();i++){
         
            count++;


        }
        System.out.println("the no. of the Word present in the "+str+"  is => "+count);

    }
}
