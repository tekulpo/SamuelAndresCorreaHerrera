package SamuelAndresCorreaHerrera;

import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjTeatro[] LlenarMatriz(ObjTeatro[] m) {

        ObjTeatro o = new ObjTeatro(0, null, 0, 0);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Ingrese el numero de serie del boleto");
                o.setNumserie(sc.nextInt());
                System.out.println("Ingrese el nombre de el comprador del boleto");
                o.setNombre(sc.next());
                m[i]= o; 
            }
        }
        return m;
    }

    public void MostrarMatriz(ObjTeatro[] m) {

        for (int i = 0; i < m.length; i++) {
             

                System.out.println("Este es su numero de serie: \n" + m[i].getNumserie() + " y el comprador= " + m[i].getNombre());

            

        }

    }

}
