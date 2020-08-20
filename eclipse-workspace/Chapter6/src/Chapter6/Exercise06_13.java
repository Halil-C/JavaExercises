package Chapter6;

public class Exercise06_13 {

	public static void main(String[] args) {

        System.out.printf("%-10s%8s\n", "i", "m(i)");
        System.out.println("____________________");
        for (int i = 1; i <= 20; i++) {

            System.out.printf("%-10d%10.4f\n", i, sumSeries(i));
        }
    }

    public static double sumSeries(int n) {

        double sum = 0;

        for (double i = 1; i <= n; i++) {
            sum += i / (i + 1);
        }
        return sum;
    }
	
}
