import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        // Exibir mensagens ao usuario

        System.out.println("Seja bem vindo");
        System.out.println("Digite 1 para criar conta");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Digite o numero da sua conta: ");
            int numero = sc.nextInt();
            System.out.println("Digite a sua agencia com o digito: ");
            String agencia = sc.next();
            System.out.println("Digite o seu nome: ");
            String nome = sc.next();
            System.out.println("Digite o seu saldo: ");
            float saldo = sc.nextFloat();

            System.out.println("Numero: " + numero);
            System.out.println("Agencia: " + agencia);
            System.out.println("Nome Cliente: " + nome);
            System.out.println("Saldo: " + saldo);
        }else{
            System.out.println("Opcão invalida");
        }
        System.out.println("Até mais");
    }
    
}
