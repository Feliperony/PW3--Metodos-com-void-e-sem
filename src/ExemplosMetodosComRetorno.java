
public class ExemplosMetodosComRetorno {
	
	public static int cubo(int num) {
		
		return num * num * num;
	}
	public static void main(String[] args) {
		
//		int resultado = cubo(3);
//		System.out.println(resultado);
//		
//		String resultado2 = concatenar("Rony","Sobral");
//		System.out.println(resultado2);
//		
//		int resultado3 = sinal(-10);
//		System.out.println(resultado3);
//		
//		boolean resultado4 = ehdiasemana("sabado");
//		System.out.println(resultado4);
		
		boolean posso = possoirbanco("Segunda",5);
		System.out.println(posso);
	}
	public static String concatenar(String v1, String v2) {
		
		return v1 + " " + v2;
	}
	public static int sinal(int num) {
		if(num > 0) {
			
			return 1;
			
		}else if(num < 0) {
			
			return -1;
			
		}else {
			
			return 0;
			
		}
	}
	public static boolean ehdiasemana(String dia) {
//			if(semana == "Segunda") {
//				return true;
//			} else if(semana == "Terca") {
//				return true;
//			}else if(semana == "Quarta") {
//				return true;
//			}else if(semana == "Quinta") {
//				return true;
//			}else if(semana == "Sexta") {
//				return true;
//			}else{
//				return false;
//			}
		
		if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo")) {
			return false;
		} else {
			return true;
		}
		
	}
	public static boolean possoirbanco(String dia, int hora) {
		if(dia.equalsIgnoreCase("Segunda") || (dia.equalsIgnoreCase("Terca")) || (dia.equalsIgnoreCase("Quarta")) || (dia.equalsIgnoreCase("Quinta")) || (dia.equalsIgnoreCase("Sexta"))) {
			if(hora >= 10 && hora <= 16) {
				return true;
			} else {
				return false;
			}
			
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
