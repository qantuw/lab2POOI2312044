package ejercicios;

import java.util.Scanner;

public class EjercicioD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		   System.out.print("Ingrese un año: ");
	        if (scanner.hasNextInt()) {
	            int year = scanner.nextInt();
	            int remainder = year % 12;

	            String animal = "";

	            switch (remainder) {
	                case 0:
	                    animal = "monkey";
	                    break;
	                case 1:
	                    animal = "gallo";
	                    break;
	                case 2:
	                    animal = "Perro";
	                    break;
	                case 3:
	                    animal = "cerdo";
	                    break;
	                case 4:
	                    animal = "rata";
	                    break;
	                case 5:
	                    animal = "buey";
	                    break;
	                case 6:
	                    animal = "tigre";
	                    break;
	                case 7:
	                    animal = "conejo";
	                    break;
	                case 8:
	                    animal = "dragón";
	                    break;
	                case 9:
	                    animal = "serpiente";
	                    break;
	                case 10:
	                    animal = "caballo";
	                    break;
	                case 11:
	                    animal = "cabra";
	                    break;
	                default:
	                    System.out.println("Año no válido.");
	                    return;
	            }

	            System.out.println(year + " es el año del " + animal + ".");
	        } else {
	            System.out.println("Debe ingresar un número entero como año.");
	        }

	        scanner.close();
	    }
	}