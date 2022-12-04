package Schaltjahresrechner;

import java.util.Scanner;

public class Schaltjahresrechner {

    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    while(true){
        System.out.println("Ask for a year to check for Leapyears. The number 0 ends the script.");
        int input = scanner.nextInt();

        if(input==0){
            break;
        }
        if(input%4==0){
            System.out.println(" Is a leapyear");
        }else{
            System.out.println(" Is not a leapyear");
        }
    }
        

    }
    
}
