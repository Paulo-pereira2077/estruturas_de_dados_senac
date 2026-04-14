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

    public void exibir(){
        No e = inicio;

        while(e != null){
            System.out.println(e.getUsuario());
            e = e.getProx();
        }
    }

    public Usuario pesquisar(int id){
        No e = inicio;
        while(e != null){
            if (e.getUsuario().getId() == id){
                return e.getUsuario();
            }
            e = e.getProx();
        }

        return null;
    }

    public boolean atualizar(int id, Float peso, Integer idade, String nome){
        Usuario u = pesquisar(id);

        if (u != null){

            if(peso != null){
                u.setPeso(peso);
            }

            if(idade != null){
                u.setIdade(idade);
            }

            if(nome != null){
                u.setNome(nome);
            }

            return true;
        }

        return false;
    }

    public boolean remover(int id){
        No remove = inicio, anterior = inicio;
        while(remove != null){
            if(id == remove.getUsuario().getId()){
                break;
            }
            anterior = remove;
            remove = remove.getProx();
        }

        if(remove != null){

            if (remove == inicio){ //1 caso
                inicio = remove.getProx();
                remove.setProx(null);
            }
            else if(remove == atual){ // 2 caso
                atual = anterior;
                aux = anterior;
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
        if (inicio == null){
            return false;
        }

        inicio = null;
        aux = null;
        atual = null;

        return true;
    }

    public boolean atualizarBonusSalario(float salario){
        if(inicio == null){
            return false;
        }

        No e = inicio;

        while(e != null){
            Usuario user = e.getUsuario();

            float novoSalario = user.getSalario() * (1 + salario / 100);
            user.setSalario(novoSalario);
            e = e.getProx();
        }

        return true;
    }
}
