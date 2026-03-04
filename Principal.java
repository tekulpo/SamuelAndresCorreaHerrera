package SamuelAndresCorreaHerrera;

import java.util.Scanner;

public class Principal {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos M=new Metodos();
        int n = 0;
        System.out.println("ingrese la cantidad de numeros de serie");
        n = sc.nextInt();
        ObjTeatro[] m= new ObjTeatro[n];
        m = M.LlenarMatriz(m);
        M.MostrarMatriz(m);
        

    }
}
