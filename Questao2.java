import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        //ler msg e um numero, repetir a msg de 
        //acordo com o numero digtado.
        Scanner ler = new Scanner(System.in);
        System.out.println(" digite a mensagem: ");
        String mensagem = ler.nextLine();
        System.out.println("digite numero: ");
        int numero = ler.nextInt();
        ler.close();
        for(int i = 1; i <= numero; i++){
            System.out.println( numero + " " + mensagem);
        }
    }
}
