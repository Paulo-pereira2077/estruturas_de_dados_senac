// Elabore um algortimo que armazene números inteiros e aleatórios em um array

package ListaNumeros;
import java.util.Random;

public class principalListaNumeros {

    public static void main(String[] args) {
        
        int[] lista= new int[10];    

        inserir(lista);
        exibir(lista);
    }

    public static void inserir(int[] v){
        Random rd= new Random();

        for(int i = 0; i < v.length;i++){
            v[i]=rd.nextInt(11);            
            
        }
    }

    public static void exibir(int[] a){
        for(int i = 0; i < a.length;i++){
            System.out.println("Lista["+i+"]=" + a[i]);   
                    }
    }
}