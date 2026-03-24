package ads.poo;

public class Ponto {

    //atributos
    private int X;
    private int Y;




    //métodos

    public Ponto(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "(" + X + "," + Y + ")";
    }

    public double calculoDistancia(Ponto p){
        double distancia = Math.sqrt(Math.pow(p.X-this.X,2) + Math.pow(p.Y-this.Y,2));
        return distancia;
    }



}
