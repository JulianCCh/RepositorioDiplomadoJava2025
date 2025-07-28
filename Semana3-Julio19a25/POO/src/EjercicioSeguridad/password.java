package EjercicioSeguridad;

public class password {
	
	private int longitud;
	private String password;
	
	public password() {
		longitud = 10;
	}
	
	public password(int longitud) {
		this.longitud = longitud;
	}
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public  String generar() {
		
		password = "";
		
		for (int i = 0; i < longitud; i++) {
			
			int tipo = (int) (Math.random()*3) + 1;
			
			char caracter = 0;
			
			switch (tipo) {
			case 1:
				caracter = (char) ((int) (Math.random()*(122-97))+97);
				break;
			case 2:
				caracter = (char) ((int) (Math.random()*(90-65))+66);
				break;
			case 3:
				caracter = (char) ((int) (Math.random()*(57-48))+48);
				break;			
			}
			
			password += caracter;			
		}
		this.password = password;
		return password;		
	}
	
	public void validar(){
		
		if (!password.isEmpty()) {
			
			//char[] caracteres = password.toCharArray();
			int minus=0, mayus=0, num=0;
			for (int i = 0; i < password.length(); i++) {
				
				char caracter = password.charAt(i);
				
				if (caracter >= 97 && caracter <= 122) {
					minus ++;
				}
				else if (caracter >= 65 && caracter <= 90 ) {
					mayus++;
				}
				else if (caracter >= 48 && caracter <= 57) {
					num++;
				}				
			}
			if (minus >=1 && mayus >= 2 && num >= 5) {
				System.out.println("La contraseña es segura");				
			} 
			else {
				System.out.println("La contraseña NO segura");				
			}			
			
		}
	}


}
