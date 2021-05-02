package museu;

public class Node {

	private int aresta_esquerda;
	private int aresta_direita;
	
	private Node esquerdo;
	private Node direito;
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAresta_esquerda() {
		return aresta_esquerda;
	}
	public void setAresta_esquerda(int aresta_esquerda) {
		this.aresta_esquerda = aresta_esquerda;
	}
	
	public int getAresta_direita() {
		return aresta_direita;
	}
	public void setAresta_direita(int aresta_direita) {
		this.aresta_direita = aresta_direita;
	}
	
	public Node getEsquerdo() {
		return esquerdo;
	}
	public void setEsquerdo(Node esquerdo) {
		this.esquerdo = esquerdo;
	}
	
	public Node getDireito() {
		return direito;
	}
	public void setDireito(Node direito) {
		this.direito = direito;
	}
	
	
}
