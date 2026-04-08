package aula03;

public class No {
    private Pet pet;
    private No prox;

    public No(Pet pet, No prox) {
        this.pet = pet;
        this.prox = prox;
    }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }
    public No getProx() { return prox; }
    public void setProx(No prox) { this.prox = prox; }
}