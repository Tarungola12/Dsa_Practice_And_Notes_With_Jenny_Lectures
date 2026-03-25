package Java_Basics_Programs;
import java.util.Scanner;

public class Lec21_Project_Coffe_oredering_system_20oct {
    public static void main(String[] args) {



        System.err.println("*****************************************************");
        System.err.println("*                                                   *");
        System.err.println("*            Welcome to coffe ordering system       *");
        System.err.println("*                                                   *");
        System.err.println("*****************************************************");


        Scanner scanner = new Scanner(System.in);
        
        
        boolean cream,flavor_shot;
        int coffe_select = 0, Totalbill = 0,Vanilla=20,Hazelnut=25;
        System.out.println(
                "Enter Type of coffe which you want in these following :\n1.Espresso-200\n2.Cappucino-250\n3.Latte-300\n");
        
                System.out.println("Enter your choice:\n");
        
        coffe_select = scanner.nextInt();
        
        System.out.println("Some Add Ons You Want");
        
        System.out.println("For whipped cream of rupee 30  (yes=1 / no=0)");
        cream = scanner.nextBoolean();
        if (cream) {
            Totalbill += 30;
        }

        System.out.println("Add a flavor shot? \n(Vanilla for rupee20 or Hazelnut for rupee 25) (yes=1 / no=0)");

        flavor_shot=scanner.nextBoolean();
        if (flavor_shot) {
            System.out.println("Which one \n Enter 1 for Vanilla-20 \n 2 for Hazelnut-25 ");
            int flavor=scanner.nextInt();
            if (flavor==2){
                Totalbill+=25;
            }
            if(flavor==1){
                Totalbill+=20;
            }
            else{
                System.out.println("Enter wrong choice\n");
            }
                                
            }     
        switch (coffe_select) {
            case 1:
                Totalbill+=200;
                System.out.println("total bill of your espresso is :" + Totalbill);
                
                break;
            case 2:
            Totalbill+=250;
            System.out.println("total bill of your cappucino is :" + Totalbill);
            break;
            case 3:
            Totalbill+=300;
            System.out.println("total bill of your latte is :" + Totalbill);
            break;
            default:
                System.out.println("Enter invalid choice For coffe\n");
                break;
        }
    }
}
