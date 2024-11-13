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
public class Node {
    
    private Character element;
    
    private Node next;

    public Node(Character element) {
        this.element = element;
        this.next = null;
    }

    public Character getElement() {
        return element;
    }

    public void setElement(Character element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}

