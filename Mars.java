public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String ColonyName = "Flowers";

        int ShipPopulation = 300;

        double ShipFood = 4000.00;

        boolean Landing = true;

         ShipFood -= (ShipPopulation * 0.75);
         ShipFood -= (ShipPopulation * 0.75);

         System.out.println(ShipFood);

        ShipFood += (ShipFood * 0.5);

         ShipPopulation += 5;

         System.out.println(ShipPopulation + " The new num of population");
         System.out.println(ShipFood + " new amount of food");

         String LandingCollection = "The Hill";
         if (LandingCollection.equals("The Plain")) {
             System.out.println("Bbzzz Landing on the Plain");
         } else {
             System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
         }

         Landing = LandingCheck(100);
         new GuessingGame();
         new MarsExpedition();
         new FindingsLists();
         //call the landingCheck function
        //call the
    }


    public static boolean LandingCheck(int Loops) throws InterruptedException {
        boolean Landing = LandingCheck(100);

        for (int i = 0; i <= Loops; i++) {
            if (((i % 3) == 0) && ((i % 5 == 0))) {
                System.out.println("Keep Center");
            } else if ((i % 5) == 0) {
                System.out.println("Right");
            } else if ((i % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");

        return false;
    }
}