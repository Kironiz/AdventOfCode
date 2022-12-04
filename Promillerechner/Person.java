package Promillerechner; 
    


public class Person {
    private String Geschlecht;
    private int Körpergewicht;
    private double Alkoholkonsum;


    public Person(String Geschlecht, int Körpergewicht){
        this.Geschlecht = Geschlecht;
        this.Körpergewicht = Körpergewicht;
        this.Alkoholkonsum = Alkoholkonsum;

    }
    public String getGender(){
        return this.Geschlecht;
    }
    public int getWeight(){
        return this.Körpergewicht;
    }
    public double getAlkoholInBlood(){
        return this.Alkoholkonsum;
    }
    public void drinkAlkohol(double amount, double percentage){
        double percentageInDecimal = percentage/100;
        double amountOfAlkohol = amount*percentageInDecimal;
        this.Alkoholkonsum+=amountOfAlkohol;
    }
    public double getPromille(){
        double Promille = this.Körpergewicht/this.Alkoholkonsum;
        return Promille;
        
    }
    
}
