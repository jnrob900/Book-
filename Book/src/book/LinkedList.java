/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author jnrob
 */


    class queue 
    {

        public queue() 
        {
        }
    }

class ListEmptyException extends Exception
{
public ListEmptyException(String s)
{
super(s);
}
}

class ListException extends Exception
{
public ListException(String s)
{
super(s);
}
}

class Node<T>
{
   T data;
   Node<T> next;
   Node(T data)
   {
       this.data = data;
       this.next = null;
   }
}


public class LinkedList<T>
{
   private Node<T> head;
   private Node<T> tail;
   private int size;
  
  
   LinkedList() 
   {
       head=tail=null;
       size = 0;
   }
  
   int size()
   {
       return size;
   }
  
   void push_back(T data)
   {
       Node<T> new_node = new Node<>(data);
       if(head==null) 
       {
           head = tail = new_node;
       }
      
       tail.next = new_node;
       tail = new_node;
       size++;
   }
  
   void push_front(T data)
   {
       Node<T> new_node = new Node<>(data);
       if(head==null) {
           head = tail = new_node;
       }
      
       new_node.next = head;
       head = new_node;
       size++ ;
   }
  
   T pop_back() throws ListEmptyException 
   {
       if(head == null)
           throw new ListEmptyException("Empty List.");
      
       Node<T> temp = head;
      
       if(head == tail)
       {
           head=tail=null;
           return temp.data;
       }
      
       while(temp.next != tail)
       {
           temp = temp.next;
       }
      
       T data = tail.data;
       tail = temp;
      
       return data;
   }
  
   T pop_front() throws ListEmptyException
   {
       if(head == null)
           throw new ListEmptyException("Empty List.");
      
       T data = head.data;
      
       if(head == tail)
       {
           head=tail=null;
           return data;
       }
      
      
      
       head = head.next;
      
       return data;
   }
  
   T at(int n) throws ListException
   {
       if(n < 1 || n>size)
           throw new ListException("Index out of bounds.");
      
       Node<T> temp = head;
      
       while(n > 1) {
           temp = temp.next;
           n--;
       }
      
       return temp.data;
   }
  
   T front() 
   {
       return head.data;
   }
  
   T back() 
   {
       return tail.data;
   }
  
   void printAll() 
   {
       Node<T> temp = head;
      
       while(temp != tail.next) 
       {
           System.out.print(temp.data + " ");
           temp = temp.next;
       }
       System.out.println();
   }
  
   public static void main(String[] args) throws ListException, ListEmptyException
   {
      
       LinkedList<Integer> L = new LinkedList<>();
       L.push_front(1);
       L.push_front(0);
       L.push_back(2);
       L.push_back(3);
      
       System.out.print("List: "); L.printAll();
       System.out.println("Size: " + L.size());
       System.out.println("Front: " + L.front());
       System.out.println("Back: " + L.back());
       System.out.println("At 2: " + L.at(2));
       System.out.println("Pop from front: "+ L.pop_front());
       System.out.println("Pop from back: " + L.pop_back() + "\n");
       System.out.print("List: "); L.printAll();
      
   }
  
}
    
  
   
   
