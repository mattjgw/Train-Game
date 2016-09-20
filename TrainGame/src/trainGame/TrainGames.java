// Matthew Wright
// August 26 2016
// This is a little game that asks the user 10 multiplication questions
// and grades the user's performance.

package trainGame;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class TrainGames {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) throws Exception{
		int a, b, c, guess = 0;
		int right = 0; int wrong = 0;
		Random number = new Random();
		System.out.print("Welcome to the Train Game! \nEver board on a train?"
				+ " Well never again thanks to this awesome new invention by Matthew"
				+ " Wright. \nThe game is simple, the computer asks you ten multiplication"
				+ " questions and you need to answer them. \n\nLet's go:");
		for(int i = 1; i <= 10; i ++)
		{
			System.out.println("\nQuestion " + i);
			a = number.nextInt(12) + 1;
			b = number.nextInt(12) + 1;
			c = a * b;
			
			guess = question(a, b);
			 
			if (guess == c)
			{
				System.out.println("Correct!");
				right++;
			}
			
			else
			{
				System.out.println("Wrong!");
				wrong++;
			}
		}
		
		System.out.println("\nThank you for playing!");
		if (right == 1)
		{
		System.out.println("You got " + right + " question right and " + wrong + 
				" questions wrong");
		}
		
		else if (wrong == 1)
		{
		System.out.println("You got " + right + " questions right and " + wrong + 
				" question wrong");
		}
		
		else
		{
			System.out.println("You got " + right + " questions right and " + wrong + 
					" questions wrong");
		}
			
		
	}

	private static int question(int a, int b) {
		
		int guess = 0;
		int exception = 1;
		
		try
		{
			System.out.println("\nWhat is " + a + "x" + b + "?");
			guess = keyboard.nextInt();
		}
	
		catch(Exception e)
		{
			System.out.println("Please enter an integer");
			question(a, b);
		}
		
		return guess;
		
	}

}
