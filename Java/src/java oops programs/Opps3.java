package java// public class Opps3 {
//     public static void main(String[] args) {
//         // coding question on clases and objects.
//         // bankAccount obj = new bankAccount();
//         // obj.setAccountName("Tarun");
//         // obj.deposit(1000);
//         // obj.withDraw(1000);
//         // obj.getBalance();

//         // System.out.println();
//         // System.out.println();
//         // System.out.println();
//         // obj.displayAllDetails();
//         // System.out.println();
//         // System.out.println();

//         // Question Number 2 :
//         circle obj = new circle();
//         obj.setRadius(-52);
//         System.out.println(obj.getArea());
//         System.out.println(obj.getCircumference());

//     }

// }

// class bankAccount {
//     String accountNumber;
//     String accountName;
//     double balance;
//     long phoneNumber;

//     public String getAccountNumber() {
//         return accountNumber;
//     }

//     public void setAccountNumber(String accountNumber) {
//         this.accountNumber = accountNumber;
//     }

//     public String getAccountName() {
//         return accountName;
//     }

//     public void setAccountName(String accountName) {
//         this.accountName = accountName;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void setBalance(double balance) {
//         this.balance = balance;
//     }

//     public long getPhoneNumber() {
//         return phoneNumber;
//     }

//     public void setPhoneNumber(long phoneNumber) {
//         this.phoneNumber = phoneNumber;
//     }

//     public bankAccount deposit(int moneyToBeDeposit) {
//         if (moneyToBeDeposit <= 0) {
//             System.out.println("Enter valid number.");
//             return this;
//         }
//         balance = moneyToBeDeposit;
//         System.out.println("Desposit money are : " + moneyToBeDeposit + "\nBalance is : " + balance);
//         return this;
//     }

//     public bankAccount withDraw(int moneyToBewithDraw) {
//         if (moneyToBewithDraw <= 0) {
//             System.out.println("Enter valid amount.");
//             return this;
//         }
//         if (balance - moneyToBewithDraw < 0) {
//             System.out.println("You can't withdraw amount.");
//             return this;
//         }
//         balance = balance - moneyToBewithDraw;
//         System.out.println("withDraw money are : " + moneyToBewithDraw + "\nBalance is : " + balance);
//         return this;
//     }

//     public void displayAllDetails() {
//         System.out.println("Your balance is :" + balance + "\n Name is :" + accountName + "\nphone number is : "
//                 + phoneNumber + "\n account number is :" + accountNumber);
//     }
// }

// class circle {
//     double radius = 1;

//     public void setRadius(double radius) {
//         if (radius <= 0) {
//             System.out.println("Enter valid radius.");
//             return;
//         }
//         this.radius = radius;
//     }

//     public double getArea() {
//         if(radius == 1){
//             System.out.println("Your default area is : " );
//         }
//         double area =  3.14 * radius * radius;
//         return area;
//     }

//     public double getCircumference() {
//         if (radius == 1) {
//             System.out.println("Your default circumeference is : ");
            
//         }
//         double circumference = 2 * 3.14 * radius;
//         return circumference;
//     }

// }


class Opps3{
    public static void main(String[] args) {
        // System.out.write(5);
        System.out.println("hi from main class");
       
    }
}
 
