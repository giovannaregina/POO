package ads.poo;

public class Personagem {

    private int vida;
    private int atk;
    private double vel;


    public Personagem(int vida, int atk, double vel) {
        this.vida = vida;
        this.atk = atk;
        this.vel = vel;
    }

    public String atacar(){
        return "Ataque realizado.";
    }

    public String movimentar(){

        return "Movimento realizado.";
    }

    public String pular(){
        return "Pulo realizado";
    }


}
