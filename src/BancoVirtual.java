import java.util.Scanner;

public class BancoVirtual {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeCliente = "Luis Henrique da Silva Nunes";
        double saldoDaConta = 2500;

        while (true) {
            System.out.println("**************************");
            System.out.println(String.format("""
                    Nome: %s
                    Tipo da conta: Corrente
                    Saldo: R$%.2f""", nomeCliente, saldoDaConta));
            System.out.println("**************************\n");
            System.out.println("Operações\n");

            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair\n");
            System.out.println("Digite a opção desejada:");
            int escolha = leitura.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Saldo disponivel: R$" + saldoDaConta);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorReceber = leitura.nextDouble();
                    saldoDaConta += valorReceber;
                    System.out.println("Saldo atualizado: R$" + saldoDaConta);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir:");
                    double valorTransferir = leitura.nextDouble();

                    if (valorTransferir > saldoDaConta){
                        System.out.println("Saldo insuficiente para realizar a transferencia. Por favor, realize outra tranferencia");
                    } else {
                        saldoDaConta -= valorTransferir;
                        System.out.println("Transferencia concluida. Saldo disponivel: R$" + saldoDaConta);
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    leitura.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Escolha uma opção valida!!");


            }

        }

    }
}

