
package lista4ex02;
import java.util.Scanner;
public class Lista4Ex02 {

    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        String[] nomes = new String[10];
        String nome1;
        for(int i=0; i<10; i++){
            System.out.println("Digite o "+(i+1)+" ° nome:  ");
            nomes[i] = ent.nextLine();
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i]);
            
            
        }
        
        
    }
    
}
