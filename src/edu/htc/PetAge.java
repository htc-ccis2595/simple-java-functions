package edu.htc;

public class PetAge {

        public static double calculateDogHumanAge(int dogAge){
            double humanAge = 0;

            if (dogAge <= 2){
                humanAge = dogAge * 10.5;
            }else {
                humanAge = 21;

                humanAge += 4 * dogAge;
            }

            return humanAge;
        }
        public static double calculateCatHumanAge(int catAge){
            double humanAge = 0;

            if (catAge <= 1) {
                humanAge = 15;
            }
            else if (catAge == 2) {
                humanAge = 25;
            }else {
                humanAge = 25;

                humanAge += 4 * (catAge - 2);
            }

            return humanAge;
        }

        public static void main(String[] args) {
            System.out.println("petAge calculator");

            int lokiAge = 10;
            int mollyAge = 17;
            int hermanAge = 1;
            int spotAge = 2;

            double lokiHumanAge = calculateDogHumanAge(lokiAge);
            System.out.println("Loki is " + lokiAge + " dog years and " +
                    lokiHumanAge + " human years old");
            double mollyHumanAge = calculateDogHumanAge(mollyAge);
            System.out.println("Molly is " + mollyAge + " dog years and " +
                    mollyHumanAge + " human years old");
            double hermanHumanAge = calculateDogHumanAge(hermanAge);
            System.out.println("Herman is " + hermanAge + " dog years old and " +
                    hermanHumanAge + " human years old");
            double spotHumanAge = calculateDogHumanAge(spotAge);
            System.out.println("Spot is " + spotAge + " dog years old and " +
                    spotHumanAge + " human years old");

            int whiskersAge = 1;
            int hughAge = 2;
            int ladenAge = 5;
            int kaosAge = 3;

            double whiskersHumanAge = calculateCatHumanAge(whiskersAge);
            System.out.println("Whiskers is " + whiskersAge + " cat years old and " +
                    whiskersHumanAge + " human years old");
            double ladenHumanAge = calculateCatHumanAge(ladenAge);
            System.out.println("Laden is " + ladenAge + " cat years old and " +
                    ladenHumanAge + " human years old");
            double hughHumanAge = calculateCatHumanAge(hughAge);
            System.out.println("Hugh is " + hughAge + " cat years old and " +
                    hughHumanAge + " human years old");
            double kaosHumanAge = calculateCatHumanAge(kaosAge);
            System.out.println("Kaos is " + kaosAge + " cat years old and " +
                    kaosHumanAge + " human years old");
        }
    }


