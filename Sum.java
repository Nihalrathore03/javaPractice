public class Sum{
public static void main(String[] args) {
    
    int n = 123;
    int sum = 0;

    while (n>0) {
        int last = n%10;
        System.out.println(last +"  ");
        n=n/10;
        System.out.println(n);
        sum= sum+last;
        
    }
    System.out.println(sum);
    

}
}