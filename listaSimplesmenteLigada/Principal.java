package listaSimplesmenteLigada;

public class Principal {

    public static void main(String[] args) {
        Array array = new Array();

        Pet pet1 = new Pet("Mel", "SRD", 13.1F, 2);
        Pet pet2 = new Pet("Gaia", "SRD", 15.2F, 3);
        Pet pet3=new Pet("Julie", "SRD",15, 4);
        Pet pet4 = new Pet("Mel", "SRD", 13.1F, 10);


        //Chamadas dos métodos
        array.inserir(pet1);
        array.inserir(pet2);
        array.inserir(pet3);
        array.inserir(pet4);


        array.exibir();
//
//        System.out.println("========== Remover ==========");
//
//        if (array.remover(1)){
//            System.out.println("Removido com sucesso!");
//        }
//        else {
//            System.out.println("Não foi Removido!");
//        }

//        if (array.atualizar(0,3)){
//            System.out.println("Idade atualizada com sucesso!");
//            array.exibir();
//        }
//        else {
//            System.out.println("Não foi atualizado!");
//        }


        // Testando a busca Exercício 1 b)
        int idBuscado = 3;
        Pet encontrado = array.buscaBinaria(idBuscado, 0, array.getContador() - 1);

        if (encontrado != null) {
            System.out.println("\nPet encontrado: " + encontrado.getNome());
        } else {
            System.out.println("\nPet não encontrado.");
        }

        // Ordenar por nome e exibir Exercício 1 c)
        System.out.println("\nOrdenando por nome...");
        array.ordenarPorNome();
        array.exibir();
    }



}