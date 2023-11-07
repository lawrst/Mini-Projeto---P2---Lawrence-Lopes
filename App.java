import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Personagem principal = new Personagem("Lawrence", 100, 100);

        Personagem fazendeiro = new Personagem("Link", 100, 200);

        Personagem monstro = new Personagem("Lobo", 200, 100);

        Scanner ler = new Scanner(System.in);

        Capitulo capitulo1 = new Capitulo("1", principal, ler);       
        capitulo1.Texto = "Você acaba de cair em um mundo desconhecido onde está tudo nublado, exceto a única coisa que você consegue ver:"+
        " uma árvore amarela com folhas caindo. Você escuta o som de um animal, porém a cada segundo, o barulho só aumenta.";
        capitulo1.Escolha_1 = "Ficar esperando para ver o animal.";
        capitulo1.Escolha_2 = "Se levantar e sair correndo.";


        Capitulo capitulo2 = new Capitulo("2", principal, ler);
        
        capitulo2.Texto = "[FINAL 1] - Você aguardou até ver que era um lobo-branco, famoso por assassinar viajantes.\n" + "Você corre e encontra uma madeira, conseguindo atingir o lobo que"+
        " recua, deixando escapar umas gotas de sangue pelo chão.\nInfelizmente você não teve chance." +
        "\nVocê morreu sendo devorado.";

        Capitulo capitulo3 = new Capitulo("3", principal, ler);
        
        capitulo3.Texto = "Você sai correndo e após um tempo, o animal para de correr em sua direção. Você vê uma humilde casa de taipa e sem teto, lhe vêm a mente se há algum morador.";

        capitulo3.Escolha_1 = "Entrar na casa para investigar.";

        capitulo3.Escolha_2 = "Sair andando na esperança de algo melhor.";

        Capitulo capitulo4 = new Capitulo("4", principal, ler);
        capitulo4.Texto = "[FINAL 2] \nVocê decide entrar na humilde casa, porém um fazendeiro lhe confunde com um ladrão pelas suas vestes.\n" +
        "Olá, meu nome é " + fazendeiro.nome + ", e quem ousa entrar em minha casa?\n" +
        "Ele lhe ameaça com uma enxada, você tenta correr, mas não consegue escapar." +
        "\nVocê morreu com a cabeça decepada.";

        Capitulo capitulo5 = new Capitulo("5", principal, ler);
        capitulo5.Texto = "Você decide sair dalí.\nApós andar, andar e andar, você não encontra nada e está com fome e frio.\n" +
        "Sua energia está quase esgotada e você decide sentar no chão. Você faleceu por hipotermia.";

        capitulo1.mostrar();

        if(capitulo1.escolher() == 1){
            capitulo2.mostrar();
            monstro.novaSaude(-10);
            monstro.novaEnergia(-50);
            principal.novaSaude(-100);
        }else{
            capitulo3.mostrar();
            
            if(capitulo3.escolher() == 1){
                capitulo4.mostrar();
                principal.novaEnergia(-40);
                principal.novaSaude(-100);
            }else{
                
                capitulo5.mostrar();
                principal.novaEnergia(-90);
                principal.novaSaude(-100);

            }
        }
        ler.close();
    }
}
