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












    }
}
