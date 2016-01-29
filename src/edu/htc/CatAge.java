package edu.htc;

public class CatAge {


    public static double calculateCatHumanAge(int catAge) {
        double humanAge = 0;

        if (catAge == 1) {
            humanAge = 15;
        }
        else if (catAge == 2) {
            humanAge = 25;
        }
        else{
            humanAge = 25;
            humanAge = (4 * (catAge - 2)) + humanAge;
        }
        return humanAge;
    }

    public static void main(String[] args) {
        System.out.println("PetAge Calculator");

        int lokiAge = 9;
        int mollyAge = 20;
        int hermieAge = 1;

        double lokiHumanAge = calculateCatHumanAge(lokiAge);
        System.out.println("Loki is " + lokiAge + " years old in cat years, which is " + lokiHumanAge + " years in human years.");

        double mollyHumanAge = calculateCatHumanAge(mollyAge);
        System.out.println("Molly is " + mollyAge + " years old in cat years, which is " + mollyHumanAge + " years in human years.");

        double hermieHumanAge = calculateCatHumanAge(hermieAge);
        System.out.println("Hermie is " + hermieAge + " years old in cat years, which is " + hermieHumanAge + " years in human years.");

    }
}