
package challenge5;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        System.out.println("");
        Scanner in = new Scanner(System.in);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What did you score?");
        int num = in.nextInt();
        if(num > 20){    
            System.out.println("You scored an A!");
        }
        if(num < 10){
            System.out.println("You failed!");
        }
        if(num >= 11 && num <=19) {
            System.out.println("You scored a C!");
        }
    }
    
}
