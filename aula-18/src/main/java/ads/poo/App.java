package ads.poo;


import java.util.ArrayList;

public class App {
    static void main(String[] args) {

        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Aldeao());
        personagens.add(new Arqueiro());
        personagens.add(new Cavaleiro());
        personagens.add(new Aldeao());
        personagens.add(new Aldeao());

        for(Personagem p : personagens){
            p.movimentar();
        }

    }


}
