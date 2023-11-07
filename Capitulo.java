
import java.util.Scanner;

public class Capitulo {
    String Nome;
    String Texto;
    String Escolha_1;
    String Escolha_2;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;

    public Capitulo(String nome, Personagem personagem, Scanner escaneador) {
        Nome = nome;
        this.personagem = personagem;
        this.escaneador = escaneador;
    }

    public void mostrar(){
        System.out.println("Capitulo: "+ Nome);
        System.out.println(Texto);
    }

    public int escolher(){
        System.out.println("1 - "+Escolha_1);
        System.out.println("2 - "+Escolha_2);
        String lendo = escaneador.nextLine();
        if (lendo.equals("1")){
            return 1;
        } else {
            return 2;
        }

    }
    
}
