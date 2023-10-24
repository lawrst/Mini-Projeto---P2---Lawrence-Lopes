import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        String cap1 = "introdução";

        String cap1Esc1 = "escolha 1";

        String cap1Esc2 = "escolha 2";

        String cap2 = "final 1";

        String cap3 = "meio";

        String cap3Esc1 = "meio primeira escolha";

        String cap3Esc2 = "meio primeira escolha";

        String cap4 = "final 2";

        String cap5 = "final 3";

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