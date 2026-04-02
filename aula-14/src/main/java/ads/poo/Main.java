package ads.poo;

import java.util.ArrayList;

public class Main {

    ArrayList<Conta> contas = new ArrayList<>();

    public Main(){      //nome nada ver com main, é uma classe, poderia ser qlq nome
        this.contas = new ArrayList<>();
    }

    void cadastrar(){
        var titular = IO.readln("Nome do titular: ");
        var numConta = Integer.parseInt(IO.readln("Número da conta:"));
        double saldo = Double.parseDouble(IO.readln("Saldo inicial: "));

        var novaConta = new Conta(numConta, titular, saldo);

        this.contas.add(novaConta);
    }



    void menu(String opcao){
        switch(opcao){
            case "1" -> { }
        }

    }

    static void main(String[] args) {


        Main app = new Main();


        IO.println("""
        ..:Menu:..
        1 - Cadastrar conta
        2 - Listar todas as contas
        3 - Depositar em uma conta
        4 - Sacar em uma conta
        5 - Sair
        """);

        var opcao = IO.readln("Entre com uma opção: ");
        app.menu(opcao);

        if (opcao = 1){

        }

















//        ArrayList<String> lista = new ArrayList<>();
//
//        lista.add("Juca");
//        lista.add("Maria");
//        lista.add("Pedro");
//        lista.add("Maria");
//
//        IO.println(lista);
//
//        for (String e: lista){
//            if (e.equals("Maria")){
//                IO.println(e);
//            }
//        }
//
//        lista.removeIf(e -> e.equals("Maria"));
//
//



















    }
}
