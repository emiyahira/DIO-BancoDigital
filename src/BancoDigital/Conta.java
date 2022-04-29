package BancoDigital;

/* uma classe abstrata nao pode ser instanciada */
/* Polimorfismo - e a capacidade de um objeto ser referenciado de varias formas */

public abstract class Conta implements iConta {

    /* default - visivel somente no pacote */
    /* private - somente dessa classe */
    /* public - todas as classes */
    /* protected - essa classe e todas classes filhas extendidas - relacao com heranca */

    private static final int AGENCIA_PADRAO = 666;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() { return agencia; }

    public int getNumero() { return numero; }

    public double getSaldo() { return saldo; }

    @Override
    public void retirar(double valor) { saldo -= valor; }

    @Override
    public void depositar(double valor) { saldo += valor; }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.retirar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDetalhes() {
        System.out.print( String.format("Cliente: %s", this.cliente.getCodigo()) );
        System.out.print( " - " );
        System.out.println( String.format(" %s", this.cliente.getNome()) );
        System.out.println( String.format("Agencia: %d", this.agencia) );
        System.out.println( String.format(" Numero: %d", this.numero) );
        System.out.println( String.format("  Saldo: %.2f", this.saldo) );
    }

}
