package Questao3;

public class Main {
    public static void main(String[] args) {

        // Instanciando usuarios (observadores)
        Usuario u1 = new Usuario("Usuario1");

        Usuario u2 = new Usuario("Usuario2");

        // Instanciando tópicos
        Topico esporte = new Topico("Esporte");

        Topico politica = new Topico("Politica");

        Topico tecnologia = new Topico("Tecnologia");

        // Adicionado usuario1 para receber notificações de esporte e politica
        esporte.Attach(u1);

        politica.Attach(u1);

        // Adicionado usuario2 para receber notificações de esporte, politica e tecnologia
        esporte.Attach(u2);

        politica.Attach(u2);

        tecnologia.Attach(u2);

        // Publicando noticia no topico esporte
        esporte.PublicarNoticia("Time ganhou o jogo por 2 a 0");

        // Publicando noticia sobre politica
        politica.PublicarNoticia("Nova lei aprovada no senado");

        // Publicando noticia sobre tecnologia
        tecnologia.PublicarNoticia("Nova tecnologia criada");

    }
}
