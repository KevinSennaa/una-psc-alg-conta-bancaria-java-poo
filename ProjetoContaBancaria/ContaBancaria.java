import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Dados dados = new Dados();

            System.out.println("Conta Bancaria");
        
            System.out.println("Informe seu nome: ");
            dados.setNome(scanner.next());

            System.out.println("Informe o número da conta: : ");
            dados.setNumeroConta(scanner.nextInt());

            System.out.println("Informe o saldo inicial: ");
            dados.setSaldoInicial(scanner.nextDouble());

            System.out.println("Conta bancária criada com sucesso. ");

            System.out.println("Qual serviço deseja fazer:\n(1) Depositar \n(2) Sacar \n(3) Mostra Saldo");
            int opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("Deposite o valor que deseja depositar: ");
                double deposito = scanner.nextDouble();
                dados.setSaldoInicial(dados.getSaldoInicial() + deposito);
                System.out.println("O saldo após o deposito é: " + dados.getSaldoInicial());
            }

            if(opcao == 2){
                System.out.println(" Digite o valor que deseja sacar: ");
                double sacar = scanner.nextDouble();
                if(sacar > dados.getSaldoInicial()){
                    System.out.println("Saldo insuficiente para realizar a operação. ");
                }
                else if(sacar > 5000){
                    System.out.println("Valor do saque acima do permitido! ");
                }
                else{
                    dados.setSaldoInicial(dados.getSaldoInicial() - sacar);
                }    
            }

            if(opcao == 3){
                System.out.println("O seu saldo é de: " + dados.getSaldoInicial());
            }
            
        scanner.close();    
    }
    
}
