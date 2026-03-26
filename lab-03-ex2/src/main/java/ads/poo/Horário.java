package ads.poo;

public class Horário {

    //atributos
    private int hora;
    private int minuto;
    private int segundo;


    //métodos


    public Horário() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horário(int hora) {
        this.hora = hora;
    }


    public Horário(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public Horário(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public boolean validador(int n, int limite) {
        if (n >= 0 && n < limite) {
            return true;
        }
        return false;
    }

    public boolean setMinuto(int m) {
        if (validador(m, 60)) {
            this.minuto = m;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int s) {
        if (validador(s, 60)) {
            this.segundo = s;
            return true;
        }
        return false;
    }

    public boolean setHora (int h) {
        if (validador(h,24)) {
            this.hora = h;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo + ":";
    }

    public String extenso() {

        int numeros;
        String numeroExtenso;
        switch (numeros) {
            case 1:
                numeroExtenso = "um";
            break;
            case 2:
                numeroExtenso = "dois";
            break;
            case 3:
                numeroExtenso = "três";
            break;
            case 4:
                numeroExtenso = "quatro";
            break;
            case 5:
                numeroExtenso = "cinco";
            break;
            case 6:
                numeroExtenso = "seis";
            break;
            case 7:
                numeroExtenso = "sete";
            break;
            case 8:
                numeroExtenso = "oito";
            break;
            case 9:
                numeroExtenso = "nove";
            break;
            case 10:
                numeroExtenso = "dez";
            break;
            case 11:
                numeroExtenso = "onze";
            break;
            case 12:
                numeroExtenso = "doze";
            break;
            case 13:
                numeroExtenso = "treze";
            break;
            case 14:
                numeroExtenso = "catorze";
            break;
            case 15:
                numeroExtenso = "quinze";
            break;
            case 16:
                numeroExtenso = "dezesseis";
            break;
            case 17:
                numeroExtenso = "dezessete";
            break;
            case 18:
                numeroExtenso = "dezoito";
            break;
            case 19:
                numeroExtenso = "dezenove";
            break;
            case 20:
                numeroExtenso = "vinte";
            break;
            case 21:
                numeroExtenso = "trinta";
            break;
            case 22:
                numeroExtenso = "quarenta";
            break;
            case 23:
                numeroExtenso = "cinquenta";
            break;
            case 24:
                numeroExtenso = "sessenta";
            break;
            case 25:
                numeroExtenso = "setenta";
            break;
            case 26:
                numeroExtenso = "oitenta";
            break;
            case 27:
                numeroExtenso = "noventa";
            break;
            case 28:
                numeroExtenso = "cem";
            break;
        }
    }


}
