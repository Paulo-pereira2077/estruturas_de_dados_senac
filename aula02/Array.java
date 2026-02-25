package aula02;

//Classe Array
public class Array {
    private Pet[] lista=new Pet[3];
    private int contador=0;

    /**
     * Insere um objeto do tipo Pet no array lista.
     *
     * @param pet objeto do tipo Pet que será inserido no array
     */


    public void inserir(Pet pet){

        lista[contador++]=pet;
    }

    //Exibe todos os cadastros armazenados em lista.

    public void exibir(){
        for (int i = 0;i < contador; i++){
            System.out.println(lista[i]);
        }
    }
}
