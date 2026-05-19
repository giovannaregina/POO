package ads.poo;

public class Cavaleiro {
    private int vida;
    private int atk;
    private double vel;

    public Cavaleiro(int vida, int atk, double vel) {
        this.vida = vida;
        this.atk = atk;
        this.vel = vel;
    }

    public boolean atacarComEspada(atk){
        atk = 3;
        return Boolean.parseBoolean("Cavaleiro da uma espadada.");
    }

    public boolean movimentarDireita(vel){
        vel = 2;
        return Boolean.parseBoolean("Movimentando para esquerda.");
    }

    public boolean pularAlto(){
        return Boolean.parseBoolean("Pulo alto realizado.");
    }


}
