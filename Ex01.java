package ex01;
import  java.util.Scanner ;
public class Ex01 {
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    int nota1, nota2;
    int media;
        System.out.println("Digite sua 1ª nota");
            nota1 = ent.nextInt();
        System.out.println("Digite sua 2ª nota");
            nota2 = ent.nextInt();
        media = (nota1 + nota2) / 2;
        // se não houvesse o parentese aqui, a nota 2 seria divida por 2 e 
        // a nota 1, o que prejudicaria o código
        System.out.println("A média do aluno é: " + media);
             if( (media >= 6) ){
                System.out.println("Sprovado");
              } else if(media < 6){
                System.out.println("Reprovado");
    }
    } 
}
