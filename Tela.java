import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;

public class Main extends JFrame implements ActionListener{

	private static final long serialVersionUID= 1L;
	private JLabel l_entrada,l_saida,vir1,vir2,l_base1,l_base2,l_int1,l_int2,l_frac1,l_frac2,esp1,esp2; //texto a ser exibido na tela
	private JTextField t_BaseEnt, t_BaseSaida, t_IntEnt, t_FracEnt,t_IntSai,t_FracSai;
	private JButton bOk;
	private JPanel pan1, pan2;
	private JFrame frame;
	
	public Main(){
		super("Projeto de CD");
	 
		JFrame frame = new JFrame("Projeto CD");
		JPanel pan1 = new JPanel (new GridLayout(4,5));
		JPanel pan2 = new JPanel (new BorderLayout());
		 
		l_entrada = new JLabel("Valor Que deseja converter");
		l_saida = new JLabel("Valor convertido");
		vir1 = new JLabel(",");
		vir2 = new JLabel(",");
		t_BaseEnt = new JTextField(2);
		t_BaseSaida = new JTextField(2);
		t_IntEnt = new JTextField(20);
		t_FracEnt = new JTextField(20);
		t_IntSai = new JTextField(20);
		t_FracSai = new JTextField(20);
		l_base1 = new JLabel("Base");
		l_base2 = new JLabel("Base");
		l_int1 = new JLabel ("Valor inteiro");
		l_int2 = new JLabel ("Valor inteiro");
		l_frac1 = new JLabel ("Valor fracionario");
		l_frac2 = new JLabel ("Valor fracionario");
		esp1 = new JLabel (" ");
		esp2 = new JLabel (" ");
		
		bOk = new JButton("Ok");
		
		
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container janela;
		janela = getContentPane();
		janela.add(pan2);
		pan2.add(pan1,BorderLayout.CENTER);
		pan2.add(bOk,BorderLayout.SOUTH);
		pan1.add(esp1);
		pan1.add(l_base1);
		pan1.add(l_int1);
		pan1.add(l_frac1);
		pan1.add(l_entrada);
		pan1.add(t_BaseEnt);
		pan1.add(t_IntEnt);
		//pan1.add(vir1);
		pan1.add(t_FracEnt);
		pan1.add(esp2);
		pan1.add(l_base2);
		pan1.add(l_int2);
		pan1.add(l_frac2);
		pan1.add(l_saida);
		pan1.add(t_BaseSaida);
		pan1.add(t_IntSai);
		//pan1.add(vir2);
		pan1.add(t_FracSai);
		bOk.addActionListener(this);
		
		t_IntSai.setEditable(false);
		t_FracSai.setEditable(false);
		
		
		setSize(800,180);
		setResizable(false);
	
	 
     }
	
	

	public static void main(String[]args){
		Main cd = new Main();
		cd.setVisible(true);
		
			
	}
	
	
	public void actionPerformed(ActionEvent e) {	
		
		if (e.getSource() == bOk){
			String numInt = t_IntEnt.getText(); //pega valores do campo inteiro e joga na variavel numInt
			String numFrac =t_FracEnt.getText();
			int baseInicial = Integer.parseInt(t_BaseEnt.getText());
			int baseConversao = Integer.parseInt(t_BaseSaida.getText());
			
				if (Converter(numInt,numFrac,baseInicial,baseConversao).equals("")){
					JOptionPane.showMessageDialog(null,"Erro, base(s) incorreta(s)!");
					
				}
					
				else{
					t_IntSai.setText(Converter(numInt,numFrac,baseInicial,baseConversao));
				}
		}	
			
		
	}
