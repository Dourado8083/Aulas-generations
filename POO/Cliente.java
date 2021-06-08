package POO;

public class Cliente {
    private String nomeCliente;
    private int idade;
    private int cpf;
    private int rg;
    public Cliente( String nomeCliente,int idade, int cpf, int rg){
    this.nomeCliente = nomeCliente;
    this.idade = idade;
    this.cpf = cpf;
    this.rg = rg;
    }
    public Cliente(String nomeCliente,int idade) {
    this.nomeCliente = nomeCliente;
    this.idade = idade;
    }
    public void imprimirinfo() {
    System.out.println(nomeCliente+" possui "+ idade +" anos "+ "com o rg  "+rg+" e o cpf "+cpf+".");
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }
        
}
