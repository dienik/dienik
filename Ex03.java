package ex03;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
    Scanner ent= new Scanner (System.in);
    int valor;
    System.out.println("Digite o valor: ");
        valor = ent.nextInt();
             if( valor >= 0){
                System.out.println("O valor é positivo.");
            } else if(valor < 0){
                System.out.println("O valor é negativo");
    }
    }
}
