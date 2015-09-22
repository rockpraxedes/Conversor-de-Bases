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
		
		try{
			if (numDecimal == 0){
				return "0"; //se o numero a ser convertido for = 0, o resultado é 0 né haha
			}else{
			        while(inteiro > 0) { //convertendo parte inteira do número
			        	resultadoBinarioInteiro = (inteiro % base) + resultadoBinarioInteiro;
			            inteiro /= base;
			        }
			        
			        if (fracionario != 0 && fracionario > 0){ //verificando se o numero nao é inteiro
			        	while (fracionario > 0){ // convertendo a parte fracionaira
			        		// multiplica 0.XX, pega a parte inteira do resultado
			        		fracionario *= base;
			        		inteiroFrac = (int)fracionario;
			        		fracionario = Math.round((fracionario - (int)fracionario)*100);
			        		fracionario /= 100;
			        		resultadoBinFrac = Double.toString(fracionario);
			        		// precisa verificar se ta certo esse bang aqui
			        	}        	       	
			        }
				}
		}
		catch (Exception e){
			if (base == 0 || base < 0){ // vai que o engraçadinho coloca base 0 pra testar né ahaha
				System.out.println(e.getMessage() + "/n Base digitada é inválida. Favor escolher uma base positiva.");
			}
		}
		return resultadoBinarioInteiro + resultadoBinFrac; // ta certo esse retorno aqui? nao tenho certeza
	}
