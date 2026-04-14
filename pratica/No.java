package pratica;

public class No {

    private Usuario usuario;
    private No prox;

    public No(Usuario usuario, No prox) {
        this.usuario = usuario;
        this.prox = prox;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
