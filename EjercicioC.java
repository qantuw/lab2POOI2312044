package ejercicios;
import java.util.Scanner;

public class EjercicioC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        
	        // Entrada del salario anual actual y la calificación de desempeño
	        System.out.print("Ingrese el salario anual actual del empleado: ");
	        double currentSalary = sc.nextDouble();
	        
	        System.out.print("Ingrese la calificación de desempeño (1=excelente, 2=bueno, 3=malo): ");
	        int calificacionDesempeno = sc.nextInt();
	        
	        // Declarar variables para el aumento (raise) y el "ratting" (nuevo salario)
	        double raise = 0.0;
	        double ratting = 0.0;
	        
	        // Calcular el aumento según la calificación de desempeño
	        if (calificacionDesempeno == 1) {
	            raise = currentSalary * 0.06;
	        } else if (calificacionDesempeno == 2) {
	            raise = currentSalary * 0.04;
	        } else if (calificacionDesempeno == 3) {
	            raise = currentSalary * 0.015;
	        } else {
	            System.out.println("Calificación de desempeño no válida.");
	            System.exit(1);
	        }
	        
	        // Calcular el nuevo salario (ratting)
	        ratting = currentSalary + raise;
	        
	        // Mostrar el resultado
	        System.out.println("Aumento: $" + raise);
	        System.out.println("El nuevo salario del empleado (Ratting) es: $" + ratting);
	        
	        sc.close();
	    
	
	}

}
