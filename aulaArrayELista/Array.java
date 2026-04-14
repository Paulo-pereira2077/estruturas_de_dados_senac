package aulaArrayELista;

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

    // Exercício 1 b)
    public Pet buscaBinaria(int id, int inicio, int fim) {
        if (inicio > fim) {
            return null;
        }

        int meio = inicio + (fim - inicio) / 2;

        if (lista[meio].getId() == id) {
            return lista[meio];
        }

        if (id < lista[meio].getId()) {
            return buscaBinaria(id, inicio, meio - 1);
        } else {
            return buscaBinaria(id, meio + 1, fim);
        }
    }

    // Exercício 1 c)
    public void ordenarPorNome() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - 1 - i; j++) {
                if (lista[j].getNome().compareToIgnoreCase(lista[j+1].getNome()) > 0) {
                    Pet temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }
        }
    }

    // Método auxiliar para facilitar a chamada da Main
    public int getContador() {
        return contador;
    }

}