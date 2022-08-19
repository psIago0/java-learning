package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class BuyDollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Whait is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		double result = CurrencyConverter.converter(dollar, quantity);
		
		System.out.printf("Amount to be paid in reais: %.2f\n", result);
		
		sc.close();
	}

}