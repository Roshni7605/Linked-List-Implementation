package linkedlistprogram;

public class Node<K> implements INode<K> {

    private K key;
    private INode<K> next;

    public Node(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = (Node<K>) next;
    }


}
