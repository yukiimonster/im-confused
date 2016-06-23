package desktest;
import java.util.*;

import javax.swing.*;

public class Main {

public static void main(String[] args)
	{
		final int[] deck;

		deck = new int[5];
		for (int i = 0; i < 5; i++)
		{
			deck[i] = i*10;
		}
	
        for ( int i = deck.length-1; i > 0; i-- )
        {
            int rand = (int)(Math.random()*(i+1));
            int tmp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = tmp;
        }
	
		
		Scanner keyboard = new Scanner(System.in);
		
		int act = 0;
		while (act != 4)
		{	
			System.out.println(deck[0]);
			System.out.println("next card?");
			act = keyboard.nextInt();
		
			int temp = deck[0];
			for (int i = 1; i < deck.length-1; i++)
			{
				deck[i-1] = deck[i];
			}
			deck[deck.length-1] = temp;
		}
		
	}

}