/**
 * Created by Owner on 2/1/2016.
 */
public class PetAge {
    public static double calculateDogHumanAge(int dogAge) {
        double humanAge = 0;
        if (dogAge <= 2) {
            humanAge = dogAge * 10.5;
        }
        else {
            // first two years, gets you 21 human years
            humanAge = 21;

            // every other year after is 4 human years
            humanAge += 4 * (dogAge-2);
        }

        return humanAge;
    }

    public static double calculateCatHumanAge(int catAge) {
        double humanAge = 0;
        if (catAge == 1) {
            humanAge = 15;
        }
        else if (catAge == 2) {
            humanAge = 25;
        }
        else {
            humanAge = 25 + 4 * (catAge-2);
        }
        return humanAge;
    }

    public static void main(String[] args) {

        System.out.println("PetAge Calculator\n");

        int lokiAge = 10;
        int mollyAge = 17;
        int hermanAge = 1;
        int spotAge = 2;

        double lokiHumanAge = calculateDogHumanAge(lokiAge);
        System.out.println("Loki is " + lokiAge + " dog years and " + lokiHumanAge + " human years old.\n");

        double mollyHumanAge = calculateDogHumanAge(mollyAge);
        System.out.println("Molly is " + mollyAge + " dog years and " + mollyHumanAge + " human years old.\n");

        double hermanHumanAge = calculateDogHumanAge(hermanAge);
        System.out.println("Herman is " + hermanAge + " dog years and " + hermanHumanAge + " human years old.\n");

        double spotHumanAge = calculateDogHumanAge(spotAge);
        System.out.println("Spot is " + spotAge + " dog years and " + spotHumanAge + " human years old.\n");

        int lucyAge = 1;
        int speckAge = 9;
        int aliceAge = 20;

        double lucyHumanAge = calculateCatHumanAge(lucyAge);
        System.out.println("Lucy is " + lucyAge + " cat years and " + lucyHumanAge + " human years old.\n");

        double speckHumanAge = calculateCatHumanAge(speckAge);
        System.out.println("Speck is " + speckAge + " cat years and " + speckHumanAge + " human years old.\n");

        double aliceHumanAge = calculateCatHumanAge(aliceAge);
        System.out.println("Alice is " + aliceAge + " cat years and " + aliceHumanAge + " human years old.\n");
    }
}
