package Chapter5;

public class Exercise05_33 {
    public static void main(String[] strings) {


    for (int number = 6; number <= 10000; number++) {
        int total = 0;
        int divisor = number - 1;

        while (divisor > 0) {

            if (number % divisor == 0) {
                total += divisor;
            }
            divisor--;
        }

        if (number == total) {
            System.out.println(number);
        }

    }
}
}
