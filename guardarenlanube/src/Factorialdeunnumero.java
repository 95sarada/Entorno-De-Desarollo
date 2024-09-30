package main;

public class Factorialdeunnumero {
int n= 7;
int resultado = 1;
for (int i = 1; i<=n; i++) {
	resultado = resultado*i;
}
System.out.println("El factorial de" + n + "es" + resultado);
}
