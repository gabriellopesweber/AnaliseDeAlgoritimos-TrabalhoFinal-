package museu;

public class Museu {

	public static void main(String[] args) {

		execute();
	}

	public static void execute() {

		Node raiz = new Node();
		raiz.setName("raiz");
		Node no_2 = new Node();
		no_2.setName("2");
		Node no_3 = new Node();
		no_3.setName("3");
		Node no_4 = new Node();
		no_4.setName("4");
		Node no_5 = new Node();
		no_5.setName("5");

		fazNo(raiz, "esquerda", 2, "esquerda", no_2);

		fazNo(raiz, "direita", 3, "direita", no_3);

		fazNo(no_2, "esquerda", 4, "esquerda", no_4);

		fazNo(no_2, "direita", 3, "direita", no_5);

		fazNo(no_3, "esquerda", 2, "esquerda", no_5);

		verNo("esquerda", raiz);
		verNo("direita", raiz);
		verNo("esquerda", no_2);
		verNo("direita", no_2);
		verNo("esquerda", no_3);
		verNo("direita", no_3);
		verNo("esquerda", no_4);
		verNo("direita", no_4);
		verNo("esquerda", no_5);
		verNo("direita", no_5);
	}

	public static void fazNo(Node no, String arestaDirecao, int peso, String direcaoNo, Node noDirecao) {
		if (arestaDirecao.equalsIgnoreCase("esquerda")) {
			no.setAresta_esquerda(peso);
		} else {
			no.setAresta_direita(peso);
		}
		if (direcaoNo.equalsIgnoreCase("esquerda")) {
			no.setEsquerdo(noDirecao);
		} else {
			no.setDireito(noDirecao);
		}
	}

	public static void verNo(String local, Node no) {
		System.out.println("No: " + no.getName());
		if ((local.equalsIgnoreCase("esquerda")) && (no.getEsquerdo() != null)) {
			System.out.println("No a esquerda: " + no.getEsquerdo().getName());
		} else if ((local.equalsIgnoreCase("direita")) && (no.getDireito() != null)) {
			System.out.println("No a direita: " + no.getDireito().getName());
		} else {
			System.out.println("Nada localizado");
		}
	}

	public static void percorreNo(Node no) {
		if(no)
	}
}
