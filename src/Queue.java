public class Queue<Item> {
    private Node<Item> first;
    private Node<Item> last;
    private int n;
    private  class Node<Item>{
        private Item item;
        private Node<Item> next;
    }
    Queue(){
        first = null;
        last = null;
        n = 0;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public int size(){
        return n;
    }
   public Item peek(){
        return first.item;
   }
   public void enqueue(Item item){
       Node<Item> oldlast=last;
       last=new Node<Item>();
       last.item=item;
       last.next=null;
       if(isEmpty()){
            first = last;
       }else{
       oldlast.next=last;
       }
       n++;
   }
   public Item dequeue(){
       Item item=first.item;
       first=first.next;
       n--;
       if(isEmpty()){
           last = null;
       }
       return item;
}

    @Override
    public String toString() {
        return "Queue{" +
                "first=" + first +
                ", last=" + last +
                ", n=" + n +
                '}';

    }

    public static void main(String[] args) {
        Queue<Double> queue=new Queue<>();
        queue.enqueue(5.4);
        System.out.println(queue.peek());
        queue.enqueue(5.2);
        queue.dequeue();
        System.out.println(queue.peek());
        queue.enqueue(5.7);
        queue.dequeue();
        System.out.println(queue.peek());
        queue.enqueue(7.6);
        queue.dequeue();
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.dequeue();
        System.out.println(queue.size());
    }

}
