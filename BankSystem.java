
public class BankSystem {

    double amount;

    public BankSystem(double amount){
        this.amount=amount;
    }

  public void withdrawl(double withdrawlAmount){
    System.out.println((amount<withdrawlAmount?"cant withdrawl": "withdrawl"));
    amount= (amount>=withdrawlAmount?amount-withdrawlAmount:amount);

  }

  public void deposit(double depositAmount){
    amount+=depositAmount;

  }

  public void display(){
    System.out.println("CURRENT BALANCE IS-->"+amount);
    System.out.println("-------------");
    

  }

}

class InnerBankSystem {
public static void main(String[] args) {
  BankSystem b1= new BankSystem(10000);
  b1.deposit(500);
  b1.display();
}
    
}