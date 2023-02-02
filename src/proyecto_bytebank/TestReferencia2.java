/**
 * 
 */
package proyecto_bytebank;

/**
 * @author Marlon
 *
 */
public class TestReferencia2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "6556456";
		diego.telefono = "54655645";
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.agencia = 1;
		cuentaDeDiego.titular = diego;
		
		System.out.println(cuentaDeDiego.titular.documento);
		System.out.println(diego);

	}

}
