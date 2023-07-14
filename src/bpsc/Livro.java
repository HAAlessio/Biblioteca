package bpsc;

public class Livro {

	public String titulo;
    public String descricao;
    public int codigo;
    public static int totLivro = 0;
 
    public Livro() {
        incrementarTotalLivro();
        this.codigo = totLivro;
    }
 
    public Livro(String titulo, String descricao) {
        this();
        this.titulo = titulo;
        this.descricao = descricao;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public String getDescricao() {
        return descricao;
    }
 
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
 
    public int getCodigo() {
        return codigo;
    }
 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
 
    public static int getTotLivro() {
        return totLivro;
    }
 
    public static void setTotLivro(int totLivro) {
        Livro.totLivro = totLivro;
    }
 
    private int incrementarTotalLivro() {
        return Livro.totLivro++;
    }
 
    public void showInfo() {
        System.out.printf("\n\n Código livro: %s", this.codigo);
        System.out.printf("\n Titulo: %s", this.titulo);
    }
 
    public void mostrar() {
        System.out.printf("\n\n Código livro: %s", this.codigo);
        System.out.printf("\n Titulo: %s", this.titulo);
        System.out.printf("\n Descrição: %s", this.descricao);
    }
    
}
