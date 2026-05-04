package Aula_ED_Lista_Simplesmente_Ligada.src.lista;

import Aula_ED_Lista_Simplesmente_Ligada.src.lista.No;
import Aula_ED_Lista_Simplesmente_Ligada.src.modelo.Produto;

public class Lista {

    private No inicio, auxiliar, atual;

    /**
     * Insere nó no final da lista simplesmente ligada
     * @param produto Produto
     */

    public void inserir(Produto produto){
        // Quando a lista estiver vazia

        if(inicio == null){
            inicio = new No(produto, null);
            auxiliar = inicio;
        }
        else {
        // Quando a lista não estiver vazia
            atual = new No(produto, null);
            auxiliar.setProx(atual);
            auxiliar = atual;
        }
    }


    /**
     *
     */

    public void exibir(){
       No e = inicio;
        while(e != null){
            System.out.println(e.getProduto());
            e = e.getProx();
        }

    }

    /**
     * Método para realizar a pesquisa na lista pelo ID
     * @param id Produto
     */
    public Produto pesquisar(int id) {
        No e = inicio;
        while (e != null) {
            if (e.getProduto().getId() == id) {
                return e.getProduto();
            }
            e = e.getProx();
        }
        return null; // Retorna null caso não encontre o ID
    }

    /**
     * Método para atualizar o preço de produto pelo id
     * @param id Produto
     */
    public boolean atualizar(int id, float preco) {
        Produto p = pesquisar(id);

        if (p != null) {
            p.setPreco(preco);
            return true;
        }
        return false;
    }

    public boolean remover(int id){
        //Pesquisar

        No remove = inicio, anterior = inicio;
            while(remove != null){
                if(id == remove.getProduto().getId()){
                    break;
                }
                anterior = remove;
                remove = remove.getProx();
            }
            if (remove != null){
                //Remover um nó da lista

                if(remove == inicio){//1º caso
                    inicio = remove.getProx();
                    remove.setProx(null);
                }
                else if(remove == atual){//2º caso
                    atual = anterior;
                    auxiliar = anterior;
                    anterior.setProx(null);
                }
                else{
                    anterior.setProx(remove.getProx());
                    remove.setProx(null);
                }

                return true;
            }
            return false;
    }

    public boolean removerLista(){
        if(inicio == null){
            return false;
        }

        inicio = null;
        auxiliar = null;
        atual = null;

        return true;
    }

    public boolean atualizarLista(float p){
        if(inicio == null){
            return false;
        }

        No e = inicio;

        while(e != null){
            Produto prod = e.getProduto();


            float novoPreco = prod.getPreco() * (1 + p / 100);

            prod.setPreco(novoPreco);

            e = e.getProx();
        }

        return true;
    }

}
