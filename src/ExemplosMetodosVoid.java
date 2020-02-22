
public class ExemplosMetodosVoid {

	public static void main(String[] args) {
		saudacao(11);
		dobro(9);
		metade(5);
		tamanho("rony");
		soma(5,4);
	}
	public static void saudacao(int periodo) {
		
		if (periodo == 1) {
			System.out.println("Bom dia!");
		} else if (periodo == 2) {
			System.out.println("Boa Tarde!");
		} else if (periodo == 3) {
			System.out.println("Boa Noite !");
		} else {
			System.out.println("|---------------------|");
			System.out.println("| ~(°-°~) Olá (~°-°)~ |");
			System.out.println("|_____________________|");
		}
		
		//System.out.println("Boa Noite!");
		
	}
	public static void dobro(int valor) {
		
		int resultado = valor * 2;
		System.out.println("._____________________");
		System.out.println("| "+"Dobro Resultado: " + resultado);
	}
	public static void metade(double valor) {
		
		double resultado = valor /2;
		System.out.println("| "+"Metade Resultado: " + resultado);
	}
	public static void tamanho(String texto) {
		
		System.out.println("| " + "Tamanho Resultado : " + texto.length());
	}
	public static void soma(int valor, int valor2 ) {
		
		int resultado = valor + valor2;
		System.out.println("| "+"Soma Resultado: " + resultado);
	}
	
	
	
	
	
	
}
