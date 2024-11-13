/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import Classes.Character;


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
        Node nuevo=new Node(element);
        if (empty()) {
            setFirst(nuevo);
            setLast(nuevo);
        
        }
        
        else {
           getLast().setNext(nuevo);
           setLast(nuevo);
        }
        size ++;
        return nuevo;
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
    public void subir_contador() {
        //se recorre la cola
        for (Node aux=getFirst(); aux!=null; aux=aux.getNext()) {
            if(aux.getElement().getCounter()<8){//si el contador es menor a 8 sube
                aux.getElement().setCounter(aux.getElement().getCounter()+1);//se suma 1 al contador 
               // System.out.println("contado nuevo: "+aux.getElement().getCounter()+" nombre "+aux.getElement().getName()+" id "+aux.getElement().getId() );
            }
            
            
        }
    
    }
    
     public int Buscar(Node element) {
        int index=0;
        
        for (Node aux=getFirst(); aux!=null; aux=aux.getNext()) {
            if(aux==element) {
                return index;
            }
            index++;
        }
        return -1;
    }
    
    public Node borrar(int index) {
        Node aux=getFirst();
        Node retornar=null;
        int count=0;
        if (index!=0) {
        while(aux.getNext()!=null && count!=(index-1)) {
            aux=aux.getNext();
            count++;
        }
        
        if(aux.getNext()!=null) {
            retornar=aux.getNext();
            aux.setNext(aux.getNext().getNext());
        
        }
        
        } 
        
        return retornar;
    }
    
    public String imprimir() {
        String contenido="id:\n";
        for (Node aux=getFirst(); aux!=null; aux=aux.getNext()) {
            contenido+=aux.getElement().getId()+"\n";
            //System.out.println(aux.getElement().getId()+" "+aux.getElement().getName() +" "+aux.getElement().getObject());
        }
        return contenido;
    }
}
