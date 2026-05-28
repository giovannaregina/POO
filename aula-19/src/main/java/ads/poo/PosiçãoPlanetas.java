package ads.poo;

public enum PosiçãoPlanetas {
    MERCÚRIO(1),
    VÊNUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    private final int posição;

    PosiçãoPlanetas(int posição) {
        this.posição = posição;
    }

    public static int getByPosicao (int posição){
        for(PosiçãoPlanetas p : PosiçãoPlanetas.values()){
            if(p.posição == posição){
                return posição;
            }
        }
        throw new IllegalArgumentException("posição/planeta inválido");
    }

}
