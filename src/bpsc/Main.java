package bpsc;
 
import javax.swing.*;
 
public class Main {
 
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
       
        
        int opcao = 0;         
        while (opcao != 99) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    		 "1: Livros \n"
                           + "2: Cadastro \n"
                           + "99: Sair \n"));
            switch (opcao) {
                case 1:
                	
                	int opcao2 = 0;
                	while (opcao2 != 99) {
                		opcao2 = Integer.parseInt(JOptionPane.showInputDialog(
                						  "1: Adicionar/Devolver livro \n"
                						+ "2: Listar livros \n"
                						+ "3: Buscar livros \n"
                						+ "99: Voltar para o menu anterior\\n"));
                		switch (opcao2) {
                		case 1:
                			biblioteca.adicionarLivro(biblioteca.caracteristicasLivro());
                			break;
                		case 2:
                			biblioteca.listarLivro();
                			break;
 
                		case 3:
                			int opcao3 = 0;
                			while (opcao3 != 99) {
                				opcao3 = Integer.parseInt(JOptionPane.showInputDialog(
                                		 	   "1: Buscar livro por titulo \n"
                                		 	 + "2: Buscar livro pelo código \n"
                                		 	 + "99: Voltar para o menu anterior\n"));
                				switch (opcao3) {
                				case 1:
                					String titulo = JOptionPane.showInputDialog("Titulo do livro:");
                					biblioteca.infoLivro(titulo);
                					break;
                				case 2:
                					int cod = Integer.parseInt(JOptionPane.showInputDialog("Código do livro:"));
                					biblioteca.infoLivro(cod);
                					break;
                				}
                			}
                    
                			
                		}
                	}
                	
                case 2:
                	int opcao4 = 0;
                	while (opcao4 != 99) {
                		opcao4 = Integer.parseInt(JOptionPane.showInputDialog(
                						  "1: Cadastrar pessoa \n"
                						+ "2: Listar cadastrados \n"
                						+ "3: Buscar cadastrados \n"
                						+ "99: Voltar para o menu anterior\\n"));
                		switch (opcao4) {
                		case 1:
                			biblioteca.adicionarPessoa(biblioteca.caracteristicasPessoa());
                			break;
                		case 2:
                			biblioteca.listarPessoa();
                			break;
 
                		case 3:
                			int opcao5 = 0;
                			while (opcao5 != 99) {
                				opcao5 = Integer.parseInt(JOptionPane.showInputDialog(
                                		 	   "1: Buscar pessoa por nome \n"
                                		 	 + "2: Buscar pessoa pelo código \n"
                                		 	 + "99: Voltar para o menu anterior\n"));
                				switch (opcao5) {
                				case 1:
                					String nome = JOptionPane.showInputDialog("Nome da pessoa:");
                					biblioteca.infoPessoa(nome);
                					break;
                				case 2:
                					int cod = Integer.parseInt(JOptionPane.showInputDialog("Código da pessoa:"));
                					biblioteca.infoPessoa(cod);
                					break;
                				}
                			}                			
                		}
                	}
                	
                	break;
        		default:
        			System.out.println("\n\n Saiu do sistema");
            }
        }          
    }
}