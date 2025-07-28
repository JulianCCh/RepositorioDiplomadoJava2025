package EjercicioSeguridad;

/* Crear un proyecto llamado Seguridad, que permita generar una
   contraseña segura, para esto se deberán crear dos clases: una llamada
   Password y la clase principal para ejecutar.

  - Clase Password, cuenta con dos atributos: longitud y password
    con sus respectivos Getters y Setters (password no tendrá
    setter), además un constructor por defecto que asignará 10 al
    atributo longitud y un constructor que reciba la longitud deseada;
 
  a parte dos métodos:

  - generar(), genera una contraseña a partir del atributo longitud,
    aquí usaremos los caracteres de la tabla ASCII, la cual puedes ver
    dando clic aquí, de la siguiente forma:
  
  Por lo cual, para este ejercicio, usaremos un ciclo for que recorra las
  veces que tenga establecidas la variable longitud y generar caracteres:

  - Entre 91 – 122: minúsculas
  - Entre 90 – 65: mayúsculas
  - Entre 57 – 48: números

  Utiliza la clase Math y el método Math.random en los rangos
  anteriormente descritos para generar la contraseña. Puedes usar una
  condicional con una variable auxiliar generada por Math entre 1 y 3 para
  determinar si generar una minúscula, mayúscula o un número.

  - validar(), valida e imprime si la contraseña es segura, a partir de
    la cantidad de minúsculas, mayúsculas o números. Para saber si
    una contraseña es segura, debe tener al menos 5 números, 1
    minúsculas y 2 mayúsculas.

  - En la clase principal realizar todos los procesos anteriormente
    diseñados por los métodos y mostrar los resultados.*/

public class main {
	public static void main(String args[]) {
	
	password clave = new password();
	password clave2 = new password(15);
	
	System.out.println(clave.generar());
	clave.validar();
	System.out.println(clave2.generar());
	clave2.validar();
	
	}
	
	
}
