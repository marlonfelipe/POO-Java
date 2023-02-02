package proyecto_bytebank;

public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		miCuenta.depositar(200);
		
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		
		
		if (cuentaDeJimena.transferir(400, miCuenta)) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No es posible");
		}
		
		//cuentaDeJimena.transferir(400, miCuenta);
		
		System.out.println(cuentaDeJimena.saldo);
		System.out.println(miCuenta.saldo);
		
	
	}
	
}
