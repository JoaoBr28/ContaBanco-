public class ContaTerminal {

    public static void main(String[] args) {
        
        double saldo = 25;
        double valorSolicitado = 18;

        System.out.println(" Primeira tentativa de saque ");
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo atual: R$ " + saldo);

    
        
        saldo = 15;
        valorSolicitado = 22;

        System.out.println("\n### Segunda tentativa de saque ###");
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
