public class User {

    private String nome;
    private String email;
    private int senha;
    private int id;

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getSenha() {
        return this.senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
