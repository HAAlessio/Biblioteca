package bpsc;

public class Pessoa {

	public String nome;
    public String cpf;
    public int codigo;
    public static int totPessoa = 0;
 
    public Pessoa() {
        incrementarTotalPessoa();
        this.codigo = totPessoa;
    }
 
    public Pessoa(String nome, String cpf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getCpf() {
        return cpf;
    }
 
    public void setDescricao(String cpf) {
        this.cpf = cpf;
    }
 
    public int getCodigo() {
        return codigo;
    }
 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
 
    public static int getTotPessoa() {
        return totPessoa;
    }
 
    public static void setTotPessoa(int totPessoa) {
        Pessoa.totPessoa = totPessoa;
    }
 
    private int incrementarTotalPessoa() {
        return Pessoa.totPessoa++;
    }
 
    public void showInfo() {
        System.out.printf("\n\n Código pessoa: %s", this.codigo);
        System.out.printf("\n Nome: %s", this.nome);
    }
 
    public void mostrar() {
        System.out.printf("\n\n Código pessoa: %s", this.codigo);
        System.out.printf("\n Nome: %s", this.nome);
        System.out.printf("\n CPF: %s", this.cpf);
    }
    
}
