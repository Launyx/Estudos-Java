import java.util.Scanner;



public class ManipulacaoString {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        
        /*
        //.toUppercase() / .toLowercase()  Transforma strings em caixa alta ou caixa baixa

        System.out.println("Qual o seu nome? ");
        String nome = tec.nextLine();
        String nomeMaiusculo = nome.toUpperCase();
        String nomeMinusculo = nome.toLowerCase();

        System.out.println(nomeMaiusculo);
        System.out.println(nomeMinusculo);
        */




        /*
        //.substring()  Pega parte determinada de uma string

        String message = "Hello World";
        String subString = message.substring(6);
        String secondSubstring = message.substring(1, 8);
        System.out.println(subString +"\n"+ secondSubstring);

        //charAt()  Pega um único caractere de uma string

        char mychar = message.charAt(2);
        System.out.println(mychar);
        */
        


        /*
        //.equals()  Compara se duas strings são iguais
        boolean equalOrnot = "Im Luan".equals("Im Luan");
        boolean equalOrnot2 = "Im Luan".equals("Hello World");
        System.out.println(equalOrnot + "\n" + equalOrnot2);
        */



        /*
        //.split()  Separa uma string em um array com determinado argumento
        String nomes = "Luan, Lucas, André, Raul, Eduardo";
        String[] nomesSplit = nomes.split(",");
        System.out.println(Arrays.toString(nomesSplit));
        System.out.println(nomesSplit[0]);
        */

    }
}
