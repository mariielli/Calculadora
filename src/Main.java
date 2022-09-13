import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o número");
        int primeiroNumero = ler.nextInt();
        System.out.println("Informe o operador");
        String operador = ler.next();
        System.out.println("Informe o segundo número");
        int segundoNumero = ler.nextInt();
        System.out.println(primeiroNumero + operador + segundoNumero);
        calculo(primeiroNumero, operador, segundoNumero);
    }

    static void calculo(int primeiroNumero, String operador, int segundoNumero) {
        switch (operador) {
            case "+" -> System.out.println(primeiroNumero + segundoNumero);
            case "-" -> System.out.println(primeiroNumero - segundoNumero);
            case "*" -> System.out.println(primeiroNumero * segundoNumero);
            case "/" -> System.out.println(primeiroNumero / segundoNumero);
            default -> System.out.println("Operação inválida.");
        }
    }
}
