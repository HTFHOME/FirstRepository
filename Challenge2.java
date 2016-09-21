package challenge2;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = myScanner.nextLine();
        System.out.println("what is the population of "+ name +" ?");
        int num = in.nextInt();
        System.out.println("Hello " + num);
    }
    
}
