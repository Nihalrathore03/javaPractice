public class BubbleSort {
    public static void main(String[] args) {
        // int []arr = new int [5];
        int[] arr = { 1, 4, 5, 38, 7 ,567,464,76,43,89};
        int a=0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;

                }

                
            }
       }
       for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
       }
       
      

     }
}
