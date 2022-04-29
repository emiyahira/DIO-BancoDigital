package BancoDigital;

import java.util.Date;

public interface iConta {

    /* Classe Abstratas - delegar/solicitr uma implementacao na classe que extendeu que sozinha nao consegue resolver */

    void retirar( double valor );

    void depositar( double valor );

    void transferir( double valor , Conta contaDestino );

    void imprimirSaldo();

}
