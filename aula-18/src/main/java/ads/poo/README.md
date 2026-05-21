````mermaid
classDiagram
    direction LR
    
    
    
    class Aldeao{
    <<abstract>>
        - int vida (25)
        - int atk (1)
        - double vel (0.8)
        + atacarComSoco() String
        + movimentarFrente() String
        + pularBaixo() String
    }
    
    class Arqueiro {
        - int vida (35)
        - int atk (2)
        - double vel (1)
        + atacarComArco() String
        + movimentarEsquerda() String
        + pularMédio() String
    }
    
    class Cavaleiro {
        - int vida (50)
        - int atk (3)
        - double vel (2)
        + atacarComEspada() String
        + movimentarDireita() String
        + pularAlto() String
    }
    
    


````