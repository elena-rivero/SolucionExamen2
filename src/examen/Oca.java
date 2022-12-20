package examen;

public class Oca {
	static final int TAMCIRCUITO = 11;
	static int fichaJ1=0, fichaJ2=0;
	static int minDado, maxDado;

	static int tiraDados() {
		int resultado = (int) (Math.random() * (maxDado - minDado + 1) + minDado);
		return resultado;
	}

	static void pintaPista() {
		for (int i = 1; i <= TAMCIRCUITO; i++) {
			System.out.print("\t" + i);
		}

		System.out.println();

		for (int i = 1; i <= fichaJ1; i++) {
			System.out.print("\t");
		}
		System.out.println("J1");

		for (int i = 1; i <= fichaJ2; i++) {
			System.out.print("\t");
		}
		System.out.println("J2");
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

	void imprimeComoVaLaCarrera(String nomJ1, String nomJ2) {
		if (fichaJ1 > fichaJ2) {
			System.out.println("Va ganando " + nomJ1);
		} else if (fichaJ2 > fichaJ1) {
			System.out.println("Va ganando " + nomJ2);
		} else {
			System.out.println("VAN EMPATADOS");
		}
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

	public static void main(String[] args) {
		Oca objeto = new Oca();
		fichaJ1=3;
		fichaJ2=11;
		System.out.println(objeto.esGanador("Pepe", "Juan"));
	}
}
