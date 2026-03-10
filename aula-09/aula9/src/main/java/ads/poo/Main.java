package ads.poo;


public class Main {
    static void main(String[] args) {

            Caneta bic = new Caneta();

            bic.setCor("azul");
            bic.setNivelTinta(0.001);


            bic.abrirTampa();
            System.out.println(bic.desenhar(1,1,1,2));















            String cor = bic.getCor();


        }


    }

