import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
    Scanner teclado;
    teclado = new Scanner(System.in);
    double A,B,C,pesoA,pesoB,pesoC,resultA,resultB,resultC,media;

    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();

    pesoA = 2;
    pesoB = 3;
    pesoC = 5;

    resultA = A * pesoA;
    resultB = B * pesoB;
    resultC = C * pesoC;


    media = (resultA + resultB + resultC) / 10;

    System.out.printf("MEDIA = %.1f\n", media);

    }
}