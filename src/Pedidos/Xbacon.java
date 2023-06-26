package Pedidos;

import java.util.Scanner;

public class Xbacon implements Comida {
	Scanner leitorDec = new Scanner (System.in);
	String a;

	@Override
	public void tipoDePao() {
		System.out.println("X-bacon tem pão defumado");
		
	}
	
	public void xbacon(String tipoDeCarne, String salada) {
		System.out.println("O tipo de carne para x-bacon é bacon de porco");
		System.out.println("Xbacon tem salada");
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
