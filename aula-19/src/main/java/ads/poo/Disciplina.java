package ads.poo;

public class Disciplina {
    public static final int DOMINGO = 1;
    public static final int SEGUNDA = 2;
    public static final int TERÇA = 3;
    public static final int QUARTA = 4;
    public static final int QUINTA = 5;
    public static final int SEXTA = 6;
    public static final int SÁBADO = 7;

    private String sigla;
    private DiaDaSemana aulas;

    public Disciplina(String sigla, DiaDaSemana[], DiaDaSemana[] aulas) {
        this.sigla = sigla;
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return "Sigla: " + sigla + '\n' +
                "Dias da semana: " + aulas;
    }
}
