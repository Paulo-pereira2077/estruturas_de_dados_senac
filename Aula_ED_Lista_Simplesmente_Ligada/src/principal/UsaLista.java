package Aula_ED_Lista_Simplesmente_Ligada.src.principal;

import Aula_ED_Lista_Simplesmente_Ligada.src.lista.Lista;
import Aula_ED_Lista_Simplesmente_Ligada.src.modelo.Produto;

public class UsaLista {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(new Produto("Café", 25.34f));
        lista.inserir(new Produto("Azeite", 38.67f));
        lista.inserir(new Produto("Arroz", 25.78f));
        lista.inserir(new Produto("Celular", 1234.56f));

        System.out.println("--- Lista Original ---");
        lista.exibir();

        // metodo pesquisar
        System.out.println("\n--- Testando Pesquisa (ID: 2) ---");
        Produto busco = lista.pesquisar(2);
        if (busco != null) {
            System.out.println("Encontrado: " + busco.getNome());
        } else {
            System.out.println("Produto não encontrado.");
        }

        //metodo exibir
        System.out.println("\n--- Testando Atualização de Preço (ID: 2 para 45) ---");
        boolean atualizou = lista.atualizar(2, 45f);
        if (atualizou) {
            System.out.println("Preço atualizado com sucesso!");
        } else {
            System.out.println("Falha ao atualizar: ID inexistente.");
        }

        System.out.println("\n--- Lista Após Atualização ---");
        lista.exibir();

        System.out.println("\n === Remoção ===");
        if(lista.remover(22)){
            lista.exibir();
        }
        else{
            System.out.println("Não achou o id pesquisado");
        }

//        // Exercício 1 - Remover lista inteira

//        System.out.println("\n--- Removendo toda a lista ---");
//        boolean removeuLista = lista.removerLista();
//
//        if(removeuLista){
//            System.out.println("Lista apagada com sucesso!");
//        }
//        else {
//            System.out.println("Lista já estava vazia.");
//        }
//
//        System.out.println("\n--- Tentando exibir lista após remoção ---");
//        lista.exibir();

        // Exercício 2 - Atualizar lista inteira (porcentagem)

        System.out.println("\n--- Atualizando TODOS os preços em 10% ---");
        boolean atualizouLista = lista.atualizarLista(10f);

        if(atualizouLista){
            System.out.println("\n Preços atualizados com sucesso!");
            lista.exibir();
        }
        else {
            System.out.println("Lista vazia, nada para atualizar.");
        }

        System.out.println("\n--- Lista Após Atualização ---");
        lista.exibir();
    }
}
