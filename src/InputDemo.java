import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int inteiro = Integer.parseInt(input.nextLine());
        System.out.printf("\nVocê digitou %d.%n%n", inteiro);

        System.out.print("Digite um número racional: ");
        double racional = Double.parseDouble(input.nextLine());
        System.out.printf("\nVocê digitou %.2f.%n%n", racional);

        System.out.print("Digite um texto: ");
        String texto = input.nextLine();
        System.out.printf("Você digitou \"%s\".%n%n", texto);


    }
}
