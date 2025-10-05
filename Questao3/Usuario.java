package Questao3;

// Objeto observer concreto
public class Usuario extends AbsObserver {

    public String Nome;

    public Usuario(String nome) {
        this.Nome = nome;
    }

    public void Notificar(String texto) {
        System.out.println("Notificação recebida para o usuário " + Nome + " > Nova notícia publicada sobre " + texto);
    };
}
