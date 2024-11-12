/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Wrld
 */
public class Queue {
    
    private Node first; 
    private Node last; 
    private int size; 

    
    public Queue() {
        this.first = null; // Inicializa el primer nodo como null
        this.size = 0; // Inicializa el tamaño de la cola como 0
    }

    // Método para obtener el primer nodo de la cola
    public Node getFirst() {
        return first;
    }

    // Método para establecer el primer nodo de la cola
    public void setFirst(Node first) {
        this.first = first;
    }


    public int getSize() {
        return size;
    }

   
    public void setSize(int size) {
        this.size = size;
    }

    // Método para obtener el último nodo de la cola
    public Node getLast() {
        return last;
    }

    // Método para establecer el último nodo de la cola
    public void setLast(Node last) {
        this.last = last;
    }
    
    // Método que verifica si la cola está vacía
    public boolean empty() {
       return getFirst() == null; // Retorna true si el primer nodo es null
    }
    
    // Método para agregar un elemento a la cola (encolar)
    public Node encolar(Character element) {
        Node nuevo = new Node(element); // Crea un nuevo nodo con el elemento
        if (empty()) { // Si la cola está vacía
            setFirst(nuevo); // Establece el nuevo nodo como el primero
            setLast(nuevo); // Establece el nuevo nodo como el último
        } else { // Si la cola no está vacía
            getLast().setNext(nuevo); // Conecta el último nodo con el nuevo nodo
            setLast(nuevo); // Actualiza el último nodo
        }
        size++; // Incrementa el tamaño de la cola
        return nuevo; // Retorna el nuevo nodo
    }
    
    // Método para eliminar un elemento de la cola (desencolar)
    public Node desencolar() {
        if (!empty()) { // Si la cola no está vacía
            Node pointer = getFirst(); // Guarda el primer nodo
            setFirst(pointer.getNext()); // Actualiza el primer nodo al siguiente
            // pointer.setNext(null); // (Comentado) Desconecta el nodo eliminado
            size--; // Decrementa el tamaño de la cola
            return pointer; // Retorna el nodo eliminado
        }
        return null; // Retorna null si la cola está vacía
    }
}
