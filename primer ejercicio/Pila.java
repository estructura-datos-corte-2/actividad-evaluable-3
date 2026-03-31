 public class Pila {
    private Nodo cima;

    public Pila(){
        cima = null;
    }

    public boolean isEmpty(){
        return cima == null; 
    }

    public void push(String simbolo, int linea, int columna){
        Nodo nuevo = new Nodo(simbolo, linea, columna);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Nodo pop() {
        if (isEmpty()) {
            throw new EmptyStackException("La pila está vacía");
        }

        Nodo temp = cima;
        cima = cima.siguiente;
        return temp;
    }

    public Nodo peek() {
        if (isEmpty()) {
            throw new EmptyStackException("La pila está vacía");
        }

        return cima;
    }
}
