package Entrada;

import java.util.Scanner;

class Entrada {
    static Scanner sc = new Scanner(System.in);

    public static int leerEntero() {
        int num = 0;
        num = sc.nextInt();
        sc.nextLine();//para limpia el buffer
        return num;

    }

    public static String leerString(){
        String msg="";
        msg=sc.nextLine();
        return msg;
    }
}