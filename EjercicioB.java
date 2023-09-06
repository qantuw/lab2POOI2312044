package ejercicios;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EjercicioB {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int N=scanner.nextInt();//N es un m numero entero a evaluar
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if (N % 2 != 0) {
	            System.out.println("Luna");
	        } else {
	            if (N >= 2 && N <= 5) {
	                System.out.println("Sol");
	            } else if (N >= 6 && N <= 20) {
	                System.out.println("Tierra");
	            } else {
	                System.out.println("Galaxia");
	            }
	        }

	        //ingrese aqui si un numero es par inpar utilizando if else
	        scanner.close();
	    }
	    
	}