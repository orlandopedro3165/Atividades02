
import java.util.Scanner;

public class Questao5 {
    
    public static void main(String[] args) {
        //programa vai ler idade 5 pessoas, mostrar qntas maiores ou iguais a 18 e qntas menores
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite as 5 idades: ");
        int idade1 = ler.nextInt();
        int idade2 = ler.nextInt();
        int idade3 = ler.nextInt();
        int idade4 = ler.nextInt();
        int idade5 = ler.nextInt();
        int contar = 0;
        int contarMenos = 0;
        ler.close();
        for(int i = 1; i <= 5; i++){
            if(idade1 >= 18){
                contar++;
            }else{
                contarMenos++;
            }if( idade2 >= 18){
                contar++;
            }else{
                contarMenos++;
            }if( idade3 >= 18){
                contar++;
            }else{
                contarMenos++;
            }if(idade4 >= 18){
                contar++;
            }else{
                contarMenos++;
            }if(idade5 >= 18){
                contar++;
            }else{
                contarMenos++;
            }
            System.out.println("Idades maiores que 18 = "  + contar);
            System.out.println("Idades menores  que 18 = " + contarMenos);
            break;
        }
    }
}
