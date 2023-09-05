import java.util.*;
public class task1{
    public static void main(String [] args){
        System.out.println();
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
        System.out.println();
        
        System.out.println("RULES");
        System.out.println("You have to guess a number from 1 to 40");
        System.out.println("You will be having 10 attempts to finish the game");
        
        Scanner sc = new Scanner(System.in);
        
        Random random = new Random();
        int computer_choice = random.nextInt(40);
        //System.out.println(computer_choice);

        int attempts_remaining = 10;
        
        int attempts_taken = 0;
        int user_choice = 0;            
        boolean user_win = false;
        while(attempts_remaining > 0){
        System.out.println("Enter your choice ");
        user_choice = sc.nextInt();
        if(user_choice == computer_choice){
            System.out.println("Congratulations!! , You Win");
            System.out.println("Your Score is " + (10-attempts_taken)*10);
            user_win = true;
            break;
        }
        
        else if(user_choice > computer_choice){
            System.out.println("The number choosen is more in value");
        }
        
        else if(user_choice < computer_choice){
            System.out.println("The number choosen is smaller in value");
        }
        attempts_taken+=1;
        attempts_remaining-=1;
    
    }
    

    if(!user_win){
    System.out.println("OOPS!!, You Loose Try next time");
    System.out.println("Your Score is " + (10-attempts_taken)*10);

    }
    
}
}