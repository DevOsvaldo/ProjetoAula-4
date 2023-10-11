	package entities;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca  {
	private List<Livro> catalogo;
	public Biblioteca() {
		catalogo = new ArrayList<>();
	}
	public void adicionarLivro(Livro livro) {
		catalogo.add(livro);
	}
	public void removerLivro(String isbn) {
		catalogo.removeIf(livro -> livro.getIsbn().equals(isbn));
	}
	
	public List<Livro> buscaPorTitulo(String titulo){
		List<Livro> result =  new ArrayList<>();
		for(Livro livro : catalogo) {
			if(livro.getTitulo().contains(titulo)) {
				result.add(livro);
			}
		}
		return result;
	}

	public boolean emprestarLivro(String isbn) {
		for(Livro livro : catalogo){
			 return livro.Reservar();
			
		}
		return false;
	}

	public boolean devolverLivro(String isbn) {
		for(Livro livro : catalogo) {
			if(livro.getIsbn().equals(isbn)) {
				livro.Devolver();
			}
		}
		return false;

	}
	
	public List<Livro> listarLivros(){
		return catalogo;
	}
	
	
	

	

}
