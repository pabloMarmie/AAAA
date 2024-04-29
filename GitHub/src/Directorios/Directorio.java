package Directorios;

public class Directorio {

	public static void main(String[] args) {
		try {
			File directorios = new File("pru1");
			if (!directorios.exists()) {
				if (directorios.mkdirs()) {
					System.out.println("Multiples directorios fueron creados");
				} else {
					System.out.println("Error al crear directorios");
				}
			} else {
				System.out.println("Ya existe el directorio");
				System.out.println(directorios.getAbsolutePath());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
