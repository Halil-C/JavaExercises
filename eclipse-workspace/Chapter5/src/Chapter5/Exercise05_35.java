package Chapter5;

public class Exercise05_35 {

	public static void main(String[] strings) {
        // 1 - 625
        double totalSum = 0;
        for (int i = 1; i < 625; i++) {
            totalSum += 1.0 / (Math.sqrt(i) + Math.sqrt(i + 1.0));
        }
        System.out.println("The total sum: " + totalSum);
    }

	
}
