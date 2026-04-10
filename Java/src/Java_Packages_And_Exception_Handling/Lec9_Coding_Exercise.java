package Java_Packages_And_Exception_Handling;

public class Lec9_Coding_Exercise {
    public static void main(String[] args) {
        System.out.println("we have to create min balance exception and it has to be checked exception");

    }
}

class account{
    String name;
    double balance;
    final double minBalance = 10_000;

    public account(String name, double balance) throws MinBalanceException {
        if(balance < minBalance){
            throw new MinBalanceException("You Should Have Min balance 10_000."); 
        }
        this.name = name;
        this.balance = balance;
    }

    public account(double balance) throws MinBalanceException {
        if(balance < minBalance){
            throw new MinBalanceException("You Should Have Min balance 10_000.");
        }
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public boolean deposit(int value){
        this.balance += value;
        return true;
    }


    public String withdraw(int value) throws MinBalanceException {
        if(value > this.balance) return "Your balance is less then withdraw amount";
        if((balance-value) < minBalance){
            throw new MinBalanceException("After Withdraw You Dont have min balance");
        }
        this.balance -= value;
        return "Amount is withdraw";
    }


    public boolean displayBalance(){

    }
}


class MinBalanceException extends Exception{

    public MinBalanceException() {
        super();
    }

    public MinBalanceException(String message) {
        super(message);
    }
}
