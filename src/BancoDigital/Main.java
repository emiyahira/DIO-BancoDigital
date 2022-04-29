package BancoDigital;

public class Main {

    public static void main ( String[] args ) {

        Cliente cliente1 = new Cliente();

        cliente1.setCodigo("001-Cta");
        cliente1.setNome("EMiyahira");

        Conta ctacorrente1 = new ContaCorrente(cliente1);
        Conta ctapoupanca1 = new ContaPoupanca(cliente1);

        ctapoupanca1.depositar(100);
        ctacorrente1.depositar(200);

        ctacorrente1.imprimirSaldo();
        ctapoupanca1.imprimirSaldo();

        ctacorrente1.retirar(50);
        ctacorrente1.transferir(75,ctapoupanca1);

        ctacorrente1.imprimirSaldo();
        ctapoupanca1.imprimirSaldo();
    }
}