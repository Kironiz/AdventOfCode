package Promillerechner;

import java.util.Scanner;

public class Promillerechner{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Person Georgios = new Person("Männlich", 75);

        while(true){
            System.out.println("What do you want to do?");
            System.out.println("Get information (Type in 'get Info)'");
            System.out.println("To end the program type 'end'");
            String input = scanner.nextLine();
            //entweder "get Info", "end"

            while(true){
                if(input.equals("get Info")){
                    System.out.println("What do you want to do?");
                    System.out.println("Get the Weight, Get the Gender, Get the Amount of Alcohol in the Blood, Put in a drink, Get the Alcohol level");
                    System.out.println("To stop the program type 'end'");
                    String input2= scanner.nextLine();
                    if(input2.equals("Get Weight")){
                        Georgios.getWeight();
                    }else if(input2.equals("Get Gender")){
                        Georgios.getGender();
                    }else if(input2.equals("Get Alcohol in Blood")){
                        Georgios.getAlkoholInBlood();
                    }else if(input2.equals("Add Drink")){
                        System.out.println("How much did you drink?");
                        int amountOfDrink = scanner.nextInt();
                        System.out.println("How much Alcohol was in the drink?(only whole numbers)");
                        double percentage = scanner.nextDouble();
                        System.out.println("Adding the drink");
                        Georgios.drinkAlkohol(amountOfDrink, percentage);
                    }else if(input2.equals("Get Alcohol Level")){
                        Georgios.getPromille();
                    }else{
                        continue;
                    }
                }else if(input.equals("end")){
                    break;
                }else{
                    continue;
                }
            }

            
        }

        

        

    }
}