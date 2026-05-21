package ads.poo;

public class Cavaleiro extends Personagem {
    private int vida;
    private int atk;
    private double vel;

    public Cavaleiro(int vida, int atk, double vel) {
        this.vida = vida;
        this.atk = atk;
        this.vel = vel;
    }

    public String atacarComEspada(){
        atk = 3;
        return "Cavaleiro da uma espadada.";
    }

    public String movimentarDireita(){
        vel = 2;
        return "Movimentando para direita.";
    }

    public String pularAlto(){
        return "Pulo alto realizado.";
    }

}
