package ads.poo;

public class Caneta {

    private String cor; // ""
    private double nivelTinta; // 0.0
    private boolean aberta;  //false


    public String desenhar(int x1, int y1, int x2, int y2){
        double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        if(nivelTinta >= 0.0){
            return String.format("Nível de tinta insuficiente.");
        }
        nivelTinta-=distancia*0.01;
            if(aberta = false){
                return String.format("A caneta está fechada.");
            }
        return String.format("Desenhei %.2f cm na cor %s", distancia, cor);

        //calcular a distancia
        //debitar do nivel de tinta
        //retornar a distancia percorrida
        //ex: desenhei 1cm na cor azul
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String c) {
        cor = c;
    }

    public void setNivelTinta(double d){
        nivelTinta = d;
    }

    public void abrirTampa() {
        aberta = true;
    }

    public void fecharTampa() {
        aberta = false;
    }
}