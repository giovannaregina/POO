````mermaid
classDiagram
    direction LR
    
    
    
    class Aldeao{
    <<abstract>>
        - int vida (25)
        - int atk (1)
        - double vel (0.8)
        + atacarComSoco(atk) boolean
        + movimentarFrente(vel) boolean
        + pularBaixo() boolean
    }
    
    class Arqueiro {
        - int vida (35)
        - int atk (2)
        - double vel (1)
        + atacarComArco(atk) boolean
        + movimentarEsquerda(vel) boolean
        + pularMédio() boolean
    }
    
    class Cavaleiro {
        - int vida (50)
        - int atk (3)
        - double vel (2)
        + atacarComEspada(atk) boolean
        + movimentarDireita(vel) boolean
        + pularAlto() boolean
    }
    
    


````