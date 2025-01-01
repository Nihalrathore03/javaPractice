import java.util.Scanner;

public class ArrayOutOfBond {
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        Scanner sc =  new Scanner(System.in);

        int n =0;
        if (n>array.length) {
            try{
                 n =44;
                System.out.println("fshkjf"+array[n]);
            }   catch(ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }
        
    }
}
