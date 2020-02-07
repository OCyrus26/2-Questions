import java.awt.*;
import java.util.*;

public class TwoQuestionsVersion1 {

	public static void main(String[] args) 
	{	
		String answer1;
		String answer2;
		
		boolean Animal=false;
		boolean Vegetable=false;
		boolean Mineral=false;
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to 2 Questions! ");
		
		System.out.println("Is it a Animal, Vegetable, or Mineral? :");
		answer1 = scan.next();
		
		if (answer1.equalsIgnoreCase("Animal"))
		{
			System.out.println("Is it bigger than your laptop? ");
			answer2 = scan.next();
			
				if (answer2.equalsIgnoreCase("yes"))
				{
					System.out.println("Pig");
				}
				
				if (answer2.equalsIgnoreCase("no"))
				{
					System.out.println("Hamster");
				}
		}
		
		if (answer1.equalsIgnoreCase("Vegetable"))
		{
			System.out.println("Is it bigger than your laptop? ");
			answer2 = scan.next();
		
		
				if (answer2.equalsIgnoreCase("yes"))
				{
					System.out.println("Tree");

				}
		
				if (answer2.equalsIgnoreCase("no"))
				{
					System.out.println("Carrot");

				}
		}
		
		if (answer1.equalsIgnoreCase("Mineral"))
		{
			System.out.println("Is it bigger than your laptop? ");
			answer2 = scan.next();
			
				if (answer2.equalsIgnoreCase("yes"))
				{
					System.out.println("Gold!");

				}
				
				if (answer2.equalsIgnoreCase("no"))
				{
					System.out.println("Copper Coin");

				}
		}
	}

}
