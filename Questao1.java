import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        //ler um numero, escrever a tabuada 1 a 10
        Scanner ler = new Scanner(System.in);
        System.out.println("digite numero: ");
        int numero = ler.nextInt();
        int contar = 1;
        ler.close();
         while (contar <= 10){
            System.out.print( contar );
            int resultado = contar * numero;
            System.out.println(" * " + numero + " = " + resultado);
            contar++;
            //int resultado = contar * numero;
        } 
    }
}
