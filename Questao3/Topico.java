package Questao3;

import java.util.ArrayList;
import java.util.List;

// Objeto observado
public class Topico {
    public String Nome;
    private List<AbsObserver> Observers = new ArrayList<AbsObserver>();

    public Topico(String nome) {
        Nome = nome;
    }

    private void NotificarTodos(String titulo) {
        for (AbsObserver obs : Observers) {
            obs.Notificar(Nome + ": " + titulo);
        }
    }

    public void PublicarNoticia(String titulo) {
        System.out.println("Publicando notícia: " + titulo);
        NotificarTodos(titulo);
    }

    public void Attach(AbsObserver o) {
        this.Observers.add(o);
    }

    public void Dettach(AbsObserver o) {
        this.Observers.remove(o);
    }
}
