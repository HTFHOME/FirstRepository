package challenge3;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You have chosen: Division ");
        System.out.println("Number 1: ");
        int num1 = in.nextInt();  
        System.out.println("Number 2: ");
        int num2 = in.nextInt();
        int num3 = num1 / num2;
        System.out.println("The anwser was... " + num3);
    }
    
}
