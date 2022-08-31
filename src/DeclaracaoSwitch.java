import java.util.Scanner;

public class DeclaracaoSwitch {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
       
        System.out.print("Digite sua nota: ");
        String nota = tec.nextLine().toUpperCase();

        switch(nota){
            case "A":
                System.out.println("Nota A, parabéns.");
                break;
            case "B":
                System.out.println("Nota B, Muito bem.");
                break;
            case "C":
                System.out.println("Nota C");
                break;
            case "D":
                System.out.println("Nota D.");
                break;
            default:
                System.out.println("Falha");    
        }

        // Versão simplificada do switch

        switch(nota){

            case "A", "B" ->{
                System.out.println("Parabéns");
                System.out.println("Muito bem");
            }
            case "C" -> System.out.println("Nota C");
            case "D" -> System.out.println("Nota D");
            default -> System.out.println("Erro");
        }

        // Assinalando valores usando uma expressão switch
        int num = 5;
        char group = switch (num){
            case 1, 2, 3 -> 'A';
            case 4, 5 -> 'B';
            default -> 'C';

        };








    }
}
