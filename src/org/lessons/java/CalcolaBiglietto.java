package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		//Scanner open
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci i km. da percorrere");
		float km = sc.nextFloat();
		
		System.out.println("Inserisci la tua età");
		int age = sc.nextInt();
		
		sc.close();
		//Scanner close
		
		// DATA
		float kmPrice = 0.21F ;
		float totalPrice = km * kmPrice;
		
		int discountJunior = 20;
		int discountSenior = 40;
		// DATA

		
		if(age <= 18) {
			
			float discountedPrice =  totalPrice * (1-(discountJunior/100f));
			String formattedPrice = String.format("%.2f", discountedPrice);

			System.out.println("formattedPrice " + formattedPrice);

		}
		else if (age >= 65){

			float discountedPrice =  totalPrice * (1-(discountSenior/100f));
			String formattedPrice = String.format("%.2f", discountedPrice);

			System.out.println("formattedPrice " + formattedPrice);
				
		}else {	
			
			String formattedPrice = String.format("%.2f", totalPrice);
			System.out.println(formattedPrice);
			
		}
		
	}
}
