/**
 * 
 */
package proyecto_bytebank;

/**
 * @author Marlon
 *
 */
public class PruebaEncapsulamiento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("sff34f3");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());

	}

}
