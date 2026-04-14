package pratica;

public class Lista {

    private No prox, aux, atual, inicio;

    public void inserir(Usuario usuario){

        if (inicio == null){
            inicio = new No(usuario, null);
            aux = inicio;
        }
        else{
            atual = new No(usuario, null);
            aux.setProx(atual);
            aux = atual;
        }
    }


//    public void exibir()
//
//    public Produto pesquisar(int id)
//
//    public boolean atualizar(int id, float preco)
//
//    public boolean remover(int id)
//
//    public boolean removerLista()
//
//    public boolean atualizarLista(float p)


}
