public class Conversor {
	private String numBinario = "";
	
	public Conversor(){ //construtor vazio
	}
	
	public static String Converter(String numeroInt, String numeroFrac, int baseInicial, int baseConversao){
		int expoente, contador;
		int digito = 0; //substring
		int decimalInt = 0;
		int decimalFrac = 0;
		String numeroConvertido = "";
		String numeroString = "";
		
		//inicializando o expoente para converter numero inteiro para a base 10
		expoente = numeroInt.length() - 1;
		
		if (baseInicial < 2 || baseInicial > 20 || baseConversao < 2 || baseConversao > 20){
			return " ";
		}else{
			//convertendo parte inteira para decimal
			//contador - para identificar qual posição calcular da string, nao pode ultrapassar o tamanho da string digitada pelo usuário
			//expoente - calcular base 10 ----> PRECISA VER COMO FAZ PARTE FRACIONARIA
			for (contador = 0; contador < numeroInt.length(); contador++, expoente--) {
				digito = Integer.parseInt(numeroInt.substring(contador, (contador + 1)), 20);
				if (digito > baseInicial) {
					return " ";
				}else {
					decimalInt += digito * Math.pow(baseInicial, expoente);
				}
			}
			
			//convertendo a base fracionaria
			for(contador = 0, expoente = -1; contador < numeroFrac.length(); contador++, expoente--){
				digito = Integer.parseInt(numeroFrac.substring(contador, (contador + 1)), 20);
				if (digito > baseInicial){
					return " ";
				}else{
					decimalFrac += digito * Math.pow(baseInicial, expoente);
				}
			}
		}
        
        	//converter parte inteira para a base pretendida -- CONVERTENTO SÓ PARTE INTEIRA AINDA
        	while (decimalInt >= baseConversao) {
        		numeroConvertido += Letras(decimalInt % baseConversao);
            		decimalInt /= baseConversao;
        	}
        	numeroConvertido += Letras(decimalInt % baseConversao);
        
        	//inverter a String da parte inteira
        	for (contador = numeroConvertido.length() - 1; contador >= 0; contador--) {
        		numeroString += numeroConvertido.charAt(contador);
        	}
        	return numeroString;
    	}
	
	//para quando converter Hexa e Vigesimal
	private static String Letras(int x) {
		switch (x) {
			case 10:
				return "A";
			case 11:
				return "B";
			case 12:
				return "C";
			case 13:
				return "D";
			case 14:
				return "E";
			case 15:
				return "F";
			case 16:
				return "G";
			case 17:
				return "H";
			case 18:
				return "I";
			case 19:
				return "J";
			default:
				return String.valueOf(x);
		}
	}
}
