/**
 * 
 */
package proyecto_bytebank;

/**
 * @author Marlon
 *
 */
public class TestReferencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		
		System.out.println("Saldo primera Cuenta : " + primeraCuenta.saldo);
		
		System.out.println("Saldo Segunda Cuenta : " + segundaCuenta.saldo);
		
		segundaCuenta.saldo += 400;
		System.out.println("Saldo primera Cuenta : " + primeraCuenta.saldo);

	}

}
