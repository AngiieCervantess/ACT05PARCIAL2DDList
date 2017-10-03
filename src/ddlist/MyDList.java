/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddlist;

/**
 *
 * @author Angelica
 * @param <T>
 */

    public class MyDList <T> { //no me marca error porque el <T> me agarra cualquier tipo de dato, es genérico

    private Node first;
    private Node last;

    public MyDList() {
    this.first = null;
    this.last = null;    
    }
    
    
    public void insertFirst(T d) {
    Node node = new Node(d);
    if (isEmpty()) {// está vacía
    first = node;//apuntador hacia el  node
    last = node;//apuntador hacia el  node
    } else {
    node.setNext(first);
    first.setPrevious(node);
    first = node;  }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void insertLast(T n) {
    Object d = null;
    Node node = new Node(d);
    if (isEmpty()) {// está vacía
    first = node;//apuntador hacia el  node
    last = node;//apuntador hacia el  node
    } else {
    Node aux = fetchBack();
    aux.setNext(node);
    node.setPrevious(aux);    }
    }
    

    public void deleteFirst() {
    if (isEmpty()) {
    System.out.print("La lista no tiene elementos");
    } else {
    Node pivot = first;
    pivot.getNext().setPrevious(null);
    first = first.getNext();  }
    }

    public void deleteLast() {
    if (isEmpty()) {
    System.out.print("La lista no tiene elementos");
    } else {
    Node pivot = first;
    while (pivot.getNext().getNext() != null) {
    pivot = pivot.getNext();  }
    pivot.setNext(null); }
    }
    
    public void deleteNode(T data){
    if (isEmpty()) {
    System.out.print("La lista no tiene elementos");
    } else {
    Node pivot = first;
    while(!pivot.getData().equals(data)){
    pivot= pivot.getNext();   }
    if(pivot == first){
    deleteFirst();
    }else{
    if(pivot.getNext()== null){
    pivot.getPrevious().setNext(null);
    }else{
    Node pointer = pivot.getPrevious();
    Node post = pivot.getNext();
    pointer.setNext(post);
    post.setPrevious(pointer); }
    }
    pivot.setNext(pivot.getNext()); }
    }


    public void showListFL() {
    if (!isEmpty()) {
    Node pivot = first;
    while (pivot != null) {
    System.out.println(pivot.getData());
    pivot = pivot.getNext(); }
    } else {
    System.out.print("La lista no tiene elementos");}
    }
    
    private Node fetchBack() {
    Object d = null;
    Node node = new Node(d);
    Node pivot = first;
    while (pivot.getNext() != null) {
    pivot = pivot.getNext();        }
    return pivot;
    }

    public void showListLF() {
    if (!isEmpty()) {
    Node pivot = fetchBack();
    while (pivot != null) {
    System.out.println(pivot.getData());
    pivot = pivot.getPrevious();  }
    } else {
    System.out.print("La lista está vacía"); }
    }
    
    
    
    
    
}
        
        
        
        
        
    