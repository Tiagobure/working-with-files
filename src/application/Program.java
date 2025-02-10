package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de produtos: ");
		int number = sc.nextInt();
		String[] vector = new String[number];
		
		for(int i=0;i < vector.length; i++) {
			
		System.out.println("Dados dos produtos: ");
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity: ");
		Integer quantity = sc.nextInt();
		Product product =new Product(name,price,quantity);
		vector[i]=product.toString();
				
		}
		for(int i = 0; i < vector.length;i++) {
			System.out.println(vector[i]);
		}
		
		
		
	}

}
