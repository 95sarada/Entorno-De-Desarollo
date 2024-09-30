package main;

import java.util.Scanner;

public class Numeroprimo {
	
	//metodos para verificar si un numero es primo
	
	public static boolean esPrimo(int numero) {
		
		//un numero menor que 2 no es primo
		if(numero < 2) {
			return false;
		}
		//verificamos si el numero tiene algun divisor distinto de 1 y de si misma 
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i== 0) {
				return false; 
				//si no encuentramos el divisores, es primo
			}
		}
		return true;
		//si no encuetramos el divisores, es primo
		
		public static void main(String[] args) 
		{
			Scanner sc = new 
					Scanner sc = new
					Scanner (System.in);
			System.out.print("ingresa un numero:");
			int numero= sc.nextInt();
			if (esPrimo(numero)) {
				System.out.println(numero+"es un numero primo.");
			}
			else {
				System.out.println(numero +" no es un numero primo.");
			}
			sc.close();
		}
	}
	}
