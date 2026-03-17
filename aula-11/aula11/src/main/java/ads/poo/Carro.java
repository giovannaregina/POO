package ads.poo;

public class Carro {

    // atributos

    private int velocidadeAtual;
    private String modelo;
    private int velocidadeMáxima;

    private static final int VEL_MAX_MODELOS = 300;
    private static final int VEL_MINIMA = 0;


    // métodos


    public Carro(String modelo, int velocidadeMáxima) {
        this.modelo = modelo;
        this.velocidadeMáxima = velocidadeMáxima;
        this.velocidadeAtual = 0;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeMáxima = VEL_MAX_MODELOS;
    }

    public String getModelo() {
        return modelo;
    }

    public void acelerar(int i){
        velocidadeAtual = (velocidadeAtual + i < velocidadeMáxima) ? velocidadeAtual + i : velocidadeMáxima;

    }

    public void freiar(int d){
        velocidadeAtual = (velocidadeAtual - d > 0) ? velocidadeAtual - d : 0;
    }


    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

}
