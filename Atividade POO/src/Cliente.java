public class Cliente {
    private String nome;
    private String email;
    private String telefone;

    static int totalClientes = 0;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        totalClientes++;
    }
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = "Não Informado";
        totalClientes++;
    }

    public Cliente(String nome) {
        this.nome = nome;
        this.email = "Não Informado";
        this.telefone = "Não Informado";
        totalClientes++;
    }

    public String getNome (){
        return nome;
    }
    public String getEmail (){
        return email;
    }
    public String getTelefone(){
        return telefone;
    }

    public void exibir(){
        System.out.println("Nome: " + getNome() + " Email: " + getEmail() + " Telefone: " + getTelefone());
    }

}
