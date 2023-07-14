package bpsc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
 
public class Biblioteca {
 
    protected String nome;
    protected String endereco;
    protected List<Livro> livros;
    protected List<Pessoa> pessoas;
    protected boolean contains;
    protected int index = -1;
 
    public Biblioteca() {
        livros = new ArrayList<>();
        pessoas = new ArrayList<>();
    }
 
    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
 
    public Livro caracteristicasLivro() {
        String titulo = null;
        String desc = null;
       
            titulo = JOptionPane.showInputDialog("Titulo do livro: ");
            desc = JOptionPane.showInputDialog("Descrição do livro: ");
        
        Livro livro = new Livro(titulo, desc);
        return livro;
    }
    
    public Pessoa caracteristicasPessoa() {
        String nome = null;
        String cpf = null;
       
            nome = JOptionPane.showInputDialog("Nome da pessoa: ");
            cpf = JOptionPane.showInputDialog("CPF da pessoa: ");
        
        Pessoa pessoa = new Pessoa(nome, cpf);
        return pessoa;
    }
 
    public boolean containsLivro(String titulo) {
        contains = false;
        if (this.livros != null) {
            for (int i = 0; i < this.livros.size() && !contains; i++) {
                if (titulo.equals(this.livros.get(i).titulo)) {
                    index = i;
                    contains = true;
                }
            }
        }
        return contains;
    }
 
    public boolean containsLivro(int cod) {
        contains = false;
        if (this.livros != null) {
            for (int i = 0; i < this.livros.size() && !contains; i++) {
                if (cod == this.livros.get(i).codigo) {
                    index = i;
                    contains = true;
                }
            }
        }
        return contains;
    }
    
    public boolean containsPessoa(String nome) {
        contains = false;
        if (this.pessoas != null) {
            for (int i = 0; i < this.pessoas.size() && !contains; i++) {
                if (nome.equals(this.pessoas.get(i).nome)) {
                    index = i;
                    contains = true;
                }
            }
        }
        return contains;
    }
 
    public boolean containsPessoa(int cod) {
        contains = false;
        if (this.pessoas != null) {
            for (int i = 0; i < this.pessoas.size() && !contains; i++) {
                if (cod == this.pessoas.get(i).codigo) {
                    index = i;
                    contains = true;
                }
            }
        }
        return contains;
    }
 
    public boolean adicionarLivro(Livro livro) {
        if (containsLivro(livro.titulo)) {
            JOptionPane.showMessageDialog(null,"Livro já cadastrado");
        } else {
            this.livros.add(livro);
            JOptionPane.showMessageDialog(null, "Livro adicionado.");
        }
        return contains;
    }
    
    public boolean adicionarPessoa(Pessoa pessoa) {
        if (containsPessoa(pessoa.nome)) {
            JOptionPane.showMessageDialog(null,"Pessoa já cadastrada");
        } else {
            this.pessoas.add(pessoa);
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada");
        }
        return contains;
    }
 
    public boolean emprestaLivro(String titulo) {
        if (containsLivro(titulo)) {
            this.livros.remove(index);
            JOptionPane.showMessageDialog(null, "Livro emprestado");
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        }
        return contains;
    }
 
    public boolean emprestaLivro(int codigo) {
        if (containsLivro(codigo)) {
            this.livros.remove(index);
            JOptionPane.showMessageDialog(null, "Livro emprestado");
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        }
        return contains;
    }  
 
    public boolean removerLivro(String titulo) {
        if (containsLivro(titulo)) {
            this.livros.remove(index);
            JOptionPane.showMessageDialog(null, "Livro removido");
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        }
        return contains;
    }
 
    public boolean removerLivro(int codigo) {
        if (containsLivro(codigo)) {
            this.livros.remove(index);
            JOptionPane.showMessageDialog(null, "Livro removido");
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado");
        }
        return contains;
    }
    
    public boolean removerPessoa(String nome) {
        if (containsLivro(nome)) {
            this.pessoas.remove(index);
            JOptionPane.showMessageDialog(null, "Cadastro removido");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro não encontrado");
        }
        return contains;
    }
 
    public boolean removerPessoa(int codigo) {
        if (containsLivro(codigo)) {
            this.pessoas.remove(index);
            JOptionPane.showMessageDialog(null, "Cadastro removido");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro não encontrado");
        }
        return contains;
    }
 
