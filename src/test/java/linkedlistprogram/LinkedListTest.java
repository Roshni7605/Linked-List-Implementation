package linkedlistprogram;

import org.junit.Assert;
import org.junit.Test;


public class LinkedListTest {

    @Test
    public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedToTop(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        linkedList.displayNode();
        boolean result = linkedList.head.equals(thirdNode) &&
                         linkedList.head.getNext().equals(secondNode) &&
                         linkedList.tail.equals(firstNode);
        Assert.assertTrue(result);
    }
}
