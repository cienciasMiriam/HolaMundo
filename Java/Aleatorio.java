/**
 * Importamos el paquete correspondiente.
 */
import java.util.Random;
/**
 * Clase Aleatorio.
 * Nos imprime un arreglo de 7 elementos con valores aleatorios.
 * @author Miriam Torres Bucio.
 */
public class Aleatorio{
	/**
	 * Método main.
	 */
	public static void main(String[] args){
		int[] aleatorio = new int[7];
		for(int i=0; i<7; i++){
			aleatorio[i] = (int)(Math.random()*100);
			System.out.println("[" + (i+1) + "] = " + aleatorio[i]);
		}
		System.out.println();
	}
}