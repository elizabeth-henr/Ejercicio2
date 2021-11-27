
package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {

    public static void main(String[] args) throws IOException {
        String nombre;
        String significado;
        String clasificacion;

        Tree arbol = new Tree();
        
        arbol.insert("algoritmo", "Conjunto ordenado y finito de operaciones que permite hallar la solución de un problema.", "sustantivo");
        arbol.insert("nadar", "Dicho de una persona o de un animal: Trasladarse en el agua, ayudándose de los movimientos necesarios, y sin tocar el suelo ni otro apoyo.", "verbo");
        arbol.insert("profesor", "Persona que tiene por oficio enseñar una ciencia, un arte, una técnica, etc.", "sustantivo");
        arbol.insert("estudiar", "Ejercitar el entendimiento para alcanzar o comprender algo.", "verbo");
        arbol.insert("bailar", "Ejercitar el entendimiento para alcanzar o comprender algo.", "verbo");
        arbol.insert("teorema", "Proposición demostrable lógicamente partiendo de axiomas, postulados o de otras proposiciones ya demostradas.", "sustantivo");
        arbol.insert("dibujar", "Representar figuras de personas, animales o cosas en una superficie mediante líneas trazadas con los útiles e instrumentos adecuados, como lápiz, papel, carboncillo compás o regla, entre otros.", "verbo");

        while (true) {
            System.out.println("Ingrese la primera letra de la palabra segun la opcion:");
            System.out.print("(a)Agregar, (b)Buscar, (e)Eliminar, (m)Mostrar Arbol, (o)Ordenar:  ");
            int opc = getChar();
            switch (opc) {
                case 'a': // Insertar una palabra
                    System.out.print("Ingrese el nombre de la palabra: ");
                    nombre = getString();
                    System.out.print("Ingrese el significado de la palabra: ");
                    significado = getString();
                    System.out.print("Ingrese el clasificacion de la palabra: ");
                    clasificacion = getString();

                    arbol.insert(nombre, significado, clasificacion);  //inserta la palabra
                    break;
                case 'b':// buscar una palabra
                    System.out.print("Ingrese el nombre de la palabra a buscar: ");
                    nombre = getString();
                    Node found = arbol.find(nombre); //busca la palabra
                    if (found != null) { //si la encuentra entra aca
                        System.out.print("Encontrada: ");
                        found.displayNode(); //muestra la palabra
                        System.out.print("\n");
                    } else {//si no la encuentra entra aca
                        System.out.println("No se encontró");
                    }
                    break;
                case 'e': // eliminar una palabra
                    System.out.print("Ingrese el nombre de la palabra a eliminar: ");
                    nombre = getString();
                    boolean didDelete = arbol.delete(nombre);//busca la palabra y la elimina
                    if (didDelete) { //si se encontro y elimno la palabra entra aca
                        System.out.print("Se eliminó " + nombre + '\n');
                    } else {//si la palabra no se encontro entra aca
                        System.out.println("No se encontro");
                    }
                    break;
                case 'm':// mostrar el arbol
                    arbol.displayTree();//muestra el arbol
                    break;
                case 'o': //ordenar de 3 formas distinta las palabras
                    System.out.print("Tipo de orden: In-Order ");
                    arbol.traverse(2);
                    break;
                default:
                    System.out.println("Opcion no encontrada\n");
            }  // end switch
        }  // end while
    }  // end TreeApp()
// -------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
// -------------------------------------------------------------

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
//-------------------------------------------------------------

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

}
////////////////////////////////////////////////////////////////