	/*
	 * Crear un nuevo proyecto llamado NumeroParImpar
	un pryecto que evalúe si un número es par o impar (se puede usar el operador ternario)
	Imprimir en terminal el resultado


	 * */
import java.util.Scanner;

public class NumeroImpar {
	public static void main(String[] arg){
		System.out.println("Ingresa un número entero por consola");
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();
			
		if((num2 % 2) != 0) {
			System.out.println("El número " + num2 + " es impar");
		}else {
			System.out.println("El número " + num2 + " es par");
		}	
	}

}
