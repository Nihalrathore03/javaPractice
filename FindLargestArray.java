public class FindLargestArray {
    
    public static void main(String[] args) {
        int [] array = {2,3,5,2,20};
        int large= array[0];
        for(int i = 1; i<=array.length-1;i++){
        
            if( array[i]>large){
                large=array[i];
               
            }
          
          
        } System.out.println(large);
    }
}
