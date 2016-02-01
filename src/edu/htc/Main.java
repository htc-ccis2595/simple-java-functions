package edu.htc;

public class Main {

    public static float calculateDogHumanAge(float dogAge) {
        float dog2humanAge = 0;

        if (dogAge <= 2) {
            dog2humanAge = (float) (dogAge * 10.5);
        } else {
            dog2humanAge = (float) (2 * 10.5) + ((dogAge - 2) * 4);
        }

        return dog2humanAge;
    }


    public static float calculateCatHumanAge(float catAge) {
        float cat2humanAge = 0;
        if (catAge <= 1) {
            cat2humanAge = (float) (catAge * 15);
        } else if (catAge > 1 && catAge < 2) {
            cat2humanAge = (float) 25;
        } else {
            cat2humanAge = (float) 25 + ((catAge - 2) * 4);
        }

        return cat2humanAge;

    }

    public static void main(String args[]) {
        //Cats
        float Princess = 15;
        float Mario = 4;
        float Luigi = 2;

        //Dogs
        float Bowser = 3;
        float Goomba = 12;
        float Boo = 1;

        System.out.println("Princess the cat is " + Princess + " years old in cat years.");
        System.out.println("She is " + calculateCatHumanAge(Princess) + " years old in human years.");
        System.out.println("Mario the cat is " + Mario + " years old in cat years.");
        System.out.println("He is " + calculateCatHumanAge(Mario) + " years old in human years.");
        System.out.println("Luigi the cat is " + Luigi + " years old in cat years.");
        System.out.println("He is " + calculateCatHumanAge(Luigi) + " years old in human years.");

        System.out.println("Bowser the dog is " + Bowser + " years old in dog years.");
        System.out.println("He is " + calculateDogHumanAge(Bowser) + " years old in human years.");
        System.out.println("Goomba the dog is " + Goomba + " years old in dog years.");
        System.out.println("He is " + calculateDogHumanAge(Goomba) + " years old in human years.");
        System.out.println("Boo the dog is " + Boo + " years old in dog years.");
        System.out.println("He is " + calculateDogHumanAge(Boo) + " years old in human years.");
    }

}
