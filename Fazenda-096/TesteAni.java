package generation;

public class TesteAni {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Bem-Vindo a Fazenda do Dourado");
        System.out.println("***********************************");
        CachorrO dog = new CachorrO("Dog",12,"Marron","Pitbull","Grande");
        dog.imprimirInfo();
        System.out.println("***********************************");
        CavalO hor = new CavalO("BOJACK",2,"não possui","sim,esta aqui perto 1km mais ou menos","sim,foi o cavalo do Beto Carreiro");
        hor.imprimirInfo();
        System.out.println("***********************************");
        PreguiÇa per = new PreguiÇa("cavs",8,"Não","Não","Sim");
        per.imprimirInfo();
        System.out.println("***********************************");
            }
        
        } 
}
