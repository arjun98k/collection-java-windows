package OOPS1;

class BankAccount{
    String accountholder;
    double balance;

    public BankAccount(String accountholder, double balance){
        this.accountholder = accountholder;
        this.balance = balance;
        System.out.println("Account holder name "+ accountholder);
        System.out.println("balance remain account " + balance);
    }
}

public class Oop3 {
    public static void main(String[] args) {
        BankAccount accountdetail = new BankAccount("akash salekar", 1000);

    }
}
