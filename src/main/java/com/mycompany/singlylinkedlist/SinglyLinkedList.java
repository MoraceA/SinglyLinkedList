/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.singlylinkedlist;

/**
 *
 * @author ariana
 */
public class SinglyLinkedList {

    public static void main(String[] args) {
      LinkedList  numList = new LinkedList();
      Node nodeA = new Node (20);
      Node nodeB = new Node (3);
      Node nodeC = new Node(13);
      Node nodeD = new Node (19);
      Node nodeE = new Node (23);
      Node nodeF = new Node (43);
      
      
      
      numList.append(nodeB);
      numList.append(nodeC);
      numList.append(nodeE);
      
      
      
     numList.prepend(nodeA);
     
     numList.insertAfter(nodeC, nodeD);
     numList.insertAfter(nodeE, nodeF);
     
     
     //prime numbers//
     System.out.print("List of prime nodes: ");
      numList.printPrimeNumbers();
     
      //digit 3//
System.out.print("Only numbers with digit 3: ");
numList.printDigit3();


//sum//

System.out.print(" The sum of all numbers with digit 3 is:  ") ;
numList.printSum();
      

      
      
      
      
      
      
      
      
      
      
      
      
      
      
             
}
    
}
