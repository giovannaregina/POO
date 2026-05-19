package ads.poo;

public class Aldeao {

    private int vida;
    private int atk;
    private double vel;


    public Aldeao(int vida, int atk, double vel) {
        this.vida = vida;
        this.atk = atk;
        this.vel = vel;
    }

    public boolean atacarComSoco(atk){
        atk = 1;
        return Boolean.parseBoolean("Aldeao da um soco.");
    }

    public boolean movimentarFrente(vel){
        vel = 0.8;
        return Boolean.parseBoolean("Movimentando para frente.");
    }

    public boolean pularBaixo(){
        return Boolean.parseBoolean("Pulo baixo realizado.");
    }

}
