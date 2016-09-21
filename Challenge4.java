package challenge4;
import java.util.Scanner;
public class Challenge4 {

    public static void main(String[] args) {
        
        System.out.println("Hey, please input your number: ");
        Scanner in = new Scanner(System.in);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Number: ");
        int num = in.nextInt();
        if(num < 100){
            System.out.println("This is less than 100");
        } 
        else{
            System.out.println("This is over 100");
    }
        
    }
    
}
