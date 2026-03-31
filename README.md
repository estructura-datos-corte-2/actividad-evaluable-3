# actividad-evaluable-
# Verificador de Símbolos con Pila en Java

## Descripción

Este proyecto implementa un verificador de símbolos utilizando una estructura de datos tipo pila (stack).

El programa analiza un texto y valida que los símbolos de apertura y cierre estén correctamente balanceados:

* Paréntesis: ( )
* Llaves: { }
* Corchetes: [ ]

Además, reporta errores indicando la línea y columna donde ocurren.

---

## Objetivo

Aplicar el uso de estructuras de datos (pilas) para resolver problemas de validación sintáctica, similares a los utilizados en compiladores.

---

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

### Nodo.java

Representa un elemento de la pila.

Contiene:

* símbolo
* línea
* columna
* referencia al siguiente nodo

---

### Pila.java

Implementa la estructura de datos tipo pila (LIFO).

Métodos principales:

* push(): Inserta un elemento
* pop(): Elimina el elemento superior
* peek(): Consulta el elemento superior
* isEmpty(): Verifica si la pila está vacía

---

### EmptyStackException.java

Excepción personalizada que se lanza cuando se intenta hacer pop o peek en una pila vacía.

---

### Verificador.java

Contiene la lógica principal del programa.

Funciones:

* Recorre el texto carácter por carácter
* Identifica símbolos de apertura y cierre
* Valida coincidencias usando la pila
* Reporta errores con ubicación exacta

---

## Funcionamiento

1. Se recorre el texto carácter por carácter.
2. Si se encuentra un símbolo de apertura, se almacena en la pila.
3. Si se encuentra un símbolo de cierre:

   * Se verifica que la pila no esté vacía.
   * Se compara con el último símbolo insertado.
4. Si no coinciden, se genera un error.
5. Al finalizar:

   * Si la pila está vacía, la expresión es correcta.
   * Si no, existen símbolos sin cerrar.

---

## Tipos de errores detectados

* Cierre sin apertura
* Símbolos mal emparejados
* Símbolos sin cerrar

---

## Ejemplo de uso

Entrada válida:

```
{ [ ( ) ] }
```

Salida:

```
Expresión correcta
```

Entrada inválida:

```
{ [ ( ] ) }
```

Salida:

```
Error: símbolo no coincide en línea X, columna Y
```

---

## Requisitos

* Java JDK 8 o superior
* Editor o entorno de desarrollo (Eclipse, IntelliJ, VS Code)

---

## Ejecución

1. Compilar los archivos:

```
javac *.java
```

2. Ejecutar:

```
java Verificador
```

---

## Conceptos aplicados

* Estructuras de datos (pila)
* Listas enlazadas
* Manejo de excepciones
* Validación sintáctica

---

## Autor

Juan Camilo Puentes

---

## Notas

Este proyecto implementa una solución básica de validación sintáctica utilizando el principio LIFO (Last In, First Out), comúnmente aplicado en compiladores.
