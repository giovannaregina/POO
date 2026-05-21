package ads.poo;

public class Arqueiro extends Personagem{

    private int vida;
    private int atk;
    private double vel;

    public Arqueiro(int vida, int atk, double vel) {
        this.vida = vida;
        this.atk = atk;
        this.vel = vel;
    }

    public String atacarComArco(){
        atk = 2;
        return "Arqueiro solta uma flecha";
    }

    public String movimentarEsquerda(){
        vel = 1;
        return "Movimentando para esquerda.";
    }

    public String pularMédio(){
        return "Pulo médio realizado.";
    }
}
