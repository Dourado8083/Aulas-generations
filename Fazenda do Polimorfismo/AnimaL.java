package generation;

public abstract class AnimaL {
    private  String tipoAnimaL;
    abstract public void Nome(String nomeAnimal);
    abstract public void Som(String somAnimal);
    abstract public void Idade(int idadeAnimal);
    public AnimaL(String tipoAnimaL) {
    this.tipoAnimaL	= tipoAnimaL;
    }
    public String getipoAnimaL() {
    return tipoAnimaL;	
    }
    public void setgetipoAnimaL(String tipoAnimaL) {
    this.tipoAnimaL = tipoAnimaL;
    }    
}
