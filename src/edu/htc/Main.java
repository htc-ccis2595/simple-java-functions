package edu.htc;

public class Main {
    public static double calculateDogHumanAge(int dogAge){
        double humanAge = 0;

        if (dogAge <= 2){
            humanAge = dogAge * 10.5;
        }else {
            //fist 2 years = 21 human years
            humanAge = 21;
            humanAge += 4 * (dogAge - 2);
        }
        return humanAge;
    }

    public static double calculateCatHumanAge(int catAge){
        double humanAge = 0;

        switch (catAge){
            case 1: humanAge = 15;
                    break;
            case 2: humanAge = 25;
                    break;
            default: humanAge = 25 + ((catAge - 2)  * 4);
                    break;
        }
        return humanAge;
    }

    public static void main(String[] args) {
        System.out.println("Pet Age Calculator\n");

        int lokiAge = 10;
        int mollyAge = 17;
        int hermanAge = 1;
        int spotAge = 2;

        double lociAgeHumanAge = calculateDogHumanAge(lokiAge);
        System.out.println("Loki is " + lokiAge + " dog years old and " + lociAgeHumanAge + " human years old.");

        double mollyHumanAge = calculateDogHumanAge(mollyAge);
        System.out.println("Molly is " + mollyAge + " dog years old and " + mollyHumanAge + " human years old.");

        double hermanHumanAge = calculateDogHumanAge(hermanAge);
        System.out.println("Herman is " + hermanAge + " dog year old and " + hermanHumanAge + " human years old.");

        double spotHumanAge = calculateDogHumanAge(spotAge);
        System.out.println("Spot is " + spotAge + " dog years old and " + spotHumanAge + " human years old.\n");

        //cat age example

        int missyAge = 1;
        int freddyAge = 2;
        int simonAge = 9;
        int catAge = 20;
        int sneakersAge = 4;

        double missyHumanAge = calculateCatHumanAge(missyAge);
        System.out.println("Missy is " + missyAge + " cat year old and " + missyHumanAge + " human years old.");

        double freddyHumanAge = calculateCatHumanAge(freddyAge);
        System.out.println("Freddy is " + freddyAge + " cat years old and " + freddyHumanAge + " human years old.");

        double simonHumanAge = calculateCatHumanAge(simonAge);
        System.out.println("Simon is " + simonAge + " cat years old and " + simonHumanAge + " human years old.");

        double catHumanAge = calculateCatHumanAge(catAge);
        System.out.println("Cat is " + catAge + " cat years old and " + catHumanAge + " human years old.");

        double sneakersHumanAge = calculateCatHumanAge(sneakersAge);
        System.out.println("Sneakers is " + sneakersAge + " cat years old and " + sneakersHumanAge + " human years old.");


    }
}
