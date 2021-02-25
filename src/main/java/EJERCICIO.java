import com.sun.jdi.PathSearchingVirtualMachine;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.stream.Stream;

public class EJERCICIO {

    public static void main(String[] args) {
        int num =150;
        System.out.println(num);



        int numeroDecimal=10;
        System.out.println("numero decimal: "+numeroDecimal);

        int numeroOctal= 012;
        System.out.println("numero oactal:"+numeroOctal);

        int numeroHexagecimal= 0xa;
        System.out.println("numero hrxsdecimal:"+numeroHexagecimal);

        int numeroBinario= 0b1010;
        System.out.println("numero binario:"+numeroBinario);
//CHAR

        System.out.println("bit tipo char"+Character.SIZE);
        System.out.println("byte tipo char " +Character.BYTES);
        System.out.println("valor minimo tipo char"+Character.MIN_VALUE);
        System.out.println("valñor maximo tipo char "+ Character.MAX_VALUE);

        // BOOLEAN

        boolean booleanVar= true;

        if (booleanVar) {
            System.out.println("ok");
        }else{
            System.out.println("error");}


        String edad ="34.141516";
       // System.out.println(1+Integer.parseInt(edad));
        System.out.println(1+Double.parseDouble(edad));
// seleccionar un carcater de la variable String y pasarlo a char
        String v ="camila";
        System.out.println(v.charAt(4));
// hacemos ingreso por consola con scanner
        System.out.println("ingrese el valor deseado");
        var valIn= new Scanner(System.in);
        int valor= Integer.parseInt(valIn.nextLine());
        System.out.println( valor+2 );

        System.out.println(valIn.nextLine().charAt(1));
//pasar de entrero o cualquiera a string
        System.out.println(String.valueOf(25)+23);


    }
}
