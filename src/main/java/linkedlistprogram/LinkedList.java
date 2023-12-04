package linkedlistprogram;

public class LinkedList<T> {

    public INode head;
    public INode tail;

    public LinkedList(INode head, INode tail) {
        this.head = head;
        this.tail = tail;
    }

    public LinkedList() {}

    public void add(INode newNode) {
        if(this.head == null){
            this.head = newNode;
        }
        if(this.tail == null){
            this.tail = newNode;
        }
        else {
            INode temp = this.head;
            this.head = newNode;
            this.head.setNext(temp);
        }
    }

    public void append(INode newNode) {
        if(this.head == null){
            this.head = newNode;
        }
        if(this.tail == null){
            this.tail = newNode;
        }
        else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insertBetween(INode node, INode newNode){
        INode temp = node.getNext();
        node.setNext(newNode);
        newNode.setNext(temp);
    }

    public INode pop(){
        INode temp = head;
        this.head = head.getNext();
        return temp;
    }

    public INode popLast(){
        INode temp = head;
        while (!temp.getNext().equals(tail)){
            temp = temp.getNext();
        }
        this.tail = temp;
        temp = temp.getNext();
        return temp;
    }

    public void displayNode(){
        StringBuffer nodes = new StringBuffer("My Nodes: ");
        INode temp = head;
        while(temp.getNext() != null){
            nodes.append(temp.getKey());
            if (!temp.equals(tail)){
                nodes.append(" -> ");
                temp = temp.getNext();
            }
        }
        nodes.append(temp.getKey());
        System.out.println(nodes);
    }
}
