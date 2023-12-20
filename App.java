import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> lista = lerArquivoEExibirConteudo("Personagem.txt");
        Map<String, Personagem> ListaPersonagem = new HashMap<String, Personagem>();
        Map<String, Capitulo> ListaCapitulo = new HashMap<String, Capitulo>();

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals("[PERSONAGEM]")){
                String nome = lista.get(i+1);
                int energia = Integer.parseInt(lista.get(i+2));
                int saude = Integer.parseInt(lista.get(i+3));
                Personagem temporario = new Personagem(nome, energia, saude);
                ListaPersonagem.put(nome, temporario);
            }
        }
        lista = lerArquivoEExibirConteudo("Capitulo.txt");
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals("[CAPÍTULO]")){
                String nome = lista.get(i+1);
                String texto = lista.get(i+2);
                Personagem persona = ListaPersonagem.get(lista.get(i+3));
                int energia = Integer.parseInt(lista.get(i+4));
                Capitulo capTemporario = new Capitulo(nome, texto, persona, ler);
                capTemporario.setAlteracaoEnergia(energia);
                ListaCapitulo.put(nome, capTemporario);
            }
            if(lista.get(i).equals("[ESCOLHA]")){
                String origem = lista.get(i+1);
                String texto = lista.get(i+2);
                String destino = lista.get(i+3);
                Capitulo temp = ListaCapitulo.get(destino);
                Capitulo original = ListaCapitulo.get(origem);
                original.addEscolha(texto, temp);
                //ListaCapitulo.get(origem).addEscolha(texto, ListaCapitulo.get(destino));
        
            }
        }

        ListaCapitulo.get("Capitulo 1:").Executar();

        ler.close();
    }

    public static List<String> lerArquivoEExibirConteudo(String nomeArquivo) {
    List<String> retorno = new ArrayList<String>();

    try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
        String linha;
        System.out.println("Conteúdo do arquivo " + nomeArquivo + ":");
        while ((linha = reader.readLine()) != null) {
            retorno.add(linha);
        }
        
    } catch (IOException e) {
        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
    }
    return retorno;
}

}
