package Chapter6;

public class Exercise06_38 {

	 public static void main(String[] args) {

	        for (int i = 1; i <= 100; i++) {

	            System.out.print(RandomCharacter.getRandomUpperCaseLetter() + " ");
	            if (i % 10 == 0) System.out.println("");
	        }

	        for (int i = 1; i <= 100; i++) {

	            System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");
	            if (i % 10 == 0) System.out.println("");
	        }

	    }
	
}
