package Chapter3;

import java.util.Scanner;

public class Exercise03_17 {

public static void main(String[] args) {
	
	int computer = (int)(Math.random() * 3);
			
	System.out.println("scissor (0), rock (1), paper (2):");
	
	Scanner input = new Scanner(System.in);
	
	int user = input.nextInt();
	
	
	switch (computer) 
	{
	
	case 0 : System.out.println("The computer is scissor."); break;
	case 1 : System.out.println("The computer is rock"); break;
	case 2 : System.out.println("The computer is paper"); 
	}
	
	switch (user) 
	{
	
	case 0 : System.out.println("You are scissor."); break;
	case 1 : System.out.println("You are rock"); break;
	case 2 : System.out.println("You are paper"); 
	}
	
	if (user == computer )
	{
		System.out.println("It is a draw");
		
	}
	else 
	{
		boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 &&  computer == 1);
		
		if (win)
			System.out.println("You win!");
		else
			System.out.println("You lose!");
	}
	
	{
		
		
	}
	}
}



