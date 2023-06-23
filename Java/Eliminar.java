/**
 * Importamos los paquetes necesarios.
 */
import java.util.Scanner;

/**
 * Clase Eliminar.
 * Elimina un elemento del arreglo.
 * @author Miriam Torres Bucio.
 */
public class Eliminar{
    /**
     * Método estático arregloInicial.
     * Imprime el arreglo original.
     */
    private static void arregloInicial(int n[]){
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i] + " , ");
        }
        System.out.print("\n");
    }

    /**
     * Método main.
     */
    public static void main(String[] args) {
        /**
         * Inicializamos el arreglo.
         */
        int[] numeros = {5,19,34,4,2,456,1,87,95,6,5};

        System.out.println("Este es el arreglo inicial: ");
        /**
         * Usamos nuestro método para imprimir el arreglo.
         */
        arregloInicial(numeros);
        
        /**
         * Leemos por consola el número que se desea eliminar.
         */
        Scanner elimina = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres borrar: ");
        int num = elimina.nextInt();
        
        /**
         * Eliminamos las ocurrencias.
         * Eliminamos si los números están repetidos.
         */ 
        int ocurrencias = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == num){
                ocurrencias++;
                for (int j = i; j <numeros.length-1; j++){
                    numeros[j] = numeros[j+1];
                }
            }
        }

        /**
         * Números finales del arreglo.
         */
        int[] numerosFinal;
        int longitud = numeros.length-ocurrencias;
        numerosFinal = new int[longitud];
        for (int i = 0; i < longitud; i++){
            numerosFinal[i] = numeros[i];
        }
        System.out.print("Arreglo final: \n");
        /**
         * Imprimimos el arreglo final.
         */
        arregloInicial(numerosFinal);
    }

}