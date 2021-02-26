package Tarea3;
import java.util.Scanner;
public class ejercicio2 { //Programa que acaba cuando le des un 0
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		double num;
		System.out.println("Este programa no acabará hasta que me des un 0");
		System.out.print("Dame un numero: ");
		 num = entrada.nextDouble();
		
		if(num==0) {
			System.out.print("Perfecto me has dado un 0\nEl programa se ha cerrado");
		}
		while(num!=0) {
			
			if(num<0) {
				System.out.println("Me has introducido un numero negativo");
			}	
			else if(num>0) {
				System.out.println("Me has introducido un numero positivo");
			}				
			System.out.print("Dame otro numero: ");
			num = entrada.nextDouble();					 
		}	
		System.out.print("Perfecto me has dado un 0\nEl programa se ha cerrado");
	}
}
