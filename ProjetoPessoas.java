public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Gabriel");
        p3.setNome("Lucas");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(23);

        p3.receberAumento(550.20f);
        p2.mudarTrabalho();
        p4.cancelarMatr();

        p2.setCurso("Ciencia da computacao");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
