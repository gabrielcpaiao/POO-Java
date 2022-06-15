public class Aluno {
    //Atributos
    private int matr;
    private String curso;

    //Metodos
    public void cancelarMatr() {
        System.out.println("Matricula cancelada!");
    }

    //Metodos especiais
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
