package EjercicioSistemaDeInventario;


public class inventario {
	
	producto[] productos = new producto[15];
	
	public inventario() {		
	}
	
	public inventario(producto[] productos) {
		for (int i = 0; i < productos.length; i++) {
			if (this.productos[i]== null) {
				this.productos[i] = productos[i];
			}
		}		
	}
	
	public void agregarProducto(producto producto) {
		int cantEnLista = 0;
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				cantEnLista++;				
			}
		}
		if (cantEnLista < productos.length) {
			boolean enLista = false;
			for (int i = 0; i < cantEnLista; i++) {
				if (productos[i].getCodigo().equals(producto.getCodigo())) {
					enLista = true;
				}
			}
			
			if (!enLista) {
				productos[cantEnLista] = producto;
				System.out.println("Se agrego al inventario: " + producto.getNombre());				
			} 
			else {
				System.out.println("El producto ya esta en el inventario");				
			}
		} 
		else {
			System.out.println("Esta lleno el inventario");
		}
	}
	
	public void listarInventario() {
		int cantEnLista = 0;
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				cantEnLista++;				
			}
		}
		if (cantEnLista>0) {
			
			for (int i = 0; i < cantEnLista; i++) {				
				System.out.println(productos[i].toString());
			}
		}
		else {
			System.out.println("El inventario esta vacio");			
		}
	}
	
	public producto buscarPorCodigo(String codigo) {
		int cantEnLista = 0;
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				cantEnLista++;				
			}
		}
		int enLista = -1;
		for (int i = 0; i < cantEnLista; i++) {
			if (productos[i].getCodigo().equals(codigo)) {
				enLista = i;
			}			
		}
		if (enLista>=0) {			
			System.out.println("Producto encontrado:");			
			System.out.println(productos[enLista].toString());
			return productos[enLista];		
		}
		else {
			System.out.println("El producto no esta en el inventario");	
			return null;
		}
	}
	
	public void realizarVenta(String codigo, int cant) {
		
		producto productoEncontrado = buscarPorCodigo(codigo);
		
		if (productoEncontrado != null) {
			if (productoEncontrado.vender(cant)) {
				
				System.out.println("Total de la venta: " + ((double)cant*productoEncontrado.getPrecio()));							
			}
			else {
				System.out.println("No hay stock suficiente");				
			}
		}				
	}
	
	public void reponerStock(String codigo, int cant) {
		
		producto productoEncontrado = buscarPorCodigo(codigo);
		productoEncontrado.reponer(cant);
		System.out.println(productoEncontrado.toString());			
		
	}
	
	public void stockTotal() {
		int stockTotal = 0;		
		int cantEnLista = 0;
		
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				cantEnLista++;				
			}
		}
		for (int i = 0; i < cantEnLista; i++) {
			stockTotal += productos[i].getStock();			
		}
		System.out.println("Total de articulos en el inventario: " + stockTotal);
	}

}
