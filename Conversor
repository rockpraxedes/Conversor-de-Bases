public class Conversor {
	private String numBinario = "";
	
	public Conversor(){
	}
	
	public String DecimalParaQualquerBase(double numDecimal, int base){
		if (numDecimal == 0){
			return "0";
		}
		
		int inteiro;
		double fracionario;
		
		inteiro = (int)numDecimal;
		fracionario = Math.round((numDecimal - (int)numDecimal)*100);
		
		
        while(inteiro > 0) {
            numBinario = (numDecimal % base) + numBinario;
            numDecimal /= base;
        }
        
        if (fracionario != 0){
        	while (fracionario > 50){
        		// colocar a conta para parte fracionaria
        		// pelo que eu tava vendo no codigo do victor, tem que converter pra char
        		// acho que pela mesma "regra" do string.. nao tenho certeza
        	}
        	
        	
        }
        fracionario /= 100;
		return numBinario;
	}
