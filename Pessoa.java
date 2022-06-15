public class Pessoa {
    private String nome;
    private String idade;
    private String sexo;

    public void fazerAniversario() {
        this.idade++;
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
    }
}
