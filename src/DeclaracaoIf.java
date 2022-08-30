import java.util.Scanner;

public class DeclaracaoIf {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("\nDigite sua idade: ");
        int idadeUsu = Integer.parseInt(tec.nextLine());

        if(idadeUsu < 0 || idadeUsu > 100){

            System.out.println("Idade inválida.");
            System.out.println("Sua idade deve ser entre 0 e 100.");

        }
        else if(idadeUsu < 18){
            System.out.println("Sinto muito, você é menor de idade.");
        }
        else if(idadeUsu < 21){
            System.out.println("Você precisa da concientização dos seus pais.");


        }
        else{
            System.out.println("Parabéns!");
            System.out.println("Você pode se registrar para o evento!");
        }


        // Operador ternário (?)
        int num = 10 == 3 ? 10 : 3;
        System.out.println(num);

    }
}
