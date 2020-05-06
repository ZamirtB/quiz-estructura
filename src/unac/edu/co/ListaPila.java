package unac.edu.co;
public class ListaPila {
    private Nodo cima;
    public ListaPila() {
        cima = null;
    }
    public boolean pilaVacia() {
        return cima == null;
    }
    public void insert(Object elemento) {
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        nuevo.sig = cima;
        cima = nuevo;
    }
    public Object quitar() throws Exception {
        if (pilaVacia())
            throw new Exception("No se puede extraer, pila vacia.");
        Object hz = cima.element;
        cima = cima.sig;
        return hz;
    }
    public Object cimaPila() throws Exception {
        if (pilaVacia())
            throw new Exception("No se puede leer cima, pila vacia.");
        return cima.element;
    }
    public void limpiarPila() {
        Nodo z;
        while (!pilaVacia()) {
            z = cima;
            cima = cima.sig;
            z.sig = null;
        }
    }
}
