public class Personagem  {

    String nome;
    int energia;
    int saude;

    public Personagem(String nome){

        this.nome = nome;
    }
    Personagem(String nome, int energia, int saude){

        this.nome = nome;
        this.energia = 100;
        this.saude = 100;

    }
    Personagem(int saude){

        this.saude = 200;
}
    void novaEnergia(int incremento){
        this.energia += incremento;
        System.out.println("A energia de " + this.nome + " foi a " + this.energia);

    }

        void novaSaude(int incremento){
        this.saude += incremento;
        System.out.println("A saúde de " + this.nome + " foi a " + this.saude);
}
}