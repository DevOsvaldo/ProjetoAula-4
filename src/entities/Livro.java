package entities;

public class Livro extends Catalogo {
 private String titulo;
 private String autor;
 private String isbn;
 private boolean emprestado;
 
 
public Livro() {}; 
public Livro(String titulo, String autor, String isbn) {
	this.titulo = titulo;
	this.autor = autor;
	this.isbn = isbn;
	this.emprestado = false;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public boolean isEmprestado() {
	return emprestado;
}
public void setEmprestado(boolean emprestado) {
	this.emprestado = emprestado;
}

public boolean Reservar() {
	if(!emprestado) {
		emprestado = true;
		return true;
		}
	return false;
}
 
public void Devolver() {
	emprestado = false;
}

public String Exibir_info() {
	return "Titulo: "+
			titulo +", do autor "+autor+", ISBN: "+isbn;
}
 
@Override
public boolean emprestarLivro(String isbn) {
	if(this.isbn.equals(isbn)) {
		 return Reservar();
		
	}
	return false;
}
@Override
public boolean devolverLivro(String isbn) {
	if(this.isbn.equals(isbn)) {
		Devolver();
		return true;
	}
	return false;
	}



}

 

