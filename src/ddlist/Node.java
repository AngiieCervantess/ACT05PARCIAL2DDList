/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddlist;

/**
 *
 * @author Angelica
 */
public class Node <T> { 

    
//instanseamos <T> para que sea de cualquier tipo de dato.

    T data;
    Node next;
    Node previous;
    /*
    Constructor
    */
    public Node(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
    
     //Métodos
    
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
    public void setNext(Node n){
        this.next = n;
    }
    public Node getNext(){
        return this.next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
