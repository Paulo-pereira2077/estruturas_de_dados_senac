package pratica;

public class Principal {

    public static void main (String[]args){

        Lista l = new Lista();

        l.inserir(new Usuario("Paulo", 68.0f, 19, 200));
        l.inserir(new Usuario("Gustavo", 88.5f, 20, 5000));
        l.inserir(new Usuario("Guilherme", 80.0f, 19, 9000));

        System.out.println("\n Lista");
        l.exibir();

        System.out.println("\n Testando metodo pesquisar");
        Usuario encontrado = l.pesquisar(2);
        if (encontrado != null){
            System.out.println("Usuário encontrado: " + encontrado.getNome() + ", Id: " + encontrado.getId() + ", Salario: " + encontrado.getSalario());
        }
        else{
            System.out.println("Usuário não encontrado.");
        }

        System.out.println("\n Testando metodo atualizar");
        l.atualizar(2, 90f, null, "Gustavo Lopes Francisco");

        l.exibir();

        System.out.println("\n Testando metodo remover");
        l.remover(3);

//        System.out.println("\n Testando metodo remover lista");
//        l.removerLista();
        l.exibir();

        l.inserir(new Usuario("Guilherme", 80.0f, 19, 9000));


        System.out.println("\n Testando metodo atualizar bonus salario");

        boolean atualizouLista = l.atualizarBonusSalario(10f);

        if(atualizouLista){
            System.out.println("\n Salários atualizados com sucesso!");
            l.exibir();
        }
        else {
            System.out.println("Lista vazia, nada para atualizar.");
        }

        System.out.println("\n--- Lista Após Atualização ---");
        l.exibir();
    }
}
