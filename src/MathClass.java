public class MathClass {
    public static void main(String[] args) {
        
        double x = 3.14;
        double y = -10;

        double z1 = Math.max(x, y); //Maior número
        double z2 = Math.min(x, y); //Menor número
        double z3 = Math.abs(y); //módulo do número
        double z4 = Math.sqrt(x); //Raiz quadrada do número
        double z5 = Math.round(x); //Arredonda o número
        double z6 = Math.ceil(x); //Arredonda o número para cima
        double z7 = Math.floor(x); //Arredonda o número para baixo

        System.out.println(z1);

    }
}
