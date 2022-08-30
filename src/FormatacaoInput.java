import java.net.SocketTimeoutException;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class FormatacaoInput {
    public static void main(String[] args) {
        
        /*
        System.out.println("The answer for 5.45 divides by 3 is " + (5.45/3));
        // printf()
        System.out.printf("The answer for %.3f divided by %d is %.2f.", 5.45, 3, 5.45/3);
        */

        //CONVERSORES
        //conversor de inteiro: d
        System.out.printf("%d", 12);
        
        //conversor de nova linha: n
        System.out.printf("%d%n%d", 12, 3);

        // bandeira de largura, define a largura total do print
        System.out.printf("%8d", 12);
        System.out.printf("%8.2f", 12.4);

        // separador de milhar, separa numeros em milhar
        System.out.printf("%,d", 12345);
        System.out.printf("%,.2f", 12345.56789);
    }
}
