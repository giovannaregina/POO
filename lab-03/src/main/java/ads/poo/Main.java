package ads.poo;


public class Main {
    static void main(String[] args) {

    Ponto a = new Ponto(1, 2);
    Ponto b = new Ponto (3, 4);

    double distancia = a.calculoDistancia(b);

    IO.println(a.calculoDistancia(b));




    }
}
