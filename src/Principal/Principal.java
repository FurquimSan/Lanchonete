package Principal;

import Pedidos.Suco;
import Pedidos.Xbacon;
import Pedidos.Xsalada;

public class Principal {

	public static void main(String[] args) {
		Xbacon xbacon1 = new Xbacon();
		xbacon1.xbacon("Bacon", "Tomate");
		xbacon1.esquentar();
		Xsalada xsalada1 = new Xsalada();
		xsalada1.xSalada(null, null);
		xsalada1.esquentar();
		Suco suco1 = new Suco();
		suco1.sabor();
		suco1.comGelo();
		Suco suco2 = new Suco();
		suco2.sabor();
		suco2.comGelo();
		
	

}
}