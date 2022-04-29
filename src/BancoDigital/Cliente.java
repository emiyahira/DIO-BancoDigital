package BancoDigital;

public class Cliente {

    private String codigo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Cliente setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }
}
