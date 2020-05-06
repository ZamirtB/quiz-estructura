package unac.edu.co;
public class ListaCola {
    protected Nodo frente;
    protected Nodo siguien;
    public ListaCola() {
        frente = siguien = null;
    }
    public void insertar(Object elemen) {
        Nodo l;
        l = new Nodo(elemen);
        if (coVacia()) {
            frente = l;
        } else {
            siguien.sig = l;
        }siguien = l;
    }
    public Object quitar() throws Exception {
        Object hz;
        if (!coVacia()) {
            hz = frente.element;
            frente = frente.sig;
        } else
            throw new Exception("Cola vacía, elimina una");
        return hz;
    }
    public void borrarCola() {
        for (; frente != null;) {
            frente = frente.sig;
        }
        System.gc();
    }
    public Object frenteCola() throws Exception {
        if (coVacia()) {
            throw new Exception("Error: cola vacía");
        }
        return (frente.element);
    }
    public boolean coVacia() {
        return (frente == null);
    }
}
