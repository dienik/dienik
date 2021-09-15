package lista4;
    import java.util.Scanner;
    import java.util.Arrays;
public class Lista4 {
     public static void main(String[] args) {
         Scanner nota = new Scanner (System.in);
         
         int[] notas = new int [7];
         int cont = 0;
         double media;
         int alta = 0;
         for (int i=0; i<7; i++){
             System.out.println("Informe a "+(i+1)+"°nota: ");
             notas [i] = nota.nextInt(); 
             cont = notas[i]+cont;
             if (notas[i] > alta){
                 alta = notas[i];

             }
         }
         
         media = cont/7;
         System.out.println("A media das notas é: "+media+".");
         System.out.println("A nota mais alta é: "+alta+".");
          for(int i=0;i<notas.length;i++) {

         notas[i]=-notas[i];
}
    Arrays.sort(notas);
    for(int i=0;i<notas.length;i++) {
    notas[i]=-notas[i]; 
        System.out.println(notas[i]);
}
                  }
   

         }
         
            
