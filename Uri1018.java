import java.util.Scanner;

    public class Uri1018{
        public static void main(String args[]){
            Scanner teclado = new Scanner (System.in);

            int valor,notas100,notas50,resto50,notas20,resto20,notas10,resto10,notas5,resto5,notas2,resto2,notas1;
            
            valor = teclado.nextInt();

            notas100 = valor / 100;
            valor = notas100 % 100;
            notas50 = valor / 50;
            resto50 = notas50 % 50;
            notas20 = resto50 / 20;
            resto20 = notas20 % 20;
            notas10 = resto20 / 10;
            resto10 = resto20 % 10;
            notas5 = resto10 / 5;
            resto5 = resto10 % 2;
            notas2 = resto5 / 2;
            resto2 = notas2 % 1;
            notas1 = resto2;

            System.out.println(notas100+ " nota (s) de R$ 100,00");
            System.out.println(notas50+ " nota (s) de R$ 50,00");
            System.out.println(notas20+ " nota (s) de R$ 20,00");
            System.out.println(notas10+ " nota (s) de R$ 10,00");
            System.out.println(notas5+ " nota (s) de R$ 5,00");
            System.out.println(notas2+ " nota (s) de R$ 2,00");
                      




        }

    }