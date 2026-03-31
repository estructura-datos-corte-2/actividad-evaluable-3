public class Verificador {

    public static void verificar(String texto) {
        Pila pila = new Pila();

        int linea = 1;
        int columna = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            columna++;

            if (c == '\n') {
                linea++;
                columna = 0;
                continue;
            }

            if (c == '(' || c == '{' || c == '[') {
                pila.push(String.valueOf(c), linea, columna);
            }

            if (c == ')' || c == '}' || c == ']') {

                if (pila.isEmpty()) {
                    System.out.println("Error: símbolo de cierre sin apertura en línea " 
                        + linea + ", columna " + columna);
                    return;
                }

                Nodo abierto = pila.pop();

                if (!coincide(abierto.simbolo.charAt(0), c)) {
                    System.out.println("Error: símbolo no coincide en línea " 
                        + linea + ", columna " + columna);
                    return;
                }
            }
        }

        if (!pila.isEmpty()) {
            Nodo restante = pila.pop();
            System.out.println("Error: símbolo sin cerrar '" 
                + restante.simbolo + "' en línea " 
                + restante.linea + ", columna " + restante.columna);
        } else {
            System.out.println("✔ Expresión correcta");
        }
    }

    private static boolean coincide(char abierto, char cerrado) {
        return (abierto == '(' && cerrado == ')') ||
               (abierto == '{' && cerrado == '}') ||
               (abierto == '[' && cerrado == ']');
    }
}