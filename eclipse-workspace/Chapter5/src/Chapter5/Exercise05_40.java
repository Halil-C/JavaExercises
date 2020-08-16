package Chapter5;

public class Exercise05_40 {

	public static void main(String[] strings) {
        int tails = 0;
        int heads = 0;
        for (int i = 0; i < 1000000; i++) {

            int flip = (int) (Math.random() * 2);
            if (flip == 1) {
                heads++;
            } else
                tails++;
        }
        System.out.println("Heads: " + heads + " Tails: " + tails);
    }
	
}
