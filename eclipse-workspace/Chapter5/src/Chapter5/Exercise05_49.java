package Chapter5;

import java.util.Scanner;

public class Exercise05_49 {
	
	 public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a string: ");
		 
		 String entry = input.nextLine();
		 
		 
		 
	        int vowel = getVowel(entry);
	        int consonant = getConsonants(entry);

	        System.out.println(vowel + " " + consonant);



	    }

	    public static int getConsonants(String s) {

	        s = s.toUpperCase();
	        int count = 0;
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            if (isConsonant(ch)) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static int getVowel(String s) {

	        int count = 0;
	        for (int i = 0; i < s.length(); i++) {

	            char ch = s.charAt(i);
	            if (isVowel(ch)) {
	                count++;
	            }

	        }
	        return count;
	    }

	    public static boolean isVowel(char ch) {

	        ch = Character.toUpperCase(ch);

	        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

	    }

	    public static boolean isConsonant(char ch) {

	        return !isVowel(ch) && ch >= 'A' && ch <= 'Z';
	    }



}
