
package com.mycompany.singlylinkedlist;

/**
 *
 * @author ariana
 */




class Node {
    public int data;
    public Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}






public class LinkedList {
    private Node head;
    private Node tail;
    
    public LinkedList(){
        head = null;
        tail = null;
    }
    
    public void append(Node newNode){
        if(head == null){
            head = newNode;
            tail = newNode;
            
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public void prepend (Node newNode){
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAfter (Node currentNode, Node newNode){
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else if(currentNode == tail){
            tail.next = newNode;
            tail = newNode;
        }
        else{
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }
    
    public void removeAfter(Node currentNode){
        if(currentNode == null && head != null){
            Node succeedingNode = head.next;
            head = succeedingNode;
            if (succeedingNode == null){
                tail = null;
            }
        }
        else if(currentNode.next !=null){
            Node succeedingNode = currentNode.next.next;
            currentNode.next = succeedingNode;
            if(succeedingNode == null)
                tail = currentNode;
        }
    }
        static boolean isPrime(int n) {
    // Corner cases
    if (n <= 1)
        return false;
    if (n <= 3)
        return true;
 
    // This is checked so that we can skip
    // middle five numbers in below loop
    if (n % 2 == 0 || n % 3 == 0)
        return false;
 
    for (int i = 5; i * i <= n; i = i + 6)
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
 
    return true;
}
    
  public void printPrimeNumbers() {
    Node node = head;
    while (node != null) {
        
        if (isPrime(node.data)) {
            System.out.print(node.data + " ");
        }
        node = node.next;
    }
    System.out.println();
}

   
public void printDigit3() {
    Node node = head;
    while (node != null) {
        if (isPrime(node.data) && hasDigitThree(node.data)) {
            System.out.print(node.data + " ");
        }
        node = node.next;
    }
    System.out.println();
}

private boolean hasDigitThree(int num) {
    while (num != 0) {
        if (num % 10 == 3) {
            return true;
        }
        num /= 10;
    }
    return false;
}

public int printSum(){
Node node = head;


if(node == null){
    return 0;
}
int sum = 0;
while (node!= null){
    sum = sum +node.data;
    node = node.next;
}
System.out.print(sum);
return sum;

}


}


    

    

    

                
      
