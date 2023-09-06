package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Ejercicio(a)
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero a evaluar: ");//el numero que sera evaluado
        try{
            long x=sc.nextLong();
            System.out.println(x+"puede ser almacenado en: ");
            if(x>=Byte.MIN_VALUE && x <=Byte.MAX_VALUE ){
                System.out.println("byte");
                }
            if(x>=Short.MIN_VALUE && x <=Short.MAX_VALUE ){
                System.out.println("short");
                }
            if(x>=Integer.MIN_VALUE && x <=Integer.MAX_VALUE ){
                System.out.println("int");
                }

            //Ingrese aqui la logica para determinar si el numero capturado por el teclado soportado por
            //os tipos de datos byte ,short int y long 
          }
          catch(Exception e)
          {
            System.out.println(sc.next()+"no puede ser almacenado en ningun lado");
            }

    }
    
}