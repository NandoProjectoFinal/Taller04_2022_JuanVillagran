package dominio;

import java.util.Scanner;

public class verificarrut {

    public static String guionK(int rut) {
        int a = digitoVerificador(rut);
        String b = "" + a;
        if (a == 10) {
            b = "k";
        }
        if (a == 11) {
            b = "0";
        }
        return b;
    }

    public static int digitoVerificador(int r) {
        int a = suma(multiplicador(arreglorut(inverso(r))));
        int b = division(a) * 11;
        return (11 - resta(a, b));
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int division(int a) {
        int b = a / 11;
        return b;
    }

    public static int suma(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }
        return a;
    }

    public static int[] multiplicador(String[] arreglorut) {
        int[] arr = new int[arreglorut.length];
        int a = 2;
        for (int i = 0; i < arreglorut.length; i++) {
            if (a > 7) {
                a = 2;
            }
            arr[i] = Integer.parseInt(arreglorut[i]) * a;
            a++;
        }
        return arr;
    }

    public static int inverso(int c) {
        String a = c + "";
        StringBuilder b = new StringBuilder(a);
        a = b.reverse().toString();
        return Integer.parseInt(a);
    }

    public static String[] arreglorut(int rut) {
        String a = "" + rut;
        String[] arr = a.split("");
        /* for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"]");
        }*/
        return arr;
    }


    public static int rut() {
        int b = 0;
        do {
            String a = ingresarsinguion();
            if (validador(a) == true) {
                b = Integer.parseInt(a);
            }
        } while (b == 0);
        return b;
    }

    public static boolean validador(String x) {
        boolean y;
        try {
            Integer.parseInt(x);
            y = true;
        } catch (Exception e) {
            System.out.println("Caracteres no Validos");
            y = false;
        }
        return y;
    }

    public static String ingresarsinguion() {
        System.out.println("Ingrese su rut sin guion");
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }


}
// inverso() = recibe un parametro de tipo int y lo que hace es obtener ese numero y darlo vuelta con funciones de String
// rut() = obtiene un string para poder validarlo usamos un try catch para que no frene el codigo y con un ciclo para que ingrese un datp validado
// Validador() = recibe el string y si es posible trabajar el dato en forma de int se devuelve un true en el caso de que no un false
// ingresarsinguion() = permite ingresar un dato que sera analizado mas adelante.
// arreglorut() = se ingresa un dato validado y este se transforma en un arreglo que permitira obtener cada numero de este.