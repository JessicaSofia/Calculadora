package spring.ejercicio01.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import spring.ejercicio01.servicio.OperacionesImpl;

public class Cliente01 {

	public static void main(String[] args) throws IOException {
		OperacionesImpl op = new OperacionesImpl();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Ingrese el núemro 1: ");
		int n1 = Integer.parseInt(br.readLine());

		System.out.println("Ingrese el núemro 2: ");
		int n2 = Integer.parseInt(br.readLine());
		
		System.out.println("Seleccione la operación a realizar:\n 1 suma \n 2 resta \n 3 multiplicación \n 4 división \n Precione cualquier otro número para salir...");
		int o = Integer.parseInt(br.readLine());
		
		switch (o) {
		
		case 1:
			int s = op.sumar(n1, n2);
			System.out.println(String.format("La suma entre %d y %d es: ",n1,n2) + s);
			break;
			
		case 2:
			int r = op.restar(n1, n2);
			System.out.println(String.format("La resta entre %d y %d es: ",n1,n2) + r);
			break;
			
		case 3:
			int m = op.multiplicar(n1, n2);
			System.out.println(String.format("La multiplicación entre %d y %d es: ",n1,n2) + m);
			break;
			
		case 4:
			float d = op.dividir(n1, n2);
			System.out.println(String.format("La resta entre %f y %f es: ",n1,n2) + d);
			break;
			
		default:
			break;
		}
		
		// int s = op.sumar(4, 7);
		// int r = op.restar(9, 3);
//		System.out.println("La respuesta de la suma: " + s);
//		System.out.println("La respuesta de la resta: " + r);

	}

}
