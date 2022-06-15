public class Livro implements Publicacao {
    private String titulo;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{ " + "titulo " + titulo + ", autor" + autor + ", total de paginas= " + totPaginas + " ,pagina atutal: " + pagAtual + ", aberto " + aberto + ", leitor: " + leitor + "}";
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa)
}