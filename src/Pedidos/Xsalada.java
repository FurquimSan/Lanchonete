package Pedidos;

import java.util.Scanner;

public class Xsalada implements Comida {
	Scanner leitorDec = new Scanner (System.in);
	Scanner leitorTexto = new Scanner (System.in);
	String a;

	@Override
	public void tipoDePao() {
		System.out.println("X-salada tem pão de forma");
		
	}
	
	public void xSalada(String tipoDeQueijo, String salada) {
		System.out.println("Pergunte ao cliente qual queijo o mesmo deseja");
		tipoDeQueijo = leitorTexto.next();
		System.out.println("Pergunte ao cliente qual salada o mesmo deseja");
		salada = leitorTexto.next();
		System.out.println("O tipo de queijo para x-Salada é " + tipoDeQueijo);
		System.out.println( tipoDeQueijo + " tomate, alface e " + salada);
	}

	@Override
	public void esquentar() {
		System.out.println("O cliente quer esquentar o lanche?");
		a = leitorDec.next();
		if (a.equalsIgnoreCase("Sim")) {
			System.out.println("Lanche esquentar");
			
		}if(a.equalsIgnoreCase("Não")) {
			System.out.println("Apenas monte o lanche");
		}
		
		
	}

}


