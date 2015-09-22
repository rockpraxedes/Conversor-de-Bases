public class Conversor {
	private String numBinario = "";
	
	public Conversor(){ //construtor vazio
	}
	
	public String DecimalParaQualquerBase(double numDecimal, int base){
		String resultadoBinarioInteiro = "";
		String resultadoBinFrac = "";
		int inteiro, inteiroFrac;
		double fracionario;
		
		//separando a parte inteira
		inteiro = (int)numDecimal;
		
		//separando parte fracionaria
		fracionario = Math.round((numDecimal - (int)numDecimal)*100);
		fracionario /= 100;
		
		if (numDecimal == 0 && base > 0){
			return "0"; //se o numero a ser convertido for = 0, o resultado é 0 né haha
		}else if (base > 0){
			while(inteiro > 0) { //convertendo parte inteira do número
				resultadoBinarioInteiro = (inteiro % base) + resultadoBinarioInteiro;
				inteiro /= base;
			}
			if (fracionario != 0 && fracionario > 0){
				while (fracionario > 0){ //verificando se o numero nao é inteiro
					// multiplica 0.XX, pega a parte inteira do resultado
					// ARRUMEI ESSE CARALHO!! UFA
					fracionario *= base;
					inteiroFrac = (int)fracionario;
					resultadoBinFrac = inteiroFrac + resultadoBinFrac;
					fracionario = Math.round((fracionario - (int)fracionario)*100);
					fracionario /= 100;
				}
			}
		}else{
			System.out.println("Base digitada é inválida. Favor escolher uma base positiva.");
		}
		return resultadoBinarioInteiro + resultadoBinFrac; // ta certo esse retorno aqui? nao tenho certeza
	}
