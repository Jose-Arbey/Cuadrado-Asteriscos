import java.util.Scanner;

public class Cuadrado {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe el numero de asteriscos por lado: ");
		int num_asteriscos = entrada.nextInt();

		int espacio = 0;

		for(int a = 1; a <= num_asteriscos; a++){
			if(a == 1 || a == num_asteriscos){
				for(int b = 1; b <= num_asteriscos; b++){
					System.out.print("* ");
				}
				System.out.println();
			} else {
				for(int c = 1; c <= num_asteriscos; c++){
					if(c == 1 || c == num_asteriscos){
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	}
}