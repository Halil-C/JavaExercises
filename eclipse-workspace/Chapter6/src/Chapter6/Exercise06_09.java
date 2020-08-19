package Chapter6;

public class Exercise06_09 {

	public static void main(String[] args) {

        String feetS = "Feet";
        String meter = "Meters";
        System.out.printf("%5s%10s | %5s%9s\n", feetS, meter, meter, feetS);
        System.out.println("----------------------------------");
        for (double feet = 1, meters = 20; feet <= 10; feet++, meters += 5) {

            System.out.printf("%5.2f%10.2f | %5.2f%10.2f\n", feet, footToMeter(feet),
                    meters, meterToFoot(meters));


        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