    public boolean listarLivro() {
        String msg = "";
        if (this.livros != null) {
            for (int i = 0; i < this.livros.size(); i++) {
                msg += "\n Código do livro: " + livros.get(i).codigo + "\n Titulo: " + livros.get(i).titulo + "\n Descrição: " + livros.get(i).descricao + "\n";
            }
            JOptionPane.showMessageDialog(null, msg);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum livro encontrado.");
            return false;
        }
    }
    
    public boolean listarPessoa() {
        String msg = "";
        if (this.pessoas != null) {
            for (int i = 0; i < this.pessoas.size(); i++) {
                msg += "\n Código da pessoa: " + pessoas.get(i).codigo + "\n Nome: " + pessoas.get(i).nome + "\n CPF: " + pessoas.get(i).cpf + "\n";
            }
            JOptionPane.showMessageDialog(null, msg);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cadastro encontrado.");
            return false;
        }
    }
 
    public boolean infoLivro(String titulo) {
        if (containsLivro(titulo)) {
            int opc = 0;
            String msg = "";
            msg += "\nCódigo do livro: " + livros.get(index).codigo +
                    "\nTitulo do livro: " + livros.get(index).titulo +
                    "\n1: Detalhes" +
                    "\n2: Emprestar" +
                    "\n3: Remover" +
                    "\n99: Retornar";
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
            while (opc != 99) {
                switch (opc) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "\nCódigo: " + livros.get(index).codigo +
                                "\nTitulo: " + livros.get(index).titulo +
                                "\nDescrição: " + livros.get(index).descricao);

                        opc = 0;
                        break;
                    case 2:
                        emprestaLivro(titulo);
                        opc = 99;
                        break;
                    case 3:
                        removerLivro(nome);
                        opc = 99;
                        break; 
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
    public boolean infoPessoa(String nome) {
        if (containsPessoa(nome)) {
            int opc = 0;
            String msg = "";
            msg += "\nCódigo da pessoa: " + pessoas.get(index).codigo +
                    "\nNome da pessoa: " + pessoas.get(index).nome +
                    "\n1: Detalhes" +
                    "\n3: Remover" +
                    "\n99: Retornar";
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
            while (opc != 99) {
                switch (opc) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "\nCódigo: " + pessoas.get(index).codigo +
                                "\nNome: " + pessoas.get(index).nome +
                                "\nCPF: " + pessoas.get(index).cpf);

                        opc = 0;
                        break;
                    case 2:
                        removerPessoa(nome);
                        opc = 99;
                        break; 

                }
            }
            return true;
        } else {
            return false;
        }
    }
 
    public boolean infoLivro(int cod) {
        if (containsLivro(cod)) {
            int opc = 0;
            String msg = "";
            msg += "\nCódigo do produto: " + livros.get(index).codigo +
                    "\nNome do produto: " + livros.get(index).titulo +
                    "\n1: Detalhes" +
                    "\n2: Emprestar" +
                    "\n3: Remover" +
                    "\n99: Retornar";
 
            while (opc != 99) {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
                switch (opc) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "\nCódigo: " + livros.get(index).codigo +
                                "\nTitulo: " + livros.get(index).titulo +
                                "\nDescrição: " + livros.get(index).descricao);

                        opc = 0;
                        break;
                    case 2:
                        emprestaLivro(cod);
                        opc = 99;
                        break;
                    case 3:
                        removerLivro(cod);
                        opc = 99;
                        break; 
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
    public boolean infoPessoa(int codigo) {
        if (containsPessoa(codigo)) {
            int opc = 0;
            String msg = "";
            msg += "\nCódigo da pessoa: " + pessoas.get(index).codigo +
                    "\nNome da pessoa: " + pessoas.get(index).nome +
                    "\n1: Detalhes" +
                    "\n3: Remover" +
                    "\n99: Retornar";
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
            while (opc != 99) {
                switch (opc) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "\nCódigo: " + pessoas.get(index).codigo +
                                "\nNome: " + pessoas.get(index).nome +
                                "\nCPF: " + pessoas.get(index).cpf);

                        opc = 0;
                        break;
                    case 2:
                        removerPessoa(codigo);
                        opc = 99;
                        break; 

                }
            }
            return true;
        } else {
            return false;
        }
    }
}