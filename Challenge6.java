package challenge6;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);         
            System.out.println("Area of a rectangle calculator:");
            System.out.println("Input length: ");
            int num1 = in.nextInt();
            System.out.println("Input Hight: ");
            int num2 = in.nextInt();  
            int num3 = num1 * num2;
            System.out.println("The anwser was... " + num3);
}
    
}
