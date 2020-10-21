import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
    Scanner teclado;
    teclado = new Scanner(System.in);
    double A,B,pesoA,pesoB,resultA,resultB,media;

    A = teclado.nextFloat();
    B = teclado.nextFloat();

    pesoA = 3.5;
    pesoB = 7.5;

    resultA = A * pesoA;
    resultB = B * pesoB;

    media = (resultA + resultB) / 11;

    System.out.printf("MEDIA = %.5f\n", media);
    }
}