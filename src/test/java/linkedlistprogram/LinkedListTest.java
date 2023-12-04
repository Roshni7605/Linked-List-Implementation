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
        System.out.println("After performing adding operation");
        linkedList.displayNode();
        boolean result = linkedList.head.equals(thirdNode) &&
                         linkedList.head.getNext().equals(secondNode) &&
                         linkedList.tail.equals(firstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenAppendedToLinkedList_ShouldBeAddedToLast(){
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        System.out.println("After performing appending operation");
        linkedList.displayNode();
        boolean result = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }


}
