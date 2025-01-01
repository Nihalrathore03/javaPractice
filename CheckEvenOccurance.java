import java.util.*;
 class Main {
	 public static void main (String[] args){
  	Scanner sc = new Scanner (System.in );
		System.out.println("enter the starting range for loop");
	int num = sc.nextInt ();
	System.out.println("enter the ending range for loop");
	int num2 = sc.nextInt ();
	int count =0;
	for (int i = num ; i <= num2;  i++){
	if (i%2==0 ){
	//System.out.println(i);
		count++;
}

}	


System.out.println( "there are "+ count+ "even num are present in it !!" );	
}
  }