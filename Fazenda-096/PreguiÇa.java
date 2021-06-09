package generation;

public class PreguiÇa extends AnimaL {
    private String dormindo;
    private String comendo;
    private String nadando;
    public PreguiÇa(String nome,int idade,String dormindo,String comendo,String nadando)
    {
    super(nome,idade);
    this.dormindo = dormindo;
    this.comendo = comendo;
    this.nadando = nadando;
    }
    public String getDormindo() {
        return dormindo;
    }
    public void setDormindo(String dormindo) {
        this.dormindo = dormindo;
    }
    public String getComendo() {
        return comendo;
    }
    public void setComendo(String comendo) {
        this.comendo = comendo;
    }
    public String getNadando() {
        return nadando;
    }
    public void setNadando(String nadando) {
        this.nadando = nadando;
    }
    public void imprimirInfo() {
    System.out.println("Nome do Animal:"+getNome()+"\nIdade:"+getIdade()+" anos "+"\nO animal está dormindo: "+getDormindo()+"\nO animal está comendo: "+getComendo()+"\nO animal está nadando :"+getNadando());
    
    }    
}
