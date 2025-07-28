package EjercicioLibros;

public class libro {
	
	private String titulo, autor;
	private int paginas;
	
	public libro() {
		
	}
	
	public libro(String titulo, String autor, int paginas) {
		this.titulo=titulo;
		this.autor=autor;
		this.paginas=paginas;		
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

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public void mostrarLibro() {
		System.out.println("El libro "+ titulo+", del autor "+ autor +", tiene "+paginas+" paginas");
	}
	
	public String compararLibros(libro libro1, libro libro2) {
		
		if (libro1.getPaginas() > libro2.getPaginas()) {
			return libro1.getTitulo() + " tiene mayor numero de paginas";			
		}else {
			return libro2.getTitulo() + " tiene mayor numero de paginas";
		}		
		
	}

}
