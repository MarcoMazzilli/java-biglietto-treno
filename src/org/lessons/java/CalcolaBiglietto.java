package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		float kmPrice = 0.21F ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci i km. da percorrere");
		float km = sc.nextFloat();
		System.out.println(km);
		
		System.out.println("Inserisci la tua età");
		int age = sc.nextInt();
		System.out.println(age);
		
		sc.close();
		
		float totalPrice = km * kmPrice;
		System.out.println("Tot. price " + totalPrice);
		int discountJunior = 20;
		int discountSenior = 40;

		
		if(age <= 18) {
			
			float totalDiscount =  totalPrice * discountJunior / 100;
			float discountedPrice = totalPrice - totalDiscount ;

			System.out.println("discountedPrice " + discountedPrice);

		}else if (age >= 65){

			float totalDiscount =  totalPrice * discountSenior / 100;
			float discountedPrice = totalPrice - totalDiscount ;

			System.out.println("discountedPrice " + discountedPrice);
				
		}else {	
			System.out.println(totalPrice);
		}
		
	}
}
