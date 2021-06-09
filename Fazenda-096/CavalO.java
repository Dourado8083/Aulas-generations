package generation;

public class CavalO extends AnimaL {
    private String Ferradura;
    private String Pasto;
    private String raro;
    public CavalO(String nome,int idade,String Ferradura,String Pasto,String raro)
    {
    super(nome,idade);
    this.Ferradura = Ferradura;
    this.Pasto = Pasto;
    this.raro = raro;
    }
    public String getFerradura() {
        return Ferradura;
    }
    public void setFerradura(String ferradura) {
        Ferradura = ferradura;
    }
    public String getPasto() {
        return Pasto;
    }
    public void setPasto(String pasto) {
        Pasto = pasto;
    }
    public String getRaro() {
        return raro;
    }
    public void setRaro(String raro) {
        this.raro = raro;
    }
    public void imprimirInfo() 
    {
    System.out.println("Nome do Animal: "+getNome()+"\nIdade:"+getIdade()+" anos "+"\nO animal está de ferradura: "+getFerradura()+"\n O animal está no pasto:"+getPasto()+"\nO animal é raro:"+getRaro());
    }   
}
