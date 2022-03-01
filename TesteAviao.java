package exemploconstrutores;

public class TesteAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao A320;
		A320 = new Aviao();
		
		A320.fabricante = "EADS Airbus Aviao potente";
		A320.modelo = "AIRBUS A320";
		A320.cor = "Preto/BRANCO/COM LISTRAS AMARELAS";
		A320.proprietario = "RsTecnologia";
		
		A320.imprimirOi();
		System.out.println("Fabricante: " + A320.fabricante
				+ "\n Modelo: " + A320.modelo + "" + " \n COR "+ A320.cor 
				+ "\n Proprietario do Projeto:" + " "
				+ A320.proprietario + " \n" +
				"\n Capacidade de combustivel:" + A320.getCapacidadeCombustivel());

	}
	
	

}
