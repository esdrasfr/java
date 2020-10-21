import java.util.Scanner;
    public class Uri1134{
        public static void main(String arg[]){

        Scanner teclado = new Scanner(System.in);

        int x,alc,gas,dis,fim;

        alc=0;
        gas=0;
        dis=0;

        do{
            x = teclado.nextInt();
            
            if (x == 1){
                alc++;
                System.out.printf("Alcool: ", +alc);
            }

            else if (x == 2){
                gas++;
            }

            else if (x == 3){
                dis++;
            }

            else if (x != 1 || x!= 2 || x != 3 || x !=4){
                x = teclado.nextInt();
            }
        
        }
        while ( x == 4 );{
            System.out.println("Muito obrigado");



        }

        }

    }

    
    
