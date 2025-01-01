public class SingletonClass {

   
        
        private static SingletonClass Instance = null;
        public void h(){
            System.out.println("hellow");
        }
    
        public static SingletonClass GetInstance(){
            if (Instance==null) {
                Instance = new SingletonClass();
            }
            return Instance;
        }
    } 
    
     class InnerSingletonClass {
    
        public static void main(String[] args) {
            SingletonClass s1 = SingletonClass.GetInstance();
            //System.out.println(s1.getClass());
            s1.h();
           
    }
}