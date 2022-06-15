public class Aluno2 extends Pessoa1{
    private int matricula;
    private String curso;
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno: " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matriucla) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
