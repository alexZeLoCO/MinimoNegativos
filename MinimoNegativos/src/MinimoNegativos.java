import java.util.Scanner;		//IMPORTAR SCANNER
public class MinimoNegativos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		double n=-1;		//INICIALIZAR VARIABLE
		double min = 1;		//INICIALIZAR MIN
		do {		//BUCLE DO
			n = teclado.nextDouble();		//ALMACENAR VALOR
			if (n<min) {		//SI ES MENOR AL MÍNIMO
				min=n;		//ACTUALIZAR MÍNIMO
			} 
		}while (n<0);		//MIENTRAS N SEA MENOR QUE 0 
		System.out.printf("El menor valor es %f.", min);		//OUTPUT

	}

}
