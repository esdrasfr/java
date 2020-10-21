import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){

    Scanner teclado;
    teclado = new Scanner(System.in);

    int num,qtdPares,qtdImpares,qtdPos,qtdNeg;

        qtdPares = 0;
        qtdImpares = 0;
        qtdPos = 0;
        qtdNeg = 0;

        for (int cont=1; cont<=5; cont++){
            num = teclado.nextInt();
            if (num % 2 == 0) {
            qtdPares ++;
            }

            else{
            qtdImpares ++;
            }
            
            if (num < 0){
            qtdNeg ++;
            }

            else if ( num > 0 ) {
            qtdPos ++;
            }
        }
    System.out.println(qtdPares + " valor(es) par(es)");
    System.out.println(qtdImpares + " valor(es) impar(es)");
    System.out.println(qtdPos + " valor(es) positivo(s)");
    System.out.println(qtdNeg + " valor(es) negativo(s)");
    }
}