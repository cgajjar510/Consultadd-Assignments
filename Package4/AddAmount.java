package Package4;

public class AddAmount {
    double amount=50;
    double amount2;
    public AddAmount(){
     double amount;
    }
public AddAmount(double amount2){
        this.amount2=amount2;

}
public void transactionDone(){
    amount=amount+amount2;
    System.out.println("Total amount in savings is " +amount);
    System.out.println("Transaction done of  "+amount2);
}
    public static void main(String[] args) {
        AddAmount a=new AddAmount();
        a.transactionDone();
        AddAmount b=new AddAmount(32);
        b.transactionDone();
    }
}
