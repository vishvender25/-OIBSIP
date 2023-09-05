import java.util.Scanner;

public class ATM {
    static class Atm_interface{
     int balance;
     int pin;
     int user_pin = 2507;
     int user_Choice = 0;    
     public Atm_interface(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin ");
        int p = sc.nextInt();
        this.pin = p;
        this.balance = 10000;
        if(pin != user_pin){
            System.out.println("Sorry wrong pin entered");
        }
        else{
            System.out.println("Welcome");
            facilities();
        }

    }

    public void display_balance(){
        System.out.println("Your current balance is " + balance);
    }

    public void withdraw(int amount){
        if(amount > this.balance){
            System.out.println("Soory insufficient balance");
        }
        else{
            System.out.println("Transaction successfull");
            this.balance -= amount;
        }
    }

    public void deposit(int amount){
        this.balance += amount;
        System.out.println("Amount deposited successfully");
    }

    public void alterPin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current pin");
        int p = sc.nextInt();
        if(p != user_pin){
            System.out.println("Sorry wrong pin entered..");
        }
        else{
            System.out.println("Enter the new pin");
            int new_pin = sc.nextInt();
            user_pin = new_pin;
        }
        System.out.println("Pin altered successfully");
    }

    public void facilities(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Enter 1 to view Balance");
        System.out.println("Enter 2 withdraw amount ");
        System.out.println("Enter 3 to deposit amount");
        System.out.println("Enter 4 to change your pin");
        System.out.println("Enter 5 to exit ");
        System.out.println("---------------------------");
        
        user_Choice = sc.nextInt();
        
        if(user_Choice == 5){
            System.out.println("..Thanks for using our service..");
            System.out.println();
            return;
        }
        if(user_Choice == 1){
            display_balance();
            System.out.println();
       }
       
       else if(user_Choice == 2){
        System.out.println("Enter amount to withdraw ");
        int amount = sc.nextInt();  
        withdraw(amount);
        System.out.println();
    }
       else if(user_Choice == 3){
        System.out.println("Enter the amount to deposit");
        int amount = sc.nextInt();
        deposit(amount);
        System.out.println();
    }
    else if(user_Choice == 4){
         alterPin();
         System.out.println();
    }
      facilities();
    }
    
    }
    public static void main(String[] args){
       Atm_interface u1 = new Atm_interface();
     
    }    
}
