package POO;

public class Paciente {
    private String nome;
    private String Alergia;
    private String Convenio;
    private int idade;
    public Paciente(String nome,String Alergia,String Convenio,int idade) {
    this.nome = nome;
    this.Alergia = Alergia;
    this.Convenio = Convenio;
    this.idade = idade;
    }
    public Paciente(String nome,int idade) {
    this.nome = nome;
    this.idade = idade;
    }
    public void imprimirinfo() {
    System.out.println("----------------Ficha Médica------------");
    System.out.println("Seu nome é " + nome);
    System.out.println("Você possui alguma alergia " + Alergia);
    System.out.println("Você possui algum convenio " + Convenio);
    System.out.println("A sua idade é "+idade);
    System.out.println("-----------------------------------------");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAlergia() {
        return Alergia;
    }
    public void setAlergia(String alergia) {
        Alergia = alergia;
    }
    public String getConvenio() {
        return Convenio;
    }
    public void setConvenio(String convenio) {
        Convenio = convenio;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }   
}
