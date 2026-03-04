package aula02;

/*
 *  Professor Gerson Risso
 */
public class Array {

    private Pet[] lista = new Pet[3];
    private int contador = 0;

    // questão 1 -
    public void inserir(Pet pet) {
        if (contador == lista.length) {
            lista=alocarNovoArray();
        }

        lista[contador++] = pet;
    }

    public void exibir() {
        for (int i = 0; i < contador; i++) {
            System.out.println(lista[i]);
        }
    }

    private Pet[] alocarNovoArray() {
        Pet[] novo = new Pet[lista.length + 3];
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }

    //questão 3 -
    public int pesquisar(int id){

        for (int i = 0; i < lista.length; i++) {

            if(lista[i] != null){
                if (lista[i].getId() == id) {
                    return i;
                }
            }
        }
        return -1;

    }

}

