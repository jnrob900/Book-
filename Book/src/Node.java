
class Node<T>
{
   private Node<T> next; // A reference to the next Node(if any) in the chain of Nodes.
   private Node<T> prev; // A reference to the previous Node(if any) in the chain of Nodes.
   private T data; // data stored in current node

   // constructor creates a node with next and prev set to null
   public Node(T e)
   {
       data = e;
       next = null;
       prev = null;
   }
   // default constructor
   public Node()
   {
       data = null;
       next = null;
       prev = null;
   }
   // constructor with all parameters
   public Node(T e, Node<T> next, Node<T> prev)
   {
       data = e;
       this.next = next;
       this.prev = prev;
   }
   // getter functions
   public T getdata()
   {
       return data;
   }
   public Node<T> getNext()
   {
       return next;
   }
   public Node<T> getPrev()
   {
       return prev;
   }
  
   // setter functions
   public void setData(T e)
   {
       this.data = e;
   }
   public void setNext(Node<T> next)
   {
       this.next = next;
   }
   public void setPrev(Node<T> prev)
   {
       this.prev = prev;
   }
}