import java.util.Random;
import java.util.Scanner;

/*
 * Tyler Holmes 09/25/13 Fall Software Engineering w/ Thao
 * This program randomly generates a number and then
 * prompts the user to guess what number was generated.
 */
public class GuessingGame
{
	public static void main(String[] args)
	{
		int userInput, count;
		Scanner keyboard = new Scanner(System.in);
		Random rGen = new Random();
		int randomInt = rGen.nextInt(10);
		//System.out.println(randomInt);
		System.out.println("Please enter an integer between 1 and 10");
		userInput = keyboard.nextInt();
		count = 1;

		while (userInput != randomInt)
		{
			count++;
			if (userInput == randomInt)
			{
				System.out.println("Congratualtions! You guessed correctly! *Fireworks*");
			}
			else if (userInput > randomInt)
			{
				System.out.println("Too high! The number is: " + randomInt);
			}
			else if (userInput < randomInt)
			{
				System.out.println("Too low! The number is: " + randomInt);
			}
		}
		System.out.println("Congratulations, You have guessed correctly! *Fireworks*");
		System.out.println("It took you " + count + " tries to guess the number!");
		
		
	}
}
