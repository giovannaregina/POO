package ads.poo;

public class Conta {
    private String numConta;
    private String titular;
    private double saldo;

    public Conta(String numConta, String titular, double saldo){
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = (saldo > 0) ? saldo : 0;
    }

    public double depositar(double valor){

        this.saldo += (valor > 0) ? valor : 0;
        return saldo;
    }

    public double sacar(double valor){
        this.saldo -= (valor > saldo) ? 0 : (valor > 0) ? valor : 0;
        return saldo;
    }

    public String toString(){
        return String.format("""
                Conta: %s
                Titular: %s
                Saldo: %.2f
                """, numConta, titular, saldo);
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
