import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um valor para o cateto oposto: ");
        int co = tec.nextInt();

        System.out.println("Digite um valor para o cateto adjacente: ");
        float ca = tec.nextFloat();

        double resultado = Math.hypot(co, ca);
        
        System.out.println("A hipotenusa de " + co + " e " + ca + " equivale à " + resultado);

    }
}
