package revisaopa_univates;

import view.Login;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Exercicio1: Simular uma transação entre contas bancárias, utilizando a classe
 * Conta juntamente com as suas propriedades.
 *
 * @author jonasdhein
 */
public class Exercicio1 {

    //metódo principal
    public static void main(String[] args) {
        
        System.out.println("Início do sistema");
        System.out.println("NETBEANS");

        Conta conta1 = new Conta();
        conta1.setConta(365);
        conta1.setNome("Jonas Dhein");
        conta1.setSaldo(1000.00);

        Conta conta2 = new Conta();
        conta2.setConta(666);
        conta2.setNome("Lucas Pandolfo");
        conta2.setSaldo(100000.00);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());

        System.out.println("Transf. $200 de Lucas para Jonas");
        transferencia(200d, conta2, conta1);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        
        Login telaLogin = new Login();
        telaLogin.setVisible(true);

    }

    private static void transferencia(double valor, Conta origem, Conta destino) {
        try {
            origem.saque(valor);
            destino.deposito(valor);

        } catch (Exception e) {
            System.out.println("ERRO:" + e.getMessage());
        }
    }

}
