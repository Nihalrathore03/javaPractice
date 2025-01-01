abstract public class abstractExample {
    abstract  void display();
 int q = 12;

    
}

/**
 InnerabstractClass 
 
 */
/**
 * InnerabstractClass
 */
 class InnerabstractClass  extends abstractExample{
@Override
void display() {
    // TODO Auto-generated method stub
    System.out.println(q);
}
    public static void main(String[] args) {
       InnerabstractClass q1= new InnerabstractClass();
       q1.display();
        
    }
}

