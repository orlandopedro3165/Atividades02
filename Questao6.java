import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        //ler 5 numeros, mostrar o menor e o maior, a soma e a media dos numeros
        Scanner ler = new Scanner(System.in);
        System.out.println(" Digite os 5 numeros: ");
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        int n3 = ler.nextInt();
        int n4 = ler.nextInt();
        int n5 = ler.nextInt();
        int somar = 0;
        int media = 0;
        for(int i = 0; i  < 1; i++){
            if(n1>n2 && n1>n3 && n1>n4 && n1>n5){
                System.out.println( + n1 + " é o maior numero. ");
            }if(n1<n2 && n1<n3 && n1<n4 && n1<n5){
                System.out.println( + n1  + "é o menor numero.");
            }if(n2>n1 && n2>n3 && n2>n4 && n2>n5){
                System.out.println( + n2+  " é o maior numero.");
            }if(n2<n1 && n2<n3 && n2<n4 && n2<n5){
                System.out.println( + n2 + "é o menor numero.");
            }if(n3>n1 && n3>n2 && n3>n4 && n3>n5){
                System.out.println(+ n3 + " é o maior numero.");
            }if(n3<n1 && n3<n2 && n3<n4 && n3<n5){
                System.out.println(+ n3 + " é o menor numero.");
            }if(n4>n1 && n4>n2 && n4>n3 && n4>n5){
                System.out.println(+ n4 + "é o maior numero.");
            }if(n4<n1 && n4<n2 && n4<n3 && n4<n5){
                System.out.println(+ n4 + " é o menor numero.");
            }if(n5>n1 && n5>n2 && n5>n3 &&n5>n4){
                System.out.println(+ n5 + "é o maior numero.");
            }else{
                System.out.println(+ n5 + "é o menor numero.");
                break;
            }
            int soma = n1 + n2  + n3 + n4 + n5;
            System.out.println("A soma dos numeros é = " + soma);
            int mediar = soma / 5;
            System.out.println(" a media dos numeros é = " + mediar);
        }
    }
}
