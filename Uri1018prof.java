import java.util.Scanner;

    public class Uri1018prof{
        public static void main(String args[]){
            Scanner teclado = new Scanner (System.in);

            int valorSaque;
            int q100, q50, q20, q10, q5, q2, q1;
                        
            valorSaque = teclado.nextInt();

            q100 = valorSaque / 100;

            resto = valorSaque % 100;   

            q50   = resto / 50;
            resto = resto % 50;

            q20   = resto / 20;
            resto = resto % 20;

            q10   = resto / 10;
            resto = resto % 10;

            q5    = resto / 5;
            resto = resto % 5;


            q2   = resto / 2;
            resto = resto % 2;

            q1   = resto;
            
            System.out.println(valorSaque);
            System.out.println(q100+ " nota (s) de R$ 100,00");
            System.out.println(q50+ " nota (s) de R$ 50,00");
            System.out.println(q20+ " nota (s) de R$ 20,00");
            System.out.println(q10+ " nota (s) de R$ 10,00");
            System.out.println(q5+ " nota (s) de R$ 5,00");
            System.out.println(q1+ " nota (s) de R$ 2,00");
                      




        }

    }