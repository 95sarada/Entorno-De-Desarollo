package main;

import java.util.Scanner;

public class Suma2numeros {
	public static void main(String[] args)
	{
		//crear un objeto scanner para leer la entrada del usuario
		
		Scanner scanner = new
				Scanner(System.in);
		
		//pedir al usuario que ingrese el primer numero
		
		System.out.println("Ingresa el primer numero: ");
		int numero1 = scanner.nextInt();
		
		//pedir al usuario que ingrese el segundo numero
		
		System.out.print("Ingresa el segundo numero: ");
		int numero2 = scanner.nextInt();
		
		//calcula la suma
		int suma = numero1 + numero2;
		
		//imprimir el resultado
		System.out.println("La suma de " + numero1 + "y" + numero2 + "es:" + suma);
		
		
		
		
	}

}
