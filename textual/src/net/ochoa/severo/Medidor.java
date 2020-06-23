package net.ochoa.severo;

import java.io.IOException;

/**
 * 
 * Clase main de la aplicación
 *
 * @author AngelaVelasco
 * @version 1.0
 * 
 */

public class Medidor {
	
	/**
	 * Método principal (main) de la clase 
	 * 
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		int c = 0;
		String textoAnalizado = "";
		while (c < args.length) {
			textoAnalizado = args[c];
			System.out.print("'"+textoAnalizado + "' es una ");
			System.out.println(analiza(textoAnalizado));
			c++;
		}

	}
	
	/**
	 * Método "analiza" que analiza la longitud de una cadena y retorna de que tipo es en forma de String
	 * 
	 * @param a Cadena a analizar 
	 * @return Cadena que contiene el tipo de palabra que es
	 */

	private static String analiza(String a) {
		String r = "";
		switch (diagnostico(a)) {
		case 1:
			r = ">>> palabra laaaarga";
			break;
		case 2:
			r = ">>>>> palabra meeedia";
			break;
		default:
			r = ">>>>>>> palabra corta";
		}
		return r;

	}
	
	/**
	 * Método que establece la categoria de la palabra segun su longitid
	 * 
	 * @param a Palabra a categorizar
	 * @return Retorna valores de 1 al 3 segun sea larga, media o corta (1: para las > 8, 3: para las < 4 y 2: para el resto
	 */

	private static int diagnostico(String a) {
		if (a.length() > 8) {
			return 1;
		} else if (a.length() < 4) {
			return 2;
		}
		return 3;
	}

}
