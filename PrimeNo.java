public class PrimeNo {
    
    public static void main(String[] args) {
         

        int n= 98;
        int count=0;
        for(int i =1; i<n; i++){

            if (n%i==0) {
                count++;
                System.out.println(i);
            }
         
            

        }
        if (count<=2) {
            System.out.println("prime no.");
            
        }
        else{
            System.out.println("not a prime ");
        }
    }
}
