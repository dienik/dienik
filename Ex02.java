package ex02;
//verificar se o valor é maior ou menor que 10
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
   Scanner ent = new Scanner(System.in);
   int valor;
        System.out.println("Digite o valor: ");
        valor = ent.nextInt();
    if( (valor >10) ){
        System.out.println("É maior que 10");
            } else if(valor < 10){
                System.out.println("É menor que 10");
   
    }
    }
}
