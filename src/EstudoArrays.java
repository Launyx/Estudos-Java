import java.util.Arrays;

public class EstudoArrays {
    public static void main(String[] args) {
        
                /*
        //Arrays
        int[] userAge1;
        userAge1 = new int[]{22, 22, 24, 27, 28};

        int[] userAge2 = {22, 22, 24 ,27, 28};

        int[] userAge3 = new int[4];

        userAge1[0] = 33;
        userAge1[3] = userAge1[3] + 40;

        System.out.println(userAge1[3]);
        */


        /*
        //.equals() de Arrays (precisa da biblioteca java.util.Arrays)
        int[] arr1 = {0, 2, 4, 6, 8, 10};
        int[] arr2 = {0, 2, 4, 6, 8, 10};
        int[] arr3 = {10, 8, 6, 4, 2, 0};

        boolean result1 = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr1, arr3);
        System.out.println(result1 + "\n" + result2);
        */



        /*
        //.copyOfRange() copia o conteudo de uma array para outra
        int[] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};

        int[] dest = Arrays.copyOfRange(source, 3, 7);
        System.out.println(Arrays.toString(dest));
        */




        /*
        //.toString() mostra o conteúdo de uma array, todos os indices
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));
        */



        /*
        //.sort() ordena a Array em ordem crescente
        int[] numbers2 = {12, 1, 5, -2, 16, 14};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        */



        /*
        //.binarySearch() permite procurar um valor especifico em uma Array ordenada
        int[] myInt = {21, 23, 34, 45, 56, 78, 99};

        int foundIndex = Arrays.binarySearch(myInt, 78);
        System.out.println(foundIndex);
        // Se um número não está na Array é retornado "-" como indicativo de tal e o número
        // corresponde a qual posição (+1) ele estaria se existisse
        // EX a seguir, mostra número 4 mas a posição corre seria a 3
        int foundIndex2 = Arrays.binarySearch(myInt, 39);
        System.out.println(foundIndex2);
        */



        /*
        // Para obter o tamanho de uma Array não se usa () depois de lenght, pois é usado um campo e não um metodo
        int[] userAge = {21, 22, 26, 32, 40};
        System.out.println(userAge.length);
        */

    }
}
