
package ejercicio2;
//Cardenas_Franceska-Henríquez_Elizabeth
class Node
   {
   public String nombre;             // data item
   public String significado;           // data item
   public String clasificacion;      // data item
   public Node leftChild;         // this node's left child
   public Node rightChild;        // this node's right child

   public void displayNode()      // display ourself
      {
      System.out.print("{ nombre: ");
      System.out.print(nombre);
      System.out.print(", significado: ");
      System.out.print(significado);
      System.out.print(", clasificacion: ");
      System.out.print(clasificacion);
      System.out.print("} ");
      }
   }  // end class Node
////////////////////////////////////////////////////////////////
