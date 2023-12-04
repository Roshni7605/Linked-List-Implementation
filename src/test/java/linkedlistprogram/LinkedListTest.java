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

    @Test
    public void given3Numbers_WhenInsertedBetweenTwoNumberToLinkedList_ShouldPassTheResult(){
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(firstNode);
        linkedList.append(thirdNode);
        linkedList.insertBetween(firstNode, secondNode);
        linkedList.displayNode();
        boolean result = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenDeletedFromLinkedList_ShouldBeDeletedFromHead(){
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.displayNode();
        linkedList.pop();
        System.out.println("After deleting from head");
        linkedList.displayNode();
        boolean result = linkedList.head.equals(secondNode) &&
                linkedList.head.getNext().equals(thirdNode) &&
                linkedList.tail.equals(thirdNode);

        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenDeletedFromLinkedList_ShouldBeDeletedFromTail(){
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        linkedList.displayNode();
        linkedList.popLast();
        System.out.println("After deleting from tail");
        linkedList.displayNode();
        boolean result = linkedList.head.equals(thirdNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(secondNode);
        Assert.assertTrue(result);
    }


}
