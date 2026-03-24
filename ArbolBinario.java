public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // Método principal para insertar
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    // Método recursivo para ubicar el nodo en el lugar correcto
    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }

        return actual; // Retorna el nodo sin cambios si ya existe
    }

    // Método principal para el recorrido inorden
    public void mostrarInorden() {
        System.out.print("Recorrido Inorden: ");
        inordenRecursivo(raiz);
        System.out.println();
    }

    // Método recursivo para inorden (Izquierda -> Raíz -> Derecha)
    private void inordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inordenRecursivo(nodo.derecho);
        }
    }

    // Método principal para buscar
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    // Método recursivo para buscar un valor
    private boolean buscarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return false; // No se encontró
        }
        if (valor == actual.valor) {
            return true; // Se encontró
        }

        // Si el valor es menor, busca en la izquierda. Si es mayor, en la derecha.
        return valor < actual.valor
                ? buscarRecursivo(actual.izquierdo, valor)
                : buscarRecursivo(actual.derecho, valor);
    }
}
