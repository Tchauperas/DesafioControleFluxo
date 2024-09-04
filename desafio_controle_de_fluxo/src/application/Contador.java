package application;

import java.util.Locale;
import java.util.Scanner;

import util.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		System.out.print("Digite o primeiro parâmetro: ");
		int p1 = sc.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int p2 = sc.nextInt();
		
		while(check) {
			try {
				
				contar(p1, p2);
				check = false;
				
			} catch (Exception e) {
				
				System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
				
			}
		}
		
		System.out.println("Done.");
		
		sc.close();
	}
	
	public static void contar(int p1, int p2) throws ParametrosInvalidosException {
		if(p1 > p2) {
			throw new ParametrosInvalidosException();
		}
	}
}
