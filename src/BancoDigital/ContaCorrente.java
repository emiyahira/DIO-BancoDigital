package BancoDigital;

public class ContaCorrente extends Conta /* Heranca - herdou da clase Conta */ {

    @Override
    public void imprimirSaldo() {

        System.out.println("==========================   CONTA CORRENTE  =================================");
        super.imprimirDetalhes();

    }

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

}
