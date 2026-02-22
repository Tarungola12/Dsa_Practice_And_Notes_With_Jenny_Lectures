package java

public class Opps4 {
    public static void main(String[] args) {
        // This lecture was  practice understand to constructor and chaining of
        // constructor

        
    }
}

class contructorInfo {
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNumber;

    // contructorInfo() {
    // this.accountNumber = "unknown";
    // this.accountName = "unknown";
    // this.balance = 0.0;
    // this.phoneNumber = 0;
    // System.out.println("Default constructor called");
    // }

    // contructorInfo(String accountNumber) {
    // this.accountNumber = accountNumber;
    // this.accountName = "unknown";
    // this.balance = balance;
    // this.phoneNumber = 0;
    // System.out.println("1 parameter constructor is called");
    // }

    // contructorInfo(String accountNumber, String accountName) {
    // this.accountNumber = accountNumber;
    // this.accountName = accountName;
    // this.balance = 0.0;
    // this.phoneNumber = 0;
    // System.out.println("2 parameter constructor is called");
    // }

    // contructorInfo(String accountNumber, String accountName, double balance) {
    // this.accountNumber = accountNumber;
    // this.accountName = accountName;
    // this.balance = balance;
    // this.phoneNumber = 0;
    // System.out.println("3 parameter constructor is called");
    // }

    // contructorInfo(String accountNumber, String accountName, double balance, long
    // phoneNumber) {
    // this.accountNumber = accountNumber;
    // this.accountName = accountName;
    // this.balance = balance;
    // this.phoneNumber = phoneNumber;
    // System.out.println("4 parameter constructor is called");
    // }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + balance);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // but we can reduce lines of code by using constructor chaining here : Watch

    contructorInfo() {
        this("unknown", "unknown", 0.0, 00);
        // this.accountNumber = "unknown";
        // this.accountName = "unknown";
        // this.balance = 0.0;
        // this.phoneNumber = 0;
        // System.out.println("Default constructor called");
    }

    contructorInfo(String accountNumber) {
        this(accountNumber, "unknown", 0.0, 00);
        // this.accountNumber = accountNumber;
        // this.accountName = "unknown";
        // this.balance = balance;
        // this.phoneNumber = 0;
        // System.out.println("1 parameter constructor is called");
    }

    contructorInfo(String accountNumber, String accountName) {
        this(accountNumber, accountName, 0.0, 00);
        // this.accountNumber = accountNumber;
        // this.accountName = accountName;
        // this.balance = 0.0;
        // this.phoneNumber = 0;
        // System.out.println("2 parameter constructor is called");
    }

    contructorInfo(String accountNumber, String accountName, double balance) {
        this(accountNumber, accountName, balance, 00);
        // this.accountNumber = accountNumber;
        // this.accountName = accountName;
        // this.balance = balance;
        // this.phoneNumber = 0;
        System.out.println("3 parameter constructor is called");
    }

    contructorInfo(String accountNumber, String accountName, double balance, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        System.out.println("4 parameter constructor is called");
    }

}
