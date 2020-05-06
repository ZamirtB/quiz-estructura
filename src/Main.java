import unac.edu.co.ListaCola;
import unac.edu.co.ListaPila;

import java.io.File;
import java.util.Scanner;
public class Main {
    static Scanner entrada;
    private static ListaPila leerImprimirLinea() {
        ListaPila pila;
        pila = new ListaPila();
        String s = entrada.nextLine();
        System.out.println("\n" + s);
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            int y = Integer.parseInt(Character.toString(t));
            pila.insert(y);
        }
        return pila;
    }
    public static void main(String[] a) {
        ListaPila pila[] = new ListaPila[2];
        ListaCola cola[] = new ListaCola[1];
        Integer x, y, z, b, t, g;
        try {
            pila[1] = new ListaPila();
            pila[2] = new ListaPila();
            cola[1] = new ListaCola();
            b = 0;
            entrada = new Scanner(new File("entrada.txt"));
            pila[1] = leerImprimirLinea();
            pila[2] = leerImprimirLinea();
            System.out.println("Elementos de la Pila: ");
            while (!pila[1].pilaVacia() || !pila[2].pilaVacia()) {
                x = (Integer) pila[1].quitar();
                System.out.print(x + " ");
                y = (Integer) pila[2].quitar();
                System.out.print(y + " ");
                t = x + y;
                t = t + b;
                if (t > 9) {
                    String h = Integer.toString(t);
                    g = Integer.parseInt(Character.toString(h.charAt(0)));
                    Integer i = Integer.parseInt(Character.toString(h.charAt(1)));
                    cola[1].insertar(i);
                    b = g;
                } else {
                    cola[1].insertar(t);
                    b = 0;
                }
            }
            if (b > 0) {
                cola[1].insertar(b);
            }
            System.out.println(" ");
            while (!cola[1].coVacia()) {
                z = (Integer) cola[1].quitar();
                System.out.print(z + " ");
            }
        } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }
    }
}

