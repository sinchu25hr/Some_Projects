import java.util.Random;
import java.util.Scanner;
class game{
    int tries = 0;
    int guess;
    Random rand = new Random();
    int x = rand.nextInt(100) ; 
    
    public int userinput(){
        Scanner sc = new Scanner(System.in);
        guess=sc.nextInt();
        iscorrect();
        tries++;
        return guess;
    }
    public boolean iscorrect(){
        if(guess<0){
            System.out.println("invalid give between 0-100");
            userinput();
            return false;
            
        }
        else if(guess>100){
            System.out.println("invalid give between 0-100");
            userinput();
            return false;
            
        }
        else{
            return true;
        }
    }
    public void check() {
        do{
          userinput();
        if (guess>x){
            System.out.println("guessed too high"); 
        }
        else if(guess<x){
            System.out.println("guessed too low");
        }
        else{
            System.out.println("you guessed correct in "+tries+" tries");

        }
    }while(guess!=x);
    }
}

public class Guess{
    public static void main(String[] args) {
        game n=new game();
        n.check();
        
    }
}
