package POO;

public class ProdutoEletronico {
    private String marca;
    private String modelo;
    private int memoria;
    private int anoFabrica;
    public ProdutoEletronico(String marca,String modelo,int memoria,int anoFabrica) {
    this.marca = marca;
    this.modelo = modelo;
    this.memoria = memoria;
    this.anoFabrica = anoFabrica;
    }
    public ProdutoEletronico(String marca,String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    }
    public void imprimirinfo() {
    System.out.println("A marca do celular é " + marca);
    System.out.println("O modelo é : "+ modelo);
    System.out.println("O celular possui de memoria " + memoria +" ram ");
    System.out.println("O ano que foi fabricado:  "+ anoFabrica);
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public int getAnoFabrica() {
        return anoFabrica;
    }
    public void setAnoFabrica(int anoFabrica) {
        this.anoFabrica = anoFabrica;
    }   
}
