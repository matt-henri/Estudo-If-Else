package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// Exer. estudo de cálculo de imposto.
		// Estudo de IF ELSE
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		double salario;
		double imposto;
		System.out.println(" --- CÁLCULO DE IMPOSTO ---");
		System.out.println("Digite valor do Salário: ");
		salario = sc.nextDouble();
		
		
		if ( salario <= 2000.0 ) {
				imposto = 0.0;
		} else if ( salario <= 3000.0 ) {
				imposto = (salario - 2000.0) * 0.08;
		} else if ( salario <= 4500.0) {
				imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
				imposto = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if ( imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("RS %.2f", imposto);
		}
		
		sc.close();
		
	}
		
	
}
