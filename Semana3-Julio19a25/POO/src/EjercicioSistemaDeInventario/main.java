package EjercicioSistemaDeInventario;

/* Ejercicio 2: Sistema de Gestión de Inventario de Tienda
   Objetivo: Simular un sistema básico para gestionar el inventario de productos en una tienda.
   
   Clases a crear:
   Clase Producto:
        Atributos:
            codigo (String - identificador único del producto)
            nombre (String)
            precio (double)
            cantidadEnStock (int)
        Métodos:
            Constructores: Los que consideres necesarios (por ejemplo, uno que reciba código, nombre, precio y cantidad).
            
            Getters y Setters para todos los atributos.
            
            vender(int cantidad): Disminuye la cantidadEnStock si hay suficientes productos. Retorna true si la venta fue exitosa, 
            false en caso contrario.
            
            reponer(int cantidad): Aumenta la cantidadEnStock.
            
    Clase Inventario:
        Atributos:
            Un vector (Producto[]) llamado productos inicializado con una capacidad de 15 productos.
        Métodos:
        
            agregarProducto(Producto producto): Añade un producto al inventario. Asegúrate de que no se agreguen productos 
            con códigos duplicados. Si el inventario está lleno, muestra un mensaje.
            
            listarProductos(): Muestra todos los productos en el inventario con su código, nombre, precio y cantidad en stock.
            
            buscarProductoPorCodigo(String codigo): Busca un producto por su código y muestra toda su información.
            
            realizarVenta(String codigoProducto, int cantidad): Busca el producto por su código y, si existe y hay stock suficiente, 
            realiza la venta y actualiza la cantidad en stock. Muestra el total de la venta si es exitosa.
            
            reponerStock(String codigoProducto, int cantidad): Busca el producto y repone su stock.
            
            stockTotal(): Muestra la cantidad total de productos en el inventario (suma de las cantidadEnStock de todos los productos).

    Clase Principal (PrincipalTienda):
        Aquí deberás crear un objeto de la clase Inventario.
        Realiza las siguientes operaciones:
            Agrega al menos 4 productos diferentes al inventario.
            Lista todos los productos.
            Intenta agregar un producto con un código duplicado.
            Busca un producto por su código.
            Realiza una venta de un producto (exitosa).
            Intenta realizar una venta de un producto sin suficiente stock.
            Repone el stock de un producto.
            Muestra el stock total.*/

public class main {
	public static void main (String args[]) {
		
		inventario inventario = new inventario();
		
		producto art1 = new producto("0001", "agua", 3000, 40), 
				 art2 = new producto("0002", "Coke", 3000, 30),
				 art3 = new producto("0003", "HabSencilla", 48000, 5),
				 art4 = new producto("0004", "HabDoble", 65000, 2);
		
		System.out.println("Agregar 4 productos al inventario");
		inventario.agregarProducto(art1);
		inventario.agregarProducto(art2);
		inventario.agregarProducto(art3);
		inventario.agregarProducto(art4);
		
		System.out.println("Listar inventario");
		inventario.listarInventario();
		
		System.out.println("Agregar producto con codigo duplicado");
		inventario.agregarProducto(art1);
		
		System.out.println("Busqueda de producto por codigo");
		inventario.buscarPorCodigo("0003");
		
		System.out.println("Realizar una venta exitosa");
		inventario.realizarVenta("0002", 3);
		
		System.out.println("Realizar una venta sin stock");
		inventario.realizarVenta("0002", 31);
		
		System.out.println("Reponer el stock del producto");
		inventario.reponerStock("0002", 15);
		
		System.out.println("Muestra total de stock");
		inventario.stockTotal();
	}

}
