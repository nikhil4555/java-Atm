package ATM;
import java.util.*;
public class atm {
    public static void main(String[] args) {
      innerATM obj = new innerATM();
      obj.checkPin();
    }
}
class innerATM{
    
    float balance;
    int pin = 8989;
    
    public void checkPin(){
        Scanner nkl = new Scanner(System.in);
        System.out.println("Enter the PIN ");  
        int checkPin = nkl.nextInt();
        if(checkPin==pin){
            System.out.println("Pin Successfull!");
            menu();
        }else{
            System.out.println("Invalid Pin");
            menu();
        }
        // nkl.close();
    }
    
    public void menu(){
        Scanner nkl = new Scanner(System.in);
        System.out.println("Pick one Of the option: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. WithDraw Money");
        System.out.println("3. Deposit the Money");
        System.out.println("4. EXIT");
                
        int option = nkl.nextInt();
        if(option==1){
            checkBalance();
        }else if (option==2) {
            withDrawMoney();
        }else if (option==3) {
            depositMoney();
        }else if(option==4){
            // return
            return ;
        }
        else{
            System.out.println("Select a valid Option");
        }

    }
    public void checkBalance(){
        System.out.println("Your Balance is "+balance);
        menu();
    }
    public void withDrawMoney(){
        Scanner nkl = new Scanner(System.in);
        System.out.println("Enter amount to Withdraw ");
        float amount = nkl.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient Balance");
            
        }else{
            balance = balance-amount;
            System.out.println("WithDrawn SUccessfully");
        }
        menu();

    }
    public void depositMoney(){
        Scanner nkl = new Scanner(System.in);
        System.out.println("Enter the amount to be Deposited");
        float depositMoney = nkl.nextFloat();
        balance = balance+depositMoney;
        System.out.println("Money Deposited Successfully");
        menu();
    }
    
}




