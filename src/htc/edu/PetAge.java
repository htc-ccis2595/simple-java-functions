package htc.edu;

public class PetAge {

    //Calculating dog age in human years
    public static double calculateDogHumanAge(int dogAge){
        double humanAge = 0;
        if(dogAge <=2) {
            humanAge = dogAge * 10.5;
        }else {
            //first two years, gets you 21 human years
            humanAge = 21;
            //every other year after is 4 human years
            humanAge += 4 * (dogAge-2);

        }

        return humanAge;
    }

    //Calculating cat age in human years
    public static double calculateCatHumanAge(int catAge) {
        double humanAge = 0;

        if (catAge == 1) {
            humanAge = 15;
        } else if (catAge == 2) {
            humanAge = 25;
        } else {
            //first two years, cat will be 25 human years
            humanAge = 25;
            // every other year after is 4 human year
            humanAge += 4 * (catAge - 2);
        }
        return humanAge;
    }



    public static void main(String[] args) {
	// write your code here
        //Finding the dog age
        System.out.println("DogAge Calculator");


        int lokiAge = 10;
        int mollyAge = 17;
        int hermanAge =1;
        int spotAge = 2;


        double lokiHumanAge = calculateDogHumanAge(lokiAge);
        System.out.println("Loki is " + lokiAge + " dog years and " + lokiHumanAge + " human years old");

        double mollyHumanAge = calculateDogHumanAge(mollyAge);
        System.out.println("Molly is " + mollyAge + " dog years and " + mollyHumanAge + " human years old");

        double hermanHumanAge = calculateDogHumanAge(hermanAge);
        System.out.println("Herman is " + hermanAge + " dog years and " + hermanHumanAge + " human years old");

        double spotHumanAge = calculateDogHumanAge(spotAge);
        System.out.println("Spot is " + spotAge + " dog years and " + spotHumanAge + " human years old");
        System.out.println();
        System.out.println();



        //Finding the cat age
        System.out.println("CatAge Calculator");


        int bexAge = 5;
        int lilyAge = 1;
        int jollyAge = 2;
        int betaAge = 9;

        double bexHumanAge = calculateCatHumanAge(bexAge);
        System.out.println("Bex is " + bexAge + " cat years and " + bexHumanAge + " human years old");

        double lilyHumanAge = calculateCatHumanAge(lilyAge);
        System.out.println("Lily is " + lilyAge + " cat years and " + lilyHumanAge + " human years old");

        double jollyHumanAge = calculateCatHumanAge(jollyAge);
        System.out.println("Jolly is " + jollyAge + " cat years and " + jollyHumanAge + " human years old");

        double betaHumanAge = calculateCatHumanAge(betaAge);
        System.out.println("Beta is " + betaAge + " cat years and " + betaHumanAge + " human years old");
    }
}
