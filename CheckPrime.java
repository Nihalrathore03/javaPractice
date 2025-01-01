import java.util.Scanner;

public class CheckPrime {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int count =0;
         for (int i=1; i<num; i++){
        //    System.out.println(i);
            if (num%i ==0 ){
              // System.out.println("hii");
             
                count++;
            }
       
         }
         if(count==1){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
