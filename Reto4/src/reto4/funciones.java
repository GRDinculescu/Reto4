package reto4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class funciones {
		public static boolean esInt(String texto) {
			try {
				int text = Integer.parseInt(texto);
				return true;
			}
			catch (Exception e) {return false;}
			
		}
		
		public static boolean esDouble(String texto) {
			try {
				double text = Double.parseDouble(texto);
				return true;
			}
			catch (Exception e) {return false;}
		}
		public static int dimeEntero(String texto,Scanner sc) {
		
			do {
			try {
				System.out.println(texto);
				String a = sc.nextLine();
				int numero = Integer.parseInt(a);
				return numero;
				
			}
			catch (Exception e) {System.out.println("Pon un numero");}
			}
			while(true);
				
		}
		public static double dimeDouble(String texto,Scanner sc) {
			do {
			try {
				System.out.println(texto);
				String a = sc.nextLine();
				double numdoble = Double.parseDouble(a);
				return numdoble;
			}
			
			catch (Exception e) {System.out.println("Pon un numero");}
			}
			while(true);
		}
		
		public static  LocalDate dimefecha(String texto) {
			Scanner sc=new Scanner(System.in);
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		do {
			
			try {
				//System.out.println("Introduce un dia del 1 al 31 ");
				int dia=funciones.dimeEntero("Introduce un dia del 1 al 31 ",sc);
				//System.out.println("Introduce un mes del 1 al 12 ");
				int mes =dimeEntero("Introduce un mes del 1 al 12 ",sc);
				//System.out.println("Introduce un año ej 2024 ");
				int año =dimeEntero("Introduce un año ej 2024 ",sc);
				
				LocalDate fecha = LocalDate.of(año,mes,dia);
				return fecha;


				
				
				
			}
					catch (Exception e) {
						System.out.println("Fecha incorrecta,prueba otra vez");
					}
		}
		while(true);
		
			}
		public static LocalDate dimefecha1 (String texto,Scanner sc) {
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			do {
				try {
					System.out.println(texto);
					String textoFecha=sc.nextLine();
					LocalDate fecha= LocalDate.parse(textoFecha,formato);
					return fecha;
					
				} catch (Exception e) {
					System.out.println("Formato incorrecto");
				}
			}
			while (true);

	}
	}


