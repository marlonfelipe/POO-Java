/**
 * 
 */
package proyecto_bytebank;

/**
 * @author Marlon
 *
 */
public class PruebaAcceso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta();
		cuenta.setAgencia(22);
		cuenta.depositar(400);
		cuenta.retirar(300);		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}

}
