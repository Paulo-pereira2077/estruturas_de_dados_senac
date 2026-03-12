package aula02;

public class Array {

    private Pet[] lista = new Pet[3];
    private int contador = 0;

    // questão 1 -
    public void inserir(Pet pet) {
        if (contador == lista.length) {
            lista = alocarNovoArray();
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


    /**
     * Pesquisa no array lista um id.
     *
     * @param id int
     * @return int
     */

    private int pesquisar(int id) {

        for (int i = 0; i < contador; i++) {
            if (id == lista[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Remove um elemento Pet do array pelo id.
     *
     * @return boolean
     */
    public boolean remover(int id) {
        int indice = pesquisar(id);

        if (indice >= 0) {
            //remover
            for (int i = indice; i < contador - 1; i++) {
                lista[i] = lista[i + 1];
            }
            contador--;

            return true;
        }
        return false;
    }

    // exercicio 2

    /**
     * Atualiza a idade conforme o id
     *
     * @param id
     * @param idade
     * @return int
     */
    public boolean atualizar(int id, int idade) {
        int indice = pesquisar(id);
            if (indice >= 0) {
                lista[indice].setIdade(idade);
                return true;
            }
        return false;
    }

}