package ex04;
import java.util.Scanner;
//entrada de dados
public class Ex04 {
    public static void main(String[] args) {
Scanner ent = new Scanner(System.in);
int senha;
        System.out.println("Digite a sua senha");
        senha = ent.nextInt();
        if ((senha == 123)) {
            //== para mostrar igualdade e não atribuição
                System.out.println("ACESSO PERMITIDO");
            } else if (senha != 123){
                //!= diferente
                System.out.println("ACESSO NEGADO");
            }
    }
    
}
