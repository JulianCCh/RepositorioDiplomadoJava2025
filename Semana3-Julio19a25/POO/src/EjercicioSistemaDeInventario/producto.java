package EjercicioSistemaDeInventario;

public class producto {

	private String codigo, nombre;
	private double precio;
	private int stock;

	public producto() {
	}

	public producto(String codigo, String nombre, double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public boolean vender (int stock) {
		if (this.stock >= stock) {
			this.stock -= stock;
			return true;				
		}else {
			return false;
		}
	}
	
	public void reponer (int stock) {
		this.stock += stock;
	}

	@Override
	public String toString() {
		return codigo + " nombre=" + nombre + " precio= " + precio + " stock= " + stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
