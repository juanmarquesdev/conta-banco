package entities;
/**
 * <h1>ContaBancaria</h1>
 * <p>Essa classe representa a conta bancária de uma pessoa</p>
 * 
 * @author Juan Marques
 * @version 1.0
 * @since 24/05/2024
 */
public class ContaBancaria {

    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    /**
     * Esse é o método construtor da classe para se inicializar o objeto ContaBancaria
     * @param numero Número da conta
     * @param agencia Agência da conta
     * @param nomeCliente Nome do cliente
     * @param saldo Saldo da conta
     */
    public ContaBancaria(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque'.";
    }

    
    
}
