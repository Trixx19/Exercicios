public class Cliente{
    private String cpf;
    private String telefone;

    public Cliente(String cpfNovo, String telefoneNovo){
        this.cpf = cpfNovo;
        this.telefone = telefoneNovo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

}