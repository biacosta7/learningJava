```mermaid
classDiagram
    class Iphone {
    }
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    Iphone *-- ReprodutorMusical
    Iphone *-- AparelhoTelefonico
    Iphone *-- NavegadorInternet
```
