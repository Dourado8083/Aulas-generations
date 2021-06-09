package generation;

public class CachorrO extends AnimaL {
private String cor;
private String raça;
private String tamanho;
public CachorrO(String nome,int idade,String cor,String raça,String tamanho) {
super(nome,idade);
this.cor = cor;
this.raça = raça;
this.tamanho = tamanho;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getRaça() {
	return raça;
}
public void setRaça(String raça) {
	this.raça = raça;
}
public String getTamanho() {
	return tamanho;
}
public void setTamanho(String tamanho) {
	this.tamanho = tamanho;
}
public void imprimirInfo()
{
System.out.println("Nome do Animal: "+getNome()+"\nIdade:"+getIdade()+" anos "+"\nCor: "+getCor()+"\nRaça: "+getRaça()+"\nTamanho:"+getTamanho());	
}
}
