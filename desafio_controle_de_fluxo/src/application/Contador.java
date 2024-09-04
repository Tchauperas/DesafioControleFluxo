package application;

import java.util.Locale;
import java.util.Scanner;

import util.ParametrosInvalidos;

public class Contador {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int p1 = sc.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int p2 = sc.nextInt();
		
		try {
			
		} catch (ParametrosInvalidos e) {
			
		}
		
		sc.close();
	}
}
