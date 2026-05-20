package Aula_ED_Lista_Duplamente_Ligada.src;

public class Lista {

    private No inicio, ant, atual, aux;

    public boolean vazia(){
        return inicio == null;
    }

    public void adicionar(Produto produto){

        if(vazia()){
            inicio = new No(produto);
            aux = inicio;
        }
        else{
            atual = new No(produto);
            aux.setProx(atual);
            atual.setAnt(aux);
            aux = atual;
        }

    }

    public void exibir(){
        No cursor = atual;
        while(cursor != null){
            System.out.println(cursor.getProduto());
            cursor = cursor.getAnt();
        }
    }

    public No pesquisar(int id){
        No e = inicio;

        while(e != null){
            if(e.getProduto().getId() == id){
                return e;
            }
            e = e.getProx();
        }
        return null;
    }

    public boolean remover(int id){
        No e = pesquisar(id);
        if(e != null){
            if(id == e.getProduto().getId()){
                if(e == inicio){
                    inicio = e.getProx();
                }
                if(inicio != null){
                    inicio.setAnt(null);
                }
                else{
                    aux = null;
                }
                e.setProx(null);
            }
            else if(e == aux){
                aux = e.getAnt();
                aux.setProx(null);
                e.setAnt(null);
            }
            else{
                e.getAnt().setProx(e.getProx());
                e.getProx().setAnt(e.getAnt());
                e.setAnt(null);
                e.setProx(null);
            }
        }
        return true;
    }


}
