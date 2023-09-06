package ejercicios;

public class EjercicioD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (args.length != 1) {
	            System.out.println("ingrese un año :");
	            return;
	        }

	        try {
	            int year = Integer.parseInt(args[0]);

	            switch (year % 12) {
	                case 0:
	                    System.out.println(year + " es el año del monkey.");
	                    break;
	                case 1:
	                    System.out.println(year + " es el año del Gallo.");
	                    break;
	                case 2:
	                    System.out.println(year + " es el año del Perro.");
	                    break;
	                case 3:
	                    System.out.println(year + " es el año del Cerdo.");
	                    break;
	                case 4:
	                    System.out.println(year + " es el año de la Rata.");
	                    break;
	                case 5:
	                    System.out.println(year + " es el año del Buey.");
	                    break;
	                case 6:
	                    System.out.println(year + " es el año del Tigre.");
	                    break;
	                case 7:
	                    System.out.println(year + " es el año del Conejo.");
	                    break;
	                case 8:
	                    System.out.println(year + " es el año del Dragón.");
	                    break;
	                case 9:
	                    System.out.println(year + " es el año de la Serpiente.");
	                    break;
	                case 10:
	                    System.out.println(year + " es el año del Caballo.");
	                    break;
	                case 11:
	                    System.out.println(year + " es el año de la Oveja.");
	                    break;
	                default:
	                    System.out.println("Año no válido.");
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("ingrese un año válido :");
	        }
	}

}
