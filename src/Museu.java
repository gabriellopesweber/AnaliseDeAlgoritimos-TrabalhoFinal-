import java.util.ArrayList;
import java.util.Scanner;

public class Museu {

	public static void main(String[] args) {
		int opcao;

		try (Scanner op = new Scanner(System.in)) {
			do {
				System.out.println("----GrafoBase----");
				System.out.println("        [0]      ");
				System.out.println("       /2  |3    ");
				System.out.println("    [1]    [2]   ");
				System.out.println("   4/  3|   /2   ");
				System.out.println("[3]     [4]      ");
				System.out.println("       /5        ");
				System.out.println("    [5]          ");
				System.out.println("   /8            ");
				System.out.println("[4]              ");
				System.out.println("-----------------\n");
				System.out.println("Opcoes");
				System.out.println("1 - Executar programa");
				System.out.println("2 - ");
				System.out.println("3 - ");
				System.out.println("5 - Sair");
				System.out.println("Digite a opcao desejada: ");
				opcao = op.nextInt();
				
				switch (opcao) {

				case 1:
					computar();
					break;

				case 2:

					break;

				case 3:

					break;

				default:
					System.out.println("Opcao invalida !!!");
					System.out.println("\f");
				}
			} while (opcao != 5);
		}

		System.out.println("Programa encerrado.");

	}

	public static void computar() {
		int grafo_peso[] = new int[7];

		ArrayList<Node> lista_nos = new ArrayList<Node>();

		Node no_0 = new Node();
		Node no_1 = new Node();
		Node no_2 = new Node();
		Node no_3 = new Node();
		Node no_4 = new Node();
		Node no_5 = new Node();
		Node no_6 = new Node();

		no_0.setName("0");
		no_1.setName("1");
		no_2.setName("2");
		no_3.setName("3");
		no_4.setName("4");
		no_5.setName("5");
		no_6.setName("6");

		lista_nos.add(no_0);
		lista_nos.add(no_1);
		lista_nos.add(no_2);
		lista_nos.add(no_3);
		lista_nos.add(no_4);
		lista_nos.add(no_5);
		lista_nos.add(no_6);

		fazNo(no_0, "esquerda", 2, no_1);
		fazNo(no_0, "direita", 3, no_2);
		fazNo(no_1, "esquerda", 4, no_3);
		fazNo(no_1, "direita", 3, no_4);
		fazNo(no_2, "esquerda", 4, no_4);
		fazNo(no_4, "esquerda", 5, no_5);
		fazNo(no_5, "esquerda", 8, no_6);
		
		

//		System.out.println("Nó: " + no_0.getName());
//		System.out.println("Nó a esquerda: " + no_0.getAresta_esquerda());
//		System.out.println((no_0.getEsquerdo() != null ) ? "Peso do nó: " + no_5.getEsquerdo().getPeso() : "Nao existe");
//		System.out.println("Nó a direita: " + no_0.getAresta_direita());
//		System.out.println((no_0.getDireito() != null ) ? "Peso do nó: " + no_5.getDireito().getPeso() : "Nao existe");
//		System.out.println("Nó: " + no_1.getName());
//		System.out.println("Nó a esquerda: " + no_1.getAresta_esquerda());
//		System.out.println("Nó a direita: " + no_1.getAresta_direita());
//		System.out.println("Peso do nó: " + no_1.getPeso());
//		System.out.println("Nó: " + no_2.getName());
//		System.out.println("Nó a esquerda: " + no_2.getAresta_esquerda());
//		System.out.println("Nó a direita: " + no_2.getAresta_direita());
//		System.out.println("Peso do nó: " + no_2.getPeso());
//		System.out.println("Nó: " + no_3.getName());
//		System.out.println("Nó a esquerda: " + no_3.getAresta_esquerda());
//		System.out.println("Nó a direita: " + no_3.getAresta_direita());
//		System.out.println("Peso do nó: " + no_3.getPeso());
//		System.out.println("Nó: " + no_4.getName());
//		System.out.println("Nó a esquerda: " + no_4.getAresta_esquerda());
//		System.out.println("Nó a direita: " + no_4.getAresta_direita());
//		System.out.println("Peso do nó: " + no_4.getPeso());
//		System.out.println("Nó: " + no_5.getName());
//		System.out.println("Nó a esquerda: " + no_5.getAresta_esquerda());
//		System.out.println((no_5.getEsquerdo() != null ) ? "Peso do nó: " + no_5.getEsquerdo().getPeso() : "Nao existe");
//		System.out.println("Nó a direita: " + no_5.getAresta_direita());
//		System.out.println((no_5.getDireito() != null ) ? "Peso do nó: " + no_5.getDireito().getPeso() : "Nao existe");
//		System.out.println("Nó: " + no_6.getName());
//		System.out.println("Nó a esquerda: " + no_6.getAresta_esquerda());
//		System.out.println("Nó a direita: " + no_6.getAresta_direita());
//		System.out.println("Peso do nó: " + no_6.getPeso());
		
		calculaPeso(lista_nos, grafo_peso);
		
		System.out.println("\n");
		for (int i = 0; i < grafo_peso.length; i++) {
			System.out.println("distancia da raiz ate o nó " + i + ": " + grafo_peso[i]);
		}

	}

