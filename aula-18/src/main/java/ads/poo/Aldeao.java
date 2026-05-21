package ads.poo;

public class Aldeao extends Personagem {

    private int vida;
    private int atk;
    private double vel;


    public Aldeao(int vida, int atk, double vel) {
        this.vida = vida;
        this.atk = atk;
        this.vel = vel;
    }

    public String atacarComSoco(){
        atk = 1;
        return "Aldeao da um soco.";
    }

    public String movimentarFrente(){
        vel = 0.8;
        return "Movimentando para frente.";
    }

    public String pularBaixo(){
        return "Pulo baixo realizado.";
    }

}
