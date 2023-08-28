import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Will Banks";
        String tipoConta = "Corrente";
        Double  saldo = 1499.99;
        int opcao = 0;

        System.out.println("******************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n******************************");

        String menu = """
                ** Digite sua opcao **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();


            if(opcao == 1){
                System.out.println("O saldo atualizado e: R$" + saldo);
            } else if(opcao == 2){
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Nao a saldo para realizar a transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo R$"  + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo R$"  + saldo);
            } else if (opcao != 4) {
                System.out.println("Opcao Invalida");
            }
        }

    }
}
