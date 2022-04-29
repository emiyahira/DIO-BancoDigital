package BancoDigital;

public class ContaPoupanca extends Conta /* Heranca - herdou da clase Conta */ {

    @Override
    public void imprimirSaldo() {

        System.out.println("==========================   CONTA POUPANCA  =================================");
        super.imprimirDetalhes();

    }

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

}
