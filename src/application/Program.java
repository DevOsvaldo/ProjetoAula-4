package application;

import entities.Biblioteca;
import entities.Catalogo;
import entities.Livro;

public class Program {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Livro1", "Autor1", "ISBN123");
		Livro livro2 = new Livro("Livro2","Autor2","ISBNS456");
		Livro livro3 = new Livro("Livro3","Autor3", "ISBN789");
		
		Catalogo catalogo = new Catalogo();
		Biblioteca biblioteca = new Biblioteca();
		
		
		biblioteca.adicionarLivro(livro1);
		biblioteca.adicionarLivro(livro2);
		biblioteca.adicionarLivro(livro3);
		
		
		System.out.println("Lista de Livros");
		for (Livro livro : biblioteca.listarLivros()) {
			System.out.println(livro.Exibir_info());
			
		}
		
		String isbn = "ISBN123";
		System.out.println("Tentando Emprestar livro com ISBN "+isbn);
		if(catalogo.emprestarLivro(isbn)) {
			System.out.println("Livro emprestado com sucesso.");
		} else {
			System.out.println("Livro já emprestado ou não encontrado.");
		}
		
		
		System.out.println("Lista de livros após empréstimo");
		for(Livro livro: biblioteca.listarLivros()) {
			System.out.println(livro.Exibir_info());
		}
	}

}
