package ex06;
import java.time.LocalDate;
import java.util.Scanner;
// para não precisar perguntar o ano atual, irei usar as bibliotecas do java
public class Ex06 {
    public static void main(String[] args) {
    
Scanner ent = new Scanner(System.in);
int ano;
int datanasc;
int idade;
int idademin;
int anofalta;
//para melhorar o exercicio no caso do elsif, podemos ver os anos que faltam ainda
ano = LocalDate.now().getYear();
// através disso, a variavel ano recebe o ano atual
System.out.println("Digite o ano que você nasceu: ");
datanasc = ent.nextInt();
idade = (ano - datanasc );
        if ((idade >= 16)) {
        System.out.println("Você tem "+idade+" anos, portanto, é seu dever votar.");
        }else if (idade < 16){
            anofalta = (16 - idade);
            
System.out.println("Voce só tem "+idade+ " anos, ainda faltam "+anofalta+" anos para vocÊ poder votar.");
        }
       
}
}
