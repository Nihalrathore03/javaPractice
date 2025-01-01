abstract public class AbstractBankAccount {
    abstract  void calculateInstrest();
    
    String AccountHolderName ;
    int Balance ;
}
class SavingAccount extends AbstractBankAccount{
    
    void calculateInstrest(){
        Balance=10000;
        System.out.println(0.04*Balance);
    }
}

class CurrentAccount extends AbstractBankAccount{

    void calculateInstrest(){
        Balance= 2000;
        System.out.println("no  interest will assign in CurrentAccount");
    }
}

 class  Ss {

    public static void main(String[] args) {
        SavingAccount s1=  new SavingAccount();
        s1.calculateInstrest();
        
        CurrentAccount c1 = new CurrentAccount();
        c1.calculateInstrest();
    }
}