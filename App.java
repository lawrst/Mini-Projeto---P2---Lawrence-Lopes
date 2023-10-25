import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        String cap1 = "Você acaba de cair em um mundo desconhecido onde está tudo nublado, exceto a única coisa que você consegue ver: uma árvore amarela com folhas caindo. Você escuta o som de um animal, porém a cada segundo, o barulho só aumenta.";

        String cap1Esc1 = "Ficar esperando para ver o animal.";

        String cap1Esc2 = "Se levantar e sair correndo.";

        String cap2 = "Você aguardou até ver que era um lobo-branco, famoso por assassinar viajantes. Você morreu sendo devorado.";

        String cap3 = "Você sai correndo e após um tempo, o animal para de correr em sua direção. Você vê uma humilde casa de taipa e sem teto, lhe vêm a mente se há algum morador.";

        String cap3Esc1 = "Entrar na casa para investigar.";

        String cap3Esc2 = "Sair andando na esperança de algo melhor.";

        String cap4 = "Você decide entrar na humilde casa, porém um fazendeiro lhe confunde com um ladrão pelas suas vestes. Ele lhe ameaça com uma enxada, você tenta correr, mas não consegue escapar. Você morreu com a cabeça decepada.";

        String cap5 = "Você decide sair dalí. Após andar, andar e andar, você não encontra nada e está com fome e frio. Sua energia acaba e você se senta no chão. Você faleceu por hipotermia.";

        System.out.println(cap1);

        System.out.println("1 - "+cap1Esc1);

        System.out.println("2 - "+cap1Esc2);

        String escolha = ler.nextLine();

        if(escolha.equals("1")){
            System.out.println(cap2);
        }else{
            System.out.println(cap3);

            System.out.println("1 - "+cap3Esc1);
            System.out.println("2 - "+cap3Esc2);
            escolha = ler.nextLine();
            
            if(escolha.equals("1")){
                System.out.println(cap4);
            }else{
                System.out.println(cap5);
            }
        }
        ler.close();
    }
}