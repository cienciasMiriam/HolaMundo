/**
 * Clase BubbleSort.
 * Ordena un arreglo de números de forma ascendente.
 * @author Miriam Torres Bucio.
 */
public class BubbleSort {
    /**
     * Método que ordena el arreglo.
     * Usamos el algoritmo BubbleSort.
     */
    public static void bubbleSort(int a[]){
        int n = a.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }
                
    }
  
    /**
     * Método que imprime el arreglo.
     */
    public static void printArray(int a[]){
        int n = a.length;
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
  
    /**
     * Método main.
     * Usamos los métodos anteriores para ordenar un arreglo dado.
     */
    public static void main(String args[])
    {
        BubbleSort ordena = new BubbleSort();
        int arreglo[] = { 5, 1, 4, 2, 8 };
        System.out.println("Arreglo inicial");
        ordena.printArray(arreglo);
        ordena.bubbleSort(arreglo);
        System.out.println("Sorted array");
        ordena.printArray(arreglo);
    }
}