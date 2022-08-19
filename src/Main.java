public class Main {
    public static void main(String[] args) {
        //Task 1
        byte b = -128;
        byte b2 = 127;

        short s = -32768;
        short s2 = 32767;

        int i = -2147483648;
        int i2 = 2147483647;

        long l = 9_223_372_036_854_775_807L;
        long l2 = -9_223_372_036_854_775_808L;

        double d = Double.MIN_VALUE;
        double d2 = Double.MAX_VALUE;
        double doubleVariable = 344.6209;

        float f = Float.MIN_VALUE;
        float f2 = Float.MAX_VALUE;
        float floatVariable = 3.1415F;

        boolean yes = true;
        boolean no = false;
        boolean guessWhat = b == Byte.MIN_VALUE; // ;)

        char c = 'с';
        char c2 = 99;
        char c3 = 'c';
        boolean guessWhat2 = c == c2;  // ;)
        boolean guessWhat3 = c2 == c3;  // ;)
        if (!guessWhat2) {
            System.out.println("Smile!");
        }
        if (guessWhat3) {
            System.out.println("Have a nice day!");
        }
        System.out.println();


        //Task2
        double weightOfFirstBoxer = 78.2;
        double weightOfSecondBoxer = 82.7;
        double sum = weightOfFirstBoxer + weightOfSecondBoxer;
        double difference = weightOfSecondBoxer - weightOfFirstBoxer;
        System.out.println("The total weight of the boxers is " + sum + " kg");
        System.out.println("The second boxer is heavier than the first by " + difference + " kg");
        System.out.println();


        //Task3
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;

        int weightOfBreakfastInGrams = bananas + milk + iceCream + eggs;
        double weightOfBreakfastInKg = weightOfBreakfastInGrams / 1000.0;
        System.out.println("Weight of breakfast in grams: " + weightOfBreakfastInGrams + " grams");
        System.out.println("Weight of breakfast in kilograms: " + weightOfBreakfastInKg + " kilograms");
        System.out.println();


        //Task4
        int weightLossInKg = 7;
        int weightLossInGrams = weightLossInKg * 1000;
        int lossGramsInDay = 250;
        int days = weightLossInGrams / lossGramsInDay;
        System.out.println("Losing " + lossGramsInDay + " grams per day, the athlete will lose weight for " + days + " days");
        lossGramsInDay = 500;
        days = weightLossInGrams / lossGramsInDay;
        System.out.println("Losing " + lossGramsInDay + " grams per day, the athlete will lose weight for " + days + " days");
        System.out.println();


        //Task5
        double mashaSalary = 67_760;
        double denisSalary = 83_690;
        double christinaSalary = 76_230;
        double percent = 10;

        double newMashaSalary = mashaSalary * (100 + percent) / 100;
        double newDenisSalary = denisSalary * (100 + percent) / 100;
        double newChristinaSalary = christinaSalary * (100 + percent) / 100;

        difference = newMashaSalary - mashaSalary;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + difference + " рублей");

        difference = newDenisSalary - denisSalary;
        System.out.println("Маша теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + difference + " рублей");

        difference = newChristinaSalary - christinaSalary;
        System.out.println("Маша теперь получает " + newChristinaSalary + " рублей. Годовой доход вырос на " + difference + " рублей");


    }
}
