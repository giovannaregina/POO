package ads.poo;

import java.util.ArrayList;

public class App {

    private ArrayList<Conta> contas;

    public App() {      //nome nada ver com main, é uma classe, poderia ser qlq nome
        this.contas = new ArrayList<>();
        this.contas.add(new Conta("123", "Juca", 10));
        this.contas.add(new Conta("124", "Maria", 15));
        this.contas.add(new Conta("125", "Zé", 20));
    }

    void entrar() {
        var titular = IO.readln("Nome do titular: ");
        var numConta = IO.readln("Número da conta: ");

    }

    void depositar(){
        var numero = IO.readln("Entre com o número da conta: ");
        var valor = Double.parseDouble(IO.readln("Valor a ser depositado: "));

        for (Conta c : contas ){
            if (c.getNumConta().equals(numero)){
                var saldoAnterior = c.getSaldo();
                c.depositar(valor);
                if (saldoAnterior == c.getSaldo()){
                    IO.println("Não foi possível depositar. Somente valores positivos.");
                }
                return;
            }
        }
        IO.println("Número da conta não encontrada.");
    }

    void sacar(){
        var numero = IO.readln("Entre com o número da conta: ");
        var valor = Double.parseDouble(IO.readln("Valor a ser sacado: "));

        for (Conta c : contas ){
            if (c.getNumConta().equals(numero)){
                var saldoAnterior = c.getSaldo();
                c.sacar(valor);
                if (saldoAnterior == c.getSaldo()){
                    IO.println("Não foi possível sacar. Somente valores positivos.");
                }
                return;
            }
        }
        IO.println("Número da conta não encontrada.");
    }

    void cadastrar() {
        var titular = IO.readln("Nome do titular: ");
        var numConta = IO.readln("Número da conta: ");
        double saldo = Double.parseDouble(IO.readln("Saldo inicial: "));

        var novaConta = new Conta(numConta, titular, saldo);

        this.contas.add(novaConta);
    }



    void menu(int opcao) {
        switch (opcao) {
            case 1 -> {
            }
        }

    }


    static void main(String[] args) {

        App app = new App();
        int o;
        do {
            IO.println("""
                    ..:Menu:..
                    1 - Cadastrar conta
                    2 - Listar todas as contas
                    3 - Depositar em uma conta
                    4 - Sacar em uma conta
                    5 - Sair
                    """);

            o = Integer.parseInt(IO.readln("Entre com uma opção: "));
            app.menu(o);


        if (o == 1) {
            app.cadastrar();
        } else if (o == 2) {
            for (Conta e : app.contas) {
                IO.println(e.toString());
            }
        } else if (o == 3) {
            app.depositar();
        }
        else if ( o == 4 ){
            app.sacar();
        }
    }while (o != 5);


    }
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
