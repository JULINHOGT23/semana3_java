package gt;
import java.util.Scanner;

public class Gt {

    public static void main(String[] args) {
       Scanner numero = new Scanner(System.in);

     System.out.println("ingrese el numero a mostrar: ");

     int n1 = numero.nextInt();

     int sum = 0;
     int j = 0;

     while(j<=n1){
       if (j % 2 == 0){
        sum = sum + j;

       System.out.println("Numero par: "+j);
     

      }

       j ++;
    
    }
System.out.println("la suma es: "+sum);

    }
    }
