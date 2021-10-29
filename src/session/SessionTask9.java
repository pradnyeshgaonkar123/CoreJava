package session;

public class SessionTask9 {

	public static void main(String[] args) {
		 DoublyLinkedList dllist = new DoublyLinkedList();  
	        //Add nodes to the list  
	        dllist.addNode(10);  
	        dllist.addNode(20);  
	        dllist.addNode(30);  
	        dllist.addNode(40);  
	        dllist.addNode(50);  
	 
	        dllist.printNodes();

	}

}

class DoublyLinkedList {    
  class Node{  
      int item;  
      Node previous;  
      Node next;  
 
      public Node(int item) {  
          this.item = item;  
      }  
  }  
  //Initially, heade and tail is set to null
  Node head, tail = null;  
 
  //add a node to the list  
  public void addNode(int item) {  
      //Create a new node  
      Node newNode = new Node(item);  
 
      if(head == null) {  
          head = tail = newNode;  
          //head's previous will be null  
          head.previous = null;  
          //tail's next will be null  
          tail.next = null;  
      }  
      else {  
          //add newNode to the end of list. tail->next set to newNode  
          tail.next = newNode;  
          //newNode->previous set to tail  
          newNode.previous = tail;  
          //newNode becomes new tail  
          tail = newNode;  
          //tail's next point to null  
          tail.next = null;  
      }  
  }  

  public void printNodes() {  
      Node current = head;  
      if(head == null) {  
          System.out.println("Doubly linked list is empty");  
          return;  
      }  
      System.out.println("Nodes of doubly linked list: ");  
      while(current != null) {  
          System.out.print(current.item + " ");  
          current = current.next;  
      }  
  }  
}