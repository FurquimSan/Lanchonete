package Pedidos;

import java.util.Scanner;

public class Suco implements Bebida {
	Scanner leitorTexto = new Scanner (System.in);
	String a;
	String b;

	@Override
	public void sabor() {
	System.out.println("Solicitar o sabor do suco ao usuário");
	a = leitorTexto.next();
	System.out.println("Preparando o suco " + a);
	}

	@Override
	public void comGelo() {
		System.out.println("Preguntar ao usuário se o mesmo quer o suco gelado");
		b = leitorTexto.next();
		if (b.equalsIgnoreCase("Sim")) {
			System.out.println("Suco gelando...");
		}if (b.equalsIgnoreCase("Não")) {
			System.out.println("Servir suco");
		}
		
	}

}
