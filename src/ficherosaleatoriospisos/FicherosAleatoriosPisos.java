/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosaleatoriospisos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author a20pelayoar
 */
public class FicherosAleatoriosPisos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Piso> pisos = new ArrayList<>();

        Duplex duplexMaria = new Duplex("293839283928", "María Lorenzo", 20f, 0.6f, 0.9f);
        Atico aticoPedro = new Atico("0394829382", "Pedro Alonso", 10f, 5f, 0.5f);
        pisos.add(aticoPedro);
        pisos.add(duplexMaria);

        for (int i = 0; i < pisos.size(); i++) {
            if (pisos.get(i) instanceof Atico) {
                System.out.println(pisos.get(i).nomPropietario);
            } else {
                System.out.println(pisos.get(i).referencia);
            }
        }

    }
    
    
    public static void generarMenu(){
        Scanner scan = new Scanner(System.in);
    }

    public static Atico altaAtico() {
        Scanner scan = new Scanner(System.in);
        Atico atico = null;

        System.out.println("\tINTRODUZCA REFERENCIA:\n");
        String referencia = scan.nextLine();
        System.out.println("\tINTRODUZCA NOMBRE DE PROPIETARIO:\n");
        String nomPropietario = scan.nextLine();
        System.out.println("\tINTRODUZCA CUOTA DEL ATICO:\n");
        float cuotaAtico = scan.nextFloat();
        scan.nextLine();
        System.out.println("\tINTRODUZCA CUOTA DEL AGUA:\n");
        float agua = scan.nextFloat();
        scan.nextLine();
        System.out.println("\tINTRODUZCA CUOTA DE LA CALEFACCION:\n");
        float calefa = scan.nextFloat();
        scan.nextLine();
        atico = new Atico(referencia, nomPropietario,  cuotaAtico, agua, calefa);
                   
        
        return atico;

    }
    
    public static Duplex altaDuplex(){
        
        Scanner scan = new Scanner(System.in);
        Duplex duplex = null;

        System.out.println("\tINTRODUZCA REFERENCIA:\n");
        String referencia = scan.nextLine();
        System.out.println("\tINTRODUZCA NOMBRE DE PROPIETARIO:\n");
        String nomPropietario = scan.nextLine();
        System.out.println("\tINTRODUZCA CUOTA DEL ATICO:\n");
        float cuotaDuplex = scan.nextFloat();
        scan.nextLine();
        System.out.println("\tINTRODUZCA CUOTA DEL AGUA:\n");
        float agua = scan.nextFloat();
        scan.nextLine();
        System.out.println("\tINTRODUZCA CUOTA DE LA CALEFACCION:\n");
        float calefa = scan.nextFloat();
        scan.nextLine();
        duplex = new Duplex(referencia, nomPropietario, cuotaDuplex, agua, calefa);
                   
        
        return duplex;
    }

}
