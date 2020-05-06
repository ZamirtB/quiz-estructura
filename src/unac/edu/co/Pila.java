package unac.edu.co;
import java.io.File;
import java.util.Scanner;

public class Pila {
    static Scanner entrada;
    private static ListaPila leerImprimirLinea() {
        ListaPila pila;
        pila = new ListaPila();
        String line = entrada.nextLine();
        System.out.println("\n" + line);
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            int x = Integer.parseInt(Character.toString(c));
            pila.insert(x);
        }
        return pila;
    }
    private void insertar(Integer x) {
    }
    public static void main(String[] a) {
        ListaPila pila1;
        ListaPila pila2;
        ListaPila pila3;
        ListaCola cola1;
        ListaCola cola2;
        Integer x, y, z, f, t, g, l, e, v;
        try {
            pila1 = new ListaPila();
            pila2 = new ListaPila();
            pila3 = new ListaPila();
            cola1 = new ListaCola();
            cola2 = new ListaCola();
            f = 0;
            v = 0;
            entrada = new Scanner(new File("entrada.txt"));
            pila1 = leerImprimirLinea();
            pila2 = leerImprimirLinea();
            pila3 = leerImprimirLinea();
            System.out.println("Elementos de la Pila: ");
            while (!pila1.pilaVacia() || !pila2.pilaVacia()) {
                x = (Integer) pila1.quitar();
                System.out.print(x + " ");
                y = (Integer) pila2.quitar();
                System.out.print(y + " ");
                t = x + y;
                t = t + f;
                if (t > 9) {
                    String h = Integer.toString(t);
                    g = Integer.parseInt(Character.toString(h.charAt(0)));
                    Integer i = Integer.parseInt(Character.toString(h.charAt(1)));
                    cola1.insertar(i);
                    f = g;
                    e = (Integer) pila3.quitar();
                    l = e + i;
                    l = l + v;
                    if (l > 9) {
                        String o = Integer.toString(l);
                        Integer ñ = Integer.parseInt(Character.toString(o.charAt(0)));
                        Integer p = Integer.parseInt(Character.toString(o.charAt(1)));
                        cola2.insertar(p);
                        v = ñ;
                    } else {
                        cola2.insertar(l);
                        v = 0;
                    }
                } else {
                    cola1.insertar(t);
                    e = (Integer) pila3.quitar();
                    l = e + t;
                    l = l + v;
                    f = 0;
                    if (l > 9) {
                        String o = Integer.toString(l);
                        Integer ñ = Integer.parseInt(Character.toString(o.charAt(0)));
                        Integer p = Integer.parseInt(Character.toString(o.charAt(1)));
                        cola2.insertar(p);
                        v = ñ;
                    } else {
                        cola2.insertar(l);
                        v = 0;
                    }
                }
            }
            if (f > 0) {
                cola1.insertar(f);
            }
            System.out.println(" ");
            while (!cola1.coVacia()) {
                z = (Integer) cola1.quitar();
                System.out.print(z + " ");
            }
            System.out.println(" ");
            System.out.println("Resultados de la sumatoria:");
            System.out.println(" ");
            while (!cola2.coVacia()) {
                z = (Integer) cola2.quitar();
                System.out.print(z + " ");
            }

        } catch (Exception er) {
            System.err.println("Excepcion: " + er);
        }
    }
}