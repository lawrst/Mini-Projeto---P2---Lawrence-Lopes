
import java.util.Scanner;

public class Capitulo {
    String Nome;
    String Texto;
    String[] Escolhas;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;

    public Capitulo(String nome, String Texto, Personagem personagem, Scanner escaneador, String[] Escolhas) {
        this.Nome = nome;
        this.personagem = personagem;
        this.escaneador = escaneador;
        this.Escolhas = Escolhas;
        this.Texto = Texto;
        
    }

    public void mostrar(){
        System.out.println(Texto);

        for(int i = 0; i < Escolhas.length; i++){
            System.out.println("- " + Escolhas[i]);
        }
    }

    public int escolher(){
        int Escolhido = 0;
        String escolha;
        boolean valido = false;

        if(Escolhas.length == 0){
            System.out.println("Fim de jogo! Reinicie para começar novamente!");
            return -1;
        } else {
            while (!valido){
                escolha = escaneador.nextLine();

                for(int i = 0; i < Escolhas.length; i++){
                    if(escolha.equals(Escolhas[i])){
                        valido = true;
                        Escolhido = i + 1;
                    }
                }
                if(!valido){
                    System.out.println("Digite novamente!");
                }
            }
            return Escolhido;
        }
       }
    }