package Hackathon;

import java.util.InputMismatchException;
import java.util.Scanner;


public class HackNac{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner console=new Scanner(System.in);
		
		System.out.println("GradeCalculator, FlashCards, Schedule, and Helpful links(Print which one you want in words, with exact letters).");
		String input=console.next();
		boolean first=false;
		while(!first) {
		if(input.equals("GradeCalculator")) {
			System.out.println("Input (in numbers) the amount of minutes you studied");
			int numOfTime=console.nextInt();
			boolean oooh=false;
			while(!oooh) {
			try {
			 numOfTime=console.nextInt();
			 oooh=true;
			}catch(InputMismatchException e){
				System.out.println("Print integers only!");
				console.next();
			}
			}
			double k=0.072*numOfTime+88.23;
			if(k<=100) {
			if(numOfTime<30) {
				System.out.println("The average grade is 88.23, but we really can't tell because studying less than 30 minutes is completely luck based.");
			}
			else {
				System.out.println("Your grade is "+k+".");
			}
			
			
			}
			else {
				System.out.println("Your score is 100");
			}
			first=true;
		}
		
		else if(input.equals("FlashCards")) {
			System.out.println("Print the number of FlashCards you want in number.");
			int numOfFlashCards=console.nextInt();
			boolean ooh=false;
			while(!ooh) {
			try {
				numOfFlashCards=console.nextInt();
				ooh=true;
			}catch(InputMismatchException e) {
				System.out.println("Input integers!");
				console.next();
			}
			}
			for(int i=1; i<=numOfFlashCards; i++) {
				System.out.println("Print the front of the flashcard.");
				String front=console.next();
				System.out.println("Print the back of the flashcard.");
				String back=console.next();
				System.out.println("Do you want to keep on memorizing(print memorize) or do you want to go ahead.");
				String choiceToGo=console.next();
				if(choiceToGo.equals("memorize")) {
					Boolean hello=false;
					while(!hello) {
					System.out.println(front);
					String Answer=console.next();
					if(Answer==back) {
						System.out.println("correct");
					}
					else {
						System.out.println("Incorrect");
					}
					System.out.println("Do you want to continue or move on(print move on to go ahead).");
					String choices=console.next();
					if(choices.equals("move on")) {
						hello=true;
					}
				}
					}
				
			}
			first=true;
		}
		else if(input.equals("Helpful links.")) {
			
			first=true;
		}
		else if(input.equals("Schedule")) {	
			
		System.out.println("What grade are you in.");
		int grade=console.nextInt();
		boolean nnn=false;
		while(!nnn) {
		try {
			grade=console.nextInt();
			nnn=true;
		}catch(InputMismatchException e) {
			System.out.println("Print integers only");
			console.next();
		}
		}
		System.out.println("What is the scale, 1 as in a quiz/n2 as in a normal test/n3 as in a final/n4 as in an AP exam or SAT caliber.");
		int scale=console.nextInt();
		boolean nnnn=false;
		while(!nnnn) {
		try {
			scale=console.nextInt();
			nnnn=true;
		}catch(InputMismatchException e) {
			System.out.println("Print integers only");
			console.next();
		}
		}
		System.out.println("How many days till the exam?");
		int daysLeft=console.nextInt();
		boolean nnnnn=false;
		while(!nnnnn) {
		try {
			daysLeft=console.nextInt();
			nnnnn=true;
		}catch(InputMismatchException e) {
			System.out.println("Print integers only");
			console.next();
		}
		}
		if(scale==3||scale==4) {
			double AOTS=250/daysLeft;
			System.out.println(AOTS);
		}
		else {
			double AOTS=40/daysLeft;
			System.out.println(AOTS);
		}
		first=true;
		}
		
	}
	

	}

	
}







