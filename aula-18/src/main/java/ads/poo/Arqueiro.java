package ads.poo;

public class Arqueiro {

    private int vida;
    private int atk;
    private double vel;

    public Arqueiro(int vida, int atk, double vel) {
        this.vida = vida;
        this.atk = atk;
        this.vel = vel;
    }

    public boolean atacarComArco(atk){
        atk = 2;
        return Boolean.parseBoolean("Arqueiro solta uma flecha com arco.");
    }

    public boolean movimentarEsquerda(vel){
        vel = 1;
        return Boolean.parseBoolean("Movimentando para esquerda.");
    }

    public boolean pularMedio(){
        return Boolean.parseBoolean("Pulo médio realizado.");
    }

}
