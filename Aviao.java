package exemploconstrutores;

public class Aviao {
	
	public String fabricante;
	public String modelo;
	public String proprietario;
	String cor;
	private int capacidadeCombustivel;
	//==============================================
	
			
	public String getProprietario() {
		return proprietario;
		
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(int capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}


	
	Aviao () { 
		System.out.println("A classe Aviao foi instanciada.");
		capacidadeCombustivel = 800;
	}
	
	void imprimirOi() {
		System.out.println("Ola Seja bem vindo Sérgio");
	}
	
	 

}
