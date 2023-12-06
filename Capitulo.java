
import java.util.Scanner;

public class Capitulo {
    private String Nome;
    private String Texto;
    private Escolha[] Escolhas;
    private Personagem personagem;
    private int alteracaoEnergia;
    private Scanner escaneador;

    public void Executar(){
        this.mostrar();
        if(alteracaoEnergia > 0){
            personagem.removerEnergia(alteracaoEnergia);
        }
        if(Escolhas != null){
            int Escolha = this.escolher();
            this.Escolhas[Escolha].proximo.Executar();
        }
    }

    public void setEscolhas(Escolha[] escolhas) {
        Escolhas = escolhas;
    }

    public Capitulo(String nome, String Texto, Personagem personagem, Scanner escaneador) {
        this.Nome = nome;
        this.personagem = personagem;
        this.escaneador = escaneador;
        this.Texto = Texto;
        
    }

    private void mostrar(){
        System.out.println(this.Nome);
        System.out.println(Texto);
        if(Escolhas != null){
        for(int i = 0; i < Escolhas.length; i++){
            System.out.println("- " + Escolhas[i].Texto);
        }
        }
    }

    public void setAlteracaoEnergia(int alteracaoEnergia) {
        this.alteracaoEnergia = alteracaoEnergia;
    }

    private int escolher(){
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
                    if(escolha.equals(Escolhas[i].Texto)){
                        valido = true;
                        Escolhido = i;
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