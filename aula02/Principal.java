package aula02;

public class Principal {

    public static void main(String[] args) {
        Array array = new Array();

        Pet pet1 = new Pet("Mel", "SRD", 13.1F, 2);
        Pet pet2 = new Pet("Gaia", "SRD", 15.2F, 3);
        Pet pet3=new Pet("SRD","Julie",15, 4);
        Pet pet4 = new Pet("Mel", "SRD", 13.1F, 10);


        //Chamadas dos métodos
        array.inserir(pet1);
        array.inserir(pet2);
        array.inserir(pet3);
        array.inserir(pet4);


        array.exibir();

        System.out.println("========== Remover ==========");

        if (array.remover(1)){
            System.out.println("Removido com sucesso!");
        }
        else {
            System.out.println("Não foi Removido!");
        }


        if (array.atualizar(0,3)){
            System.out.println("Idade atualizada com sucesso!");
        }
        else {
            System.out.println("Não foi atualizado!");
        }

    }
}
