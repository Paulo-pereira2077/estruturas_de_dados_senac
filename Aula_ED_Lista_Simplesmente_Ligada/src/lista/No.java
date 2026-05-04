package Aula_ED_Lista_Simplesmente_Ligada.src.lista;

import Aula_ED_Lista_Simplesmente_Ligada.src.modelo.Produto;

public class No {
    private Produto produto;
    private No prox;

    public No(Produto produto, No prox) {
        this.produto = produto;
        this.prox = prox;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
