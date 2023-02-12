package examen;

public class Oca {
	static final int TAMCIRCUITO = 11;
	static int fichaJ1 = 0, fichaJ2 = 0;
	static int minDado, maxDado;

	static int tiraDados() {
		int resultado = (int) (Math.random() * (maxDado - minDado + 1) + minDado);
		return resultado;
	}

	static String pintaPista() {
		String pista = "";
		for (int i = 1; i <= TAMCIRCUITO; i++) {
			pista += "\t" + i;
			// System.out.print("\t" + i);
		}

		pista += "\n";
//		System.out.println();

		for (int i = 1; i <= fichaJ1; i++) {
			pista += "\t";
			// System.out.print("\t");
		}
		pista += "J1";
		// System.out.println("J1");

		for (int i = 1; i <= fichaJ2; i++) {
			pista += "\t";
//			System.out.print("\t");
		}
		pista += "J2";
//		System.out.println("J2");
		return pista;
	}

	static boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2) {
		boolean esPrimo = true;
		int suma = tirada1 + tirada2;

		if (suma <= 1) {
			esPrimo = false;
		} else {
			for (int i = 2; i <= suma / 2; i++) {
				if (suma % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}
		return esPrimo;
	}

	String imprimeComoVaLaCarrera(String nomJ1, String nomJ2) {
		String ganador = "";

		if (fichaJ1 > fichaJ2) {
//			System.out.println("Va ganando " + nomJ1);
			ganador += "Va ganando " + nomJ1;
		} else if (fichaJ2 > fichaJ1) {
//			System.out.println("Va ganando " + nomJ2);
			ganador += "Va ganando " + nomJ2;
		} else {
//			System.out.println("VAN EMPATADOS");
			ganador += "VAN EMPATADOS";
		}
		return ganador;
	}

	String esGanador(String nomJ1, String nomJ2) {
		String ganador = "";

		if (fichaJ1 >= TAMCIRCUITO) {
			ganador = nomJ1;
		} else if (fichaJ2 >= TAMCIRCUITO) {
			ganador = nomJ2;
		}

		return ganador;
	}

}
