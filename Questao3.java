import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //ler 2 numeros e o sistema escreve os numeros do intervalo
        System.out.println("digite um numero: ");
        int n1 = ler.nextInt();
        System.out.println("Digite outro numero:" );
        int n2 = ler.nextInt();
        ler.close();
        do{
            n1++;
            System.out.println( n1 );
        }    while(n1 < n2 );
        

    }
}
