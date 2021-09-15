package ex05;
//As maçãs custam R$ 0,30 a unidade ser forem compradas menos do que uma dúzia,
//e R$ 0,25 ser forem compradas pelo menos doze. Escreva um algoritmo que leia 
//o número de maçãs compradas, calcule e escreva o valor total da compra. 
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    double apple;
        System.out.println("Digte o número de maçãs a serem compradas: ");
        apple = ent.nextInt();
                if (apple >=12){
                    apple = (apple * 0.25);
                    System.out.println("O valor com desconto é R$"+apple+".");
                }else if (apple < 12){
                    apple = (apple * 0.30);
                    System.out.println("O valor final é R$ "+apple+".");
                
                }
    }
    
}
