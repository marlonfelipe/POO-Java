/**
 * 
 */
package proyecto_bytebank;

/**
 * @author Marlon
 *
 */
public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	
	public void depositar(double valor){
		this.saldo = this.saldo + valor;

	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, 
								Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
		
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setAgencia(int nuevaAgencia){
		if (agencia > 0) {
			this.agencia = nuevaAgencia;
		} else {
			System.out.println("NO están permitidos valores negativos");
		}
	
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

}
