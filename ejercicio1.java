package Tarea3;
import java.util.Scanner;
public class ejercicio1 { //Programa que te da el cuadrado del numero que le des hasta que sea negativo 
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame un numero real: ");
		double num = entrada.nextDouble();
		
		if(0>num) {
			System.out.println("El cuadrado de "+num+" es "+(num*num));
		}
		while(num>=0) {
			System.out.println("El cuadrado de "+num+" es "+(num*num));
			System.out.print("Escribeme otro numero: ");
			num = entrada.nextDouble();
			if(0>num) {
				System.out.println("El cuadrado de "+num+" es "+(num*num));
			}
		}
	}
}
