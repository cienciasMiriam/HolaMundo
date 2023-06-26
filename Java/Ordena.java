public class Ordena{

	public static void imprime(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}

	public static void ordena(int[] a){
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-i-1; j++){
				if(a[j] > a[j + 1]){
				//if(a[i] > a[j+1]){
					int k = a[j];
					a[j] = a[j+1];
					a[j+1] = k;
				}
			}
		}
	}

	public static void main(String[] hola){
		int [] a = {12, 5, 3, 1, 0};
		System.out.println("Tu arreglo es:");
		ordena o = new ordena();
		o.imprime(a);
		System.out.println("Tu arreglo ordenado es:");
		o.ordena(a);
		o.imprime(a);
	}

}
