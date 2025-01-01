public class Average {
    public static void main(String[] args) {
        //int arr[]= {};

        int []arr ={1,2,3,4,5};
        int sum=0;
        for(int i = 0; i <arr.length; i++){
            sum = sum+arr[i];
           // System.out.println(sum);
        }
        int result =sum/arr.length;
        System.out.println(sum);
        System.out.println(result);
    }
}
