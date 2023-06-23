import java.util.Random;

public class Ruleta{
	public static void main(String[] args){
		//Random r =new Random();
		int [] numeros = new int [10];

		for(int i=0; i< numeros.length; i++){
			numeros[i] = (int)(Math.random()*100);
			System.out.println("El elemento" + (i+1) + "es :" + numeros[i]);
		}
		


		//System.out.println ("Tu arreglo aleatorio es: " + numeros);


	}
}