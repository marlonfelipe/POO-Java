/**
 * 
 */
package proyecto_bytebank;

/**
 * @author Marlon
 *
 */
public class TestReferencia3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuentaDeDiego = new Cuenta();
		Cliente cliente = new Cliente();
		cuentaDeDiego.titular = new Cliente();
		cuentaDeDiego.titular.nombre = "Diego";
		
		
		System.out.println(cuentaDeDiego.titular.nombre);

	}

}
