public class Personagem  {

    private String nome;
    private int energia;
    private int saude;
    public String getNome() {
        return nome;
    }

    Personagem(String nome, int energia, int saude){

        this.nome = nome;
        this.energia = 100;
        this.saude = 100;

    }
        void novaEnergia(int incremento){
        this.energia += incremento;
        System.out.println("A energia de " + this.nome + " foi a " + this.energia);

    }

        void novaSaude(int incremento){
        this.saude += incremento;
        System.out.println("A saúde de " + this.nome + " foi a " + this.saude);
}
    public void removerEnergia(int valor){
        this.energia -= valor;
        if(this.energia < 0){
            this.energia = 0;
        }
        System.out.println(this.nome + " gastou "+ valor + " de energia");

    }
}