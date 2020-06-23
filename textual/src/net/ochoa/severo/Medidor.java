package net.ochoa.severo;

import java.io.IOException;

public class Medidor {

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

	private static int diagnostico(String a) {
		if (a.length() > 8) {
			return 1;
		} else if (a.length() < 4) {
			return 2;
		}
		return 3;
	}

}