	public static void calculaPeso(ArrayList<Node> lista_nos, int grafo_peso[]) {
		
		Node no_atual = new Node();
		boolean saida_encontrada = false;
		System.err.println("To aqui");
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Qual seria a raiz: ");
			String raiz = scanner.nextLine();
			System.out.println("Qual seria o destino: ");
			String saida = scanner.nextLine();

			for (Node node : lista_nos) {
				if (node.getName().equalsIgnoreCase(raiz)) {
					no_atual = node;
				}
				if (node.getName().equalsIgnoreCase(saida)) {
					node.setSaida(true);
				}
			}
		}
		int peso = 0;

		// percorre o grafo em busca de uma saída
		while (!saida_encontrada) {

			if (no_atual.isSaida()) {
				saida_encontrada = true;
				printaCaminho(no_atual);
				continue;
			}

			if (no_atual.getEsquerdo() != null) {
				no_atual.getEsquerdo().setRoot(no_atual);
				if (no_atual.getEsquerdo().isVisitado() == false) {

					peso += no_atual.getAresta_esquerda();

					no_atual = no_atual.getEsquerdo();

					int pos = Integer.parseInt(no_atual.getName());
					grafo_peso[pos] = peso;

					continue;
				}
			}

			if (no_atual.isSaida()) {
				saida_encontrada = true;
				printaCaminho(no_atual);
				continue;
			}

			if (no_atual.getDireito() != null) {
				no_atual.getDireito().setRoot(no_atual);
				if (no_atual.getDireito().isVisitado() == false) {

					peso += no_atual.getAresta_direita();

					no_atual = no_atual.getDireito();

					int pos = Integer.parseInt(no_atual.getName());
					grafo_peso[pos] = peso;

					continue;
				}
			}

			if (no_atual.isSaida()) {
				saida_encontrada = true;
				printaCaminho(no_atual);
				continue;
			}

			no_atual.setVisitado(true);
			no_atual = no_atual.getRoot();

			int pos = Integer.parseInt(no_atual.getName());
			peso = grafo_peso[pos];

			if (no_atual.isSaida()) {
				saida_encontrada = true;
				printaCaminho(no_atual);
				continue;
			}

		}
	}

	public static void fazNo(Node no, String arestaDirecao, int peso, Node noDirecao) {
		if (arestaDirecao.equalsIgnoreCase("esquerda")) {
			no.setAresta_esquerda(peso);
			no.setEsquerdo(noDirecao);
		} else {
			no.setAresta_direita(peso);
			no.setDireito(noDirecao);
		}
	}

	public static void printaCaminho(Node no_final) {
		boolean is_raiz = false;

		ArrayList<Node> lista_nodes = new ArrayList<>();
		ArrayList<Node> lista_nodes_reverse = new ArrayList<>();

		while (!is_raiz) {
			lista_nodes.add(no_final);
			if (no_final.getRoot() != null) {
				no_final = no_final.getRoot();
			} else {
				is_raiz = true;
			}
		}

		for (Node node : lista_nodes) {
			System.out.println(node.getName() + " _ ");
		}

		for (int i = lista_nodes.size() - 1; i >= 0; i--) {
			lista_nodes_reverse.add(lista_nodes.get(i));
		}

//		teste(lista_nodes_reverse, 2, 4);

	}

	public static void teste(ArrayList<Node> lista, int n_root, int n_end) {

		String caminho = "";
		boolean flag = false;
		boolean achou_end = false;

		for (Node node : lista) {
			if (node.getName().equalsIgnoreCase("" + n_root)) {
				flag = true;
			}
			if (flag) {
				caminho += node.getName() + "-";
			}
			if (node.getName().equalsIgnoreCase("" + n_end)) {
				achou_end = true;
				break;
			}
		}

		if (achou_end == true && flag == true) {
			System.out.println("caminho reutiizado: " + caminho);
		} else {
			System.out.println("essa rota ainda nao foi calculada!");
		}
	}

}
