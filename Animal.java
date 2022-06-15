public abstract class Animal {
    //Atributos de animal
    protected float peso;
    protected int idade;
    protected int membro;

    //Metodos de Animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }
}
